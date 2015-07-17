package com.oracle.miggonza.domain;

import java.math.BigInteger;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "SD_CHECK_JOB")
public class CheckJob {
	
	@Id
	private Timestamp runTime;
	private String hostname;
	private String username;
	private BigInteger jobId;
	
	public Timestamp getRunTime() {
		return runTime;
	}
	public void setRunTime(Timestamp runTime) {
		this.runTime = runTime;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public BigInteger getJobId() {
		return jobId;
	}
	public void setJobId(BigInteger jobId) {
		this.jobId = jobId;
	}
	
	

}
