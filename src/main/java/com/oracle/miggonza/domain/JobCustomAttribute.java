package com.oracle.miggonza.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table (name = "AIME_JOB_CUSTOM_ATTRIBUTES")
public class JobCustomAttribute {
	
	@EmbeddedId
	private JobCustomAttributePK jobCustomAttributePk;
	
	@ManyToOne
	@JoinColumn(name = "job_id")
	@MapsId("jobId")
	private Job job;
	
	private String attrValue;

	public String getAttrValue() {
		return attrValue;
	}

	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}

	@Transient
	@JsonInclude(Include.NON_EMPTY)
	public String getAttrName(){
		return jobCustomAttributePk.getAttrName();
	}
}
