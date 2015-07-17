package com.oracle.miggonza.domain;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Embeddable;

@Embeddable
public class JobCustomAttributePK implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String attrName;
	private BigInteger jobId;
	
	public String getAttrName() {
		return attrName;
	}

	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public BigInteger getJobId() {
		return jobId;
	}

	public void setJobId(BigInteger jobId) {
		this.jobId = jobId;
	}
	
	public int hashCode() {
        return attrName.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof JobCustomAttributePK)) return false;
        JobCustomAttributePK pk = (JobCustomAttributePK) obj;
        return pk.jobId == jobId && pk.attrName.equals(attrName);
    }

}


