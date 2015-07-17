package com.oracle.miggonza.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "AIME_RESOURCE")
public class Resource {

	@Id
	@Column(name ="resource_name")
	private String resourceName;
	private String rack;
	private String exclusiveFlag;

	@OneToMany (mappedBy = "resource", fetch=FetchType.EAGER)
	private Set<Vcpu> vcpus; 
	
	
	public Set<Vcpu> getVcpus() {
		  return vcpus;
	}
		   
	public void setVcpus(Set<Vcpu> vcpus) {
		  this.vcpus = vcpus;
	}
	  
	public String getResourceName() {
		return resourceName;
	}

	public void setName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getRack() {
		return rack;
	}

	public void setRack(String rack) {
		this.rack = rack;
	}

	public String getExclusiveFlag() {
		return exclusiveFlag;
	}

	public void setExclusiveFlag(String exclusiveFlag) {
		this.exclusiveFlag = exclusiveFlag;
	}
}
