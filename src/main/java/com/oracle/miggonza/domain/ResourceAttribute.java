package com.oracle.miggonza.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table (name = "AIME_RESOURCE_ATTRIBUTES")
public class ResourceAttribute {

	@Id
	private String resourceName;
	private String attrName;
	private String attrValue;
	private String custAttrFlag;
	private String exclusiveFlag;
	private String rack;
	
	public String getAttrName() {
		return attrName;
	}
	public String getResourceName() {
		return resourceName;
	}
	public String getAttrValue() {
		return attrValue;
	}
	public String getCustAttrFlag() {
		return custAttrFlag;
	}
	public String getExclusiveFlag() {
		return exclusiveFlag;
	}
	public String getRack() {
		return rack;
	}
	
}
