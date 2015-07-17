package com.oracle.miggonza.domain;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table (name = "AIME_JOB_RUN")
public class JobRun {
	
	@Id
	private BigInteger jobId;
	private String jobOwner;
	private String runningAsUser;
	
	
	public BigInteger getJobId() {
		return jobId;
	}


	public String getJobOwner() {
		return jobOwner;
	}

	public String getRunningAsUser() {
		return runningAsUser;
	}

}
