package com.oracle.miggonza.domain;

import java.math.BigInteger;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@Entity
@Table (name = "AIME_JOB")
public class Job {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private BigInteger jobId;
  private String status;
  private String jobName;
  private String jobOwner;
  private String labelId;
  private BigInteger wfId;
  private String domainName;
  private String zoneName;
  private String jobType;
  private BigInteger numVcpus;
  private BigInteger vcpuNum;
  private String requirements;
  private String opsys;
  private BigInteger priority;
  private String jobCategory;
  private String runasUser;
  private Date submitTime;
  private BigInteger numCustAttr;
  private String resExecutedOn;
  private String mcpuType;
  private String mcpuRequirements;
  
  @OneToMany (mappedBy = "job", fetch=FetchType.EAGER)
  private Set<Retry> retries;
  
  
  @OneToMany (mappedBy = "job", fetch=FetchType.EAGER)
  private Set<JobCustomAttribute> custAttrs;
  
  @OneToOne
  @JoinColumn (name = "job_id")
  private JobRun jobRun;
  
  @OneToOne
  @JoinColumn (name = "job_id")
  private JobExtn jobExtn;
  
  public BigInteger getJobId() {
	  return jobId;
  }
  
  public String getStatus() {
    return status;
  }
  
  public Set<Retry> getRetries() {
	  return retries;
 }
	   
  public void setRetries(Set<Retry> retries) {
	  this.retries = retries;
  }
  

  public void setStatus(String status) {
    this.status = status;
  }

  public String getJobName() {
	return jobName;
  }

  public void setJobName(String jobName) {
	this.jobName = jobName;
  }

  public String getJobOwner() {
	return jobOwner;
  }

  public void setJobOwner(String jobOwner) {
	this.jobOwner = jobOwner;
  }

  public String getLabelId() {
	return labelId;
  }

  public void setLabelId(String labelId) {
	this.labelId = labelId;
  }

  public BigInteger getWfId() {
	return wfId;
  }

  public void setWfId(BigInteger wfId) {
	this.wfId = wfId;
  }

	public String getDomainName() {
		return domainName;
	}
	
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}
	
	public String getZoneName() {
		return zoneName;
	}
	
	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}
	
	public String getJobType() {
		return jobType;
	}
	
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	
	public BigInteger getNumVcpus() {
		return numVcpus;
	}
	
	public void setNumVcpus(BigInteger numVcpus) {
		this.numVcpus = numVcpus;
	}
	
	public BigInteger getVcpuNum() {
		return vcpuNum;
	}
	
	public void setVcpuNum(BigInteger vcpuNum) {
		this.vcpuNum = vcpuNum;
	}

	public String getRequirements() {
		return requirements;
	}

	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}

	public String getOpsys() {
		return opsys;
	}

	public void setOpsys(String opsys) {
		this.opsys = opsys;
	}

	public String getJobCategory() {
		return jobCategory;
	}

	public void setJobCategory(String jobCategory) {
		this.jobCategory = jobCategory;
	}

	public BigInteger getPriority() {
		return priority;
	}

	public void setPriority(BigInteger priority) {
		this.priority = priority;
	}

	public String getRunasUser() {
		return runasUser;
	}

	public void setRunasUser(String runasUser) {
		this.runasUser = runasUser;
	}

	public Date getSubmitTime() {
		return submitTime;
	}

	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}

	public BigInteger getNumCustAttr() {
		return numCustAttr;
	}

	public void setNumCustAttr(BigInteger numCustAttr) {
		this.numCustAttr = numCustAttr;
	}

	public String getResExecutedOn() {
		return resExecutedOn;
	}

	public void setResExecutedOn(String resExecutedOn) {
		this.resExecutedOn = resExecutedOn;
	}

	public String getMcpuType() {
		return mcpuType;
	}

	public void setMcpuType(String mcpuType) {
		this.mcpuType = mcpuType;
	}

	public String getMcpuRequirements() {
		return mcpuRequirements;
	}

	public void setMcpuRequirements(String mcpuRequirements) {
		this.mcpuRequirements = mcpuRequirements;
	}
	
	@JsonInclude (Include.NON_EMPTY)
	public JobRun getJobRun() {
	      return jobRun;
	}

	public void setJobRun (final JobRun jobRun){
	     this.jobRun = jobRun;
	}
	
	@JsonInclude (Include.NON_EMPTY)
	public JobExtn getJobExtn() {
	      return jobExtn;
	}

	public void setJobExtn (final JobExtn jobExtn){
	     this.jobExtn = jobExtn;
	}
	
	
	public Set<JobCustomAttribute> getCustAttrs() {
	  return custAttrs;
	}
		   
	 public void setCustAttrs(Set<JobCustomAttribute> custAttrs) {
		 this.custAttrs = custAttrs;
	 }

}
