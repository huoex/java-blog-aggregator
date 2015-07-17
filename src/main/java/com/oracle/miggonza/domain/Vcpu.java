package com.oracle.miggonza.domain;

import java.math.BigInteger;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table (name = "AIME_VCPU")
public class Vcpu {
	
	@EmbeddedId
	private VcpuPK vcpuPk;
	private String state;
	private String status;
	private BigInteger jobId;
	private String jobCategory;
	
	@ManyToOne
	@JoinColumn(name = "res_name", referencedColumnName="resource_name")
	@MapsId("resName")
	private Resource resource;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public BigInteger getJobId() {
		return jobId;
	}
	public void setJobId(BigInteger jobId) {
		this.jobId = jobId;
	}
	public String getJobCategory() {
		return jobCategory;
	}
	public void setJobCategory(String jobCategory) {
		this.jobCategory = jobCategory;
	}

}
