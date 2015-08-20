/*
 * Copyright (C) 2015 Uhlig e Korovsky Tecnologia Ltda - ME
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package br.com.uktech.bmt.service;

import br.com.uktech.bmt.bacula.BaculaConsole;
import br.com.uktech.bmt.bacula.BaculaConsoleFactory;
import br.com.uktech.bmt.bacula.bean.BaculaEstimate;
import br.com.uktech.bmt.bacula.bean.BaculaJobDefault;
import br.com.uktech.bmt.bacula.exceptions.BaculaAuthenticationException;
import br.com.uktech.bmt.bacula.exceptions.BaculaCommunicationException;
import br.com.uktech.bmt.bacula.exceptions.BaculaDirectorNotSupported;
import br.com.uktech.bmt.dto.bacula.BaculaEstimateDto;
import br.com.uktech.bmt.dto.bacula.BaculaFormEstimateDto;
import br.com.uktech.bmt.dto.bacula.BaculaJobDefaultDto;
import br.com.uktech.bmt.dto.model.director.DirectorDto;
import java.util.ArrayList;
import java.util.List;
import org.dozer.Mapper;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author João Paulo Siqueira <joao.siqueira@uktech.com.br>
 */
@Service("BaculaJobDefaultService")
public class BaculaJobDefaultServiceImpl implements BaculaJobDefaultService{
    
    private final org.slf4j.Logger logger = LoggerFactory.getLogger(BaculaClientServiceImpl.class);
    
    @Autowired
    private BaculaConsoleFactory consoleFactory;
    
    @Autowired
    private Mapper mapper;
    
    @Override
    public BaculaJobDefaultDto newJobDefault() {
        return new BaculaJobDefaultDto();
    }

    @Override
    public BaculaFormEstimateDto newFormEstimate() {
        return new BaculaFormEstimateDto();
    }
    
    @Transactional(readOnly = true)
    @Override
    public List<BaculaJobDefaultDto> getListJobDefault(DirectorDto baculadirdto) {
        List<BaculaJobDefault> jobsDefault = null;
        List<BaculaJobDefaultDto> jobsDefaultDto = new ArrayList<>();
        try{
            BaculaConsole console = consoleFactory.getConsole(baculadirdto.getName(), baculadirdto.getHostname(), baculadirdto.getPort(), baculadirdto.getPassword());
            if (console != null) {
                jobsDefault = console.getJobsDefault();
                if(jobsDefault!=null) {
                    for(BaculaJobDefault jobDefault : jobsDefault) {
                        BaculaJobDefaultDto jobDefaultDto = new BaculaJobDefaultDto();
                        mapper.map(jobDefault, jobDefaultDto);
                        jobsDefaultDto.add(jobDefaultDto);
                    }
                }
            }
        } catch (BaculaCommunicationException | BaculaAuthenticationException | BaculaDirectorNotSupported ex) {
            this.logger.error(ex.getLocalizedMessage());
            return null;
        }
        return jobsDefaultDto;
    }

    @Transactional(readOnly = true)
    @Override
    public BaculaEstimateDto getEstimate(DirectorDto baculadirdto, BaculaFormEstimateDto formEstimate) {
        BaculaEstimate estimate = null;
        BaculaEstimateDto estimateDto = new BaculaEstimateDto();
        try{
            BaculaConsole console = consoleFactory.getConsole(baculadirdto.getName(), baculadirdto.getHostname(), baculadirdto.getPort(), baculadirdto.getPassword());
            if (console != null) {
                estimate = console.getEstimate(formEstimate.getJob(), formEstimate.getType(), formEstimate.getAccurate(), formEstimate.getListing());
                if(estimate != null) {
                    mapper.map(estimate, estimateDto);
                }
            }
        } catch (BaculaCommunicationException | BaculaAuthenticationException | BaculaDirectorNotSupported ex) {
            this.logger.error(ex.getLocalizedMessage());
            return null;
        }
        return estimateDto;
    }

}
