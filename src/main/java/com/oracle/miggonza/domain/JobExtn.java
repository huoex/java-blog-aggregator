package com.oracle.miggonza.domain;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "AIME_JOB_EXTN")
public class JobExtn {
	
	@Id
	private BigInteger jobId;
	private BigInteger hetroResCount;
	private String hetroExtnReqs;
	private String hetroSameRack;
	
	public BigInteger getJobId() {
		return jobId;
	}

	public void setJobId(BigInteger jobId) {
		this.jobId = jobId;
	}
	  
	public BigInteger getHetroResCount() {
		return hetroResCount;
	}
	public void setHetroResCount(BigInteger hetroResCount) {
		this.hetroResCount = hetroResCount;
	}
	public String getHetroExtnReqs() {
		return hetroExtnReqs;
	}
	public void setHetroExtnReqs(String hetroExtnReqs) {
		this.hetroExtnReqs = hetroExtnReqs;
	}

	public String getHetroSameRack() {
		return hetroSameRack;
	}

	public void setHetroSameRack(String hetroSameRack) {
		this.hetroSameRack = hetroSameRack;
	}

}
