package com.oracle.miggonza.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table (name = "MGMT_JOB_OUTPUT", schema="sysman")
public class MgmtJobOutput {
	
	@Id
	private byte[] outputId;
	@Lob
	private String output;

	public String getOutput() {
		return output;
	}
	
	public byte[] getOutputId() {
		return outputId;
	}

}
