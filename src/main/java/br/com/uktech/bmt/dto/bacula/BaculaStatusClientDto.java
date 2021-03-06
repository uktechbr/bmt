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
package br.com.uktech.bmt.dto.bacula;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author João Paulo Siqueira <joao.siqueira@uktech.com.br>
 */
public class BaculaStatusClientDto implements Serializable{
    
    private String header;
    private List<BaculaJobRunningClientDto> runningJobs = new ArrayList<>();
    private List<BaculaJobDto> terminatedJobs = new ArrayList<>();

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public List<BaculaJobRunningClientDto> getRunningJobs() {
        return runningJobs;
    }

    public void setRunningJobs(List<BaculaJobRunningClientDto> runningJobs) {
        this.runningJobs = runningJobs;
    }

    public List<BaculaJobDto> getTerminatedJobs() {
        return terminatedJobs;
    }

    public void setTerminatedJobs(List<BaculaJobDto> terminatedJobs) {
        this.terminatedJobs = terminatedJobs;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.header);
        hash = 53 * hash + Objects.hashCode(this.runningJobs);
        hash = 53 * hash + Objects.hashCode(this.terminatedJobs);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BaculaStatusClientDto other = (BaculaStatusClientDto) obj;
        if (!Objects.equals(this.header, other.header)) {
            return false;
        }
        if (!Objects.equals(this.runningJobs, other.runningJobs)) {
            return false;
        }
        if (!Objects.equals(this.terminatedJobs, other.terminatedJobs)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        String output = "";
        output = header;
        output += 
        "Running Jobs:\n";
        if(runningJobs!=null) {
            for (int i = 0; i < runningJobs.size(); i++) {
                output += runningJobs.get(i).toString()+"\n";
            }
        } else {
            output += "No Jobs running.\n";
        }
        output += "====\n\n";
        
        output += 
        "Terminated Jobs:\n";
        if(terminatedJobs!=null) {
            output += 
            " JobId  Level    Files      Bytes   Status   Finished        Name \n" +
            "====================================================================\n";
            for (int i = 0; i < terminatedJobs.size(); i++) {
                output += terminatedJobs.get(i).lineTerminatedJobs()+"\n";
            }
        } else {
            output += "No Terminated Jobs.\n";
        }
        output += "====\n";
        
        return output;
    }
}
