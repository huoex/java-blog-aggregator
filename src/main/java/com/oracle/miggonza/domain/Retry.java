package com.oracle.miggonza.domain;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table (name = "AIME_JOB_RETRYS")
public class Retry {
	
	@EmbeddedId
	private RetryPK retryPk;
	private String status;
	private byte[] gcExecutionId;
	private String gcJobName;
	private String resourceName;
	private BigInteger vcpuNum;
	private Date retryTime;
	private Timestamp retryEndTime;	
	@Lob
	@Transient
	private String output;
	@Lob
	@Transient
	private String errorOutput;
	
	@ManyToOne
	@JoinColumn(name = "job_id")
	@MapsId("jobId")
	private Job job;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGcJobName() {
		return gcJobName;
	}

	public void setGcJobName(String gcJobName) {
		this.gcJobName = gcJobName;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public BigInteger getVcpuNum() {
		return vcpuNum;
	}

	public void setVcpuNum(BigInteger vcpuNum) {
		this.vcpuNum = vcpuNum;
	}

	public Date getRetryTime() {
		return retryTime;
	}

	public void setRetryTime(Date retryTime) {
		this.retryTime = retryTime;
	}

	public Timestamp getRetyEndTime() {
		return retryEndTime;
	}

	public void setRetyEndTime(Timestamp retryEndTime) {
		this.retryEndTime = retryEndTime;
	}

	public byte[] getGcExecutionId() {
		return gcExecutionId;
	}

	public void setGcExecutionId(byte[] gcExecutionId) {
		this.gcExecutionId = gcExecutionId;
	}

	@JsonInclude(Include.NON_EMPTY)
	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	@JsonInclude(Include.NON_EMPTY)
	public String getErrorOutput() {
		return errorOutput;
	}

	public void setErrorOutput(String errorOutput) {
		this.errorOutput = errorOutput;
	}
	
	
}
