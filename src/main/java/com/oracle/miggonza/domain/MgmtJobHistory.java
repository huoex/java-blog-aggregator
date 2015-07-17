package com.oracle.miggonza.domain;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table (name = "MGMT_JOB_HISTORY", schema="sysman")
public class MgmtJobHistory {
	
	@Id
	private BigInteger stepId;
	private byte[] jobId;
	private byte[] outputId;
	private byte[] errorId;
	private byte[] executionId;
	private String stepName;
	
	public byte[] getOutputId() {
		return outputId;
	}
	
	public byte[] getErrorId() {
		return errorId;
	}
	
	public byte[] getJobId() {
		return jobId;
	}
	
	public byte[] getExecutionId() {
		return executionId;
	}

	public String getStepName() {
		return stepName;
	}
	
	public BigInteger getStepId() {
		return stepId;
	}

}
