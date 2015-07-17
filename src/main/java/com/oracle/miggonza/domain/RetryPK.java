package com.oracle.miggonza.domain;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class RetryPK implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BigInteger jobId;
	private BigInteger retryCount;

	
	@Column(name = "retry_count")
	public BigInteger getRetryCount() {
		return retryCount;
	}

	public void setRetryCount(BigInteger retryCount) {
		this.retryCount = retryCount;
	}
	
	@Override
	public int hashCode() {
        return (jobId.add(retryCount)).hashCode();
    }

	@Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof RetryPK)) return false;
        RetryPK pk = (RetryPK) obj;
        return pk.jobId == jobId && pk.retryCount == retryCount;
    }

	@Column(name = "job_id")
	public BigInteger getJobId() {
		return jobId;
	}

	public void setJobId(BigInteger jobId) {
		this.jobId = jobId;
	}

}
