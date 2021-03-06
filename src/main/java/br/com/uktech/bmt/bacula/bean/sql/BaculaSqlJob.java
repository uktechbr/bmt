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

package br.com.uktech.bmt.bacula.bean.sql;

import java.util.Date;
import java.util.Objects;

/**
 * 
 * @author João Paulo Siqueira <joao.siqueira@uktech.com.br>
 */
public class BaculaSqlJob extends AbstractBaculaSql {

    private String job;
    private String name;
    private String type;
    private String level;
    private BaculaSqlClient client; //clientid é client.getId()
    private String jobstatus;
    private Date schedtime;
    private Date starttime;
    private Date endtime;
    private Date realendtime;
    private Long jobtdate;
    private BaculaSqlVolSession volsession; //volsessionid é volsession.getId()
    private Integer volsessiontime;
    private Integer jobfiles;
    private Long jobbytes;
    private Long readbytes;
    private Integer joberrors;
    private Integer jobmissingfiles;
    private BaculaSqlPool pool; //poolid é pool.getId()
    private BaculaSqlFileSet fileset;   //filesetid e fileset.getId()
    private BaculaSqlPriorJob priorjob; //?
    private Integer purgedfiles;
    private Integer hasbase;
    private Integer hascache;
    private Integer reviewed;
    private String comment;

    public BaculaSqlJob() {
        super();
    }

    public BaculaSqlJob(Long id) {
        super(id);
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public BaculaSqlClient getClient() {
        return client;
    }

    public void setClient(BaculaSqlClient client) {
        this.client = client;
    }

    public String getJobstatus() {
        return jobstatus;
    }

    public void setJobstatus(String jobstatus) {
        this.jobstatus = jobstatus;
    }

    public Date getSchedtime() {
        return schedtime;
    }

    public void setSchedtime(Date schedtime) {
        this.schedtime = schedtime;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getRealendtime() {
        return realendtime;
    }

    public void setRealendtime(Date realendtime) {
        this.realendtime = realendtime;
    }

    public Long getJobtdate() {
        return jobtdate;
    }

    public void setJobtdate(Long jobtdate) {
        this.jobtdate = jobtdate;
    }

    public BaculaSqlVolSession getVolsession() {
        return volsession;
    }

    public void setVolsession(BaculaSqlVolSession volsession) {
        this.volsession = volsession;
    }

    public Integer getVolsessiontime() {
        return volsessiontime;
    }

    public void setVolsessiontime(Integer volsessiontime) {
        this.volsessiontime = volsessiontime;
    }

    public Integer getJobfiles() {
        return jobfiles;
    }

    public void setJobfiles(Integer jobfiles) {
        this.jobfiles = jobfiles;
    }

    public Long getJobbytes() {
        return jobbytes;
    }

    public void setJobbytes(Long jobbytes) {
        this.jobbytes = jobbytes;
    }

    public Long getReadbytes() {
        return readbytes;
    }

    public void setReadbytes(Long readbytes) {
        this.readbytes = readbytes;
    }

    public Integer getJoberrors() {
        return joberrors;
    }

    public void setJoberrors(Integer joberrors) {
        this.joberrors = joberrors;
    }

    public Integer getJobmissingfiles() {
        return jobmissingfiles;
    }

    public void setJobmissingfiles(Integer jobmissingfiles) {
        this.jobmissingfiles = jobmissingfiles;
    }

    public BaculaSqlPool getPool() {
        return pool;
    }

    public void setPool(BaculaSqlPool pool) {
        this.pool = pool;
    }

    public BaculaSqlFileSet getFileset() {
        return fileset;
    }

    public void setFileset(BaculaSqlFileSet fileset) {
        this.fileset = fileset;
    }

    public BaculaSqlPriorJob getPriorjob() {
        return priorjob;
    }

    public void setPriorjob(BaculaSqlPriorJob priorjob) {
        this.priorjob = priorjob;
    }

    public Integer getPurgedfiles() {
        return purgedfiles;
    }

    public void setPurgedfiles(Integer purgedfiles) {
        this.purgedfiles = purgedfiles;
    }

    public Integer getHasbase() {
        return hasbase;
    }

    public void setHasbase(Integer hasbase) {
        this.hasbase = hasbase;
    }

    public Integer getHascache() {
        return hascache;
    }

    public void setHascache(Integer hascache) {
        this.hascache = hascache;
    }

    public Integer getReviewed() {
        return reviewed;
    }

    public void setReviewed(Integer reviewed) {
        this.reviewed = reviewed;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 37 * hash + Objects.hashCode(this.job);
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.type);
        hash = 37 * hash + Objects.hashCode(this.level);
        hash = 37 * hash + Objects.hashCode(this.client);
        hash = 37 * hash + Objects.hashCode(this.jobstatus);
        hash = 37 * hash + Objects.hashCode(this.schedtime);
        hash = 37 * hash + Objects.hashCode(this.starttime);
        hash = 37 * hash + Objects.hashCode(this.endtime);
        hash = 37 * hash + Objects.hashCode(this.realendtime);
        hash = 37 * hash + Objects.hashCode(this.jobtdate);
        hash = 37 * hash + Objects.hashCode(this.volsession);
        hash = 37 * hash + Objects.hashCode(this.volsessiontime);
        hash = 37 * hash + Objects.hashCode(this.jobfiles);
        hash = 37 * hash + Objects.hashCode(this.jobbytes);
        hash = 37 * hash + Objects.hashCode(this.readbytes);
        hash = 37 * hash + Objects.hashCode(this.joberrors);
        hash = 37 * hash + Objects.hashCode(this.jobmissingfiles);
        hash = 37 * hash + Objects.hashCode(this.pool);
        hash = 37 * hash + Objects.hashCode(this.fileset);
        hash = 37 * hash + Objects.hashCode(this.priorjob);
        hash = 37 * hash + Objects.hashCode(this.purgedfiles);
        hash = 37 * hash + Objects.hashCode(this.hasbase);
        hash = 37 * hash + Objects.hashCode(this.hascache);
        hash = 37 * hash + Objects.hashCode(this.reviewed);
        hash = 37 * hash + Objects.hashCode(this.comment);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (super.equals(obj)==false) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BaculaSqlJob other = (BaculaSqlJob) obj;
        if (!Objects.equals(this.job, other.job)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.level, other.level)) {
            return false;
        }
        if (!Objects.equals(this.client, other.client)) {
            return false;
        }
        if (!Objects.equals(this.jobstatus, other.jobstatus)) {
            return false;
        }
        if (!Objects.equals(this.schedtime, other.schedtime)) {
            return false;
        }
        if (!Objects.equals(this.starttime, other.starttime)) {
            return false;
        }
        if (!Objects.equals(this.endtime, other.endtime)) {
            return false;
        }
        if (!Objects.equals(this.realendtime, other.realendtime)) {
            return false;
        }
        if (!Objects.equals(this.jobtdate, other.jobtdate)) {
            return false;
        }
        if (!Objects.equals(this.volsession, other.volsession)) {
            return false;
        }
        if (!Objects.equals(this.volsessiontime, other.volsessiontime)) {
            return false;
        }
        if (!Objects.equals(this.jobfiles, other.jobfiles)) {
            return false;
        }
        if (!Objects.equals(this.jobbytes, other.jobbytes)) {
            return false;
        }
        if (!Objects.equals(this.readbytes, other.readbytes)) {
            return false;
        }
        if (!Objects.equals(this.joberrors, other.joberrors)) {
            return false;
        }
        if (!Objects.equals(this.jobmissingfiles, other.jobmissingfiles)) {
            return false;
        }
        if (!Objects.equals(this.pool, other.pool)) {
            return false;
        }
        if (!Objects.equals(this.fileset, other.fileset)) {
            return false;
        }
        if (!Objects.equals(this.priorjob, other.priorjob)) {
            return false;
        }
        if (!Objects.equals(this.purgedfiles, other.purgedfiles)) {
            return false;
        }
        if (!Objects.equals(this.hasbase, other.hasbase)) {
            return false;
        }
        if (!Objects.equals(this.hascache, other.hascache)) {
            return false;
        }
        if (!Objects.equals(this.reviewed, other.reviewed)) {
            return false;
        }
        if (!Objects.equals(this.comment, other.comment)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BaculaSqlJob{" + super.toString() + ", job=" + job + ", name=" + name + ", type=" + type + ", level=" + level + ", client=" + client + ", jobstatus=" + jobstatus + ", schedtime=" + schedtime + ", starttime=" + starttime + ", endtime=" + endtime + ", realendtime=" + realendtime + ", jobtdate=" + jobtdate + ", volsession=" + volsession + ", volsessiontime=" + volsessiontime + ", jobfiles=" + jobfiles + ", jobbytes=" + jobbytes + ", readbytes=" + readbytes + ", joberrors=" + joberrors + ", jobmissingfiles=" + jobmissingfiles + ", pool=" + pool + ", fileset=" + fileset + ", priorjobid=" + priorjob + ", purgedfiles=" + purgedfiles + ", hasbase=" + hasbase + ", hascache=" + hascache + ", reviewed=" + reviewed + ", comment=" + comment +'}';
    }
}