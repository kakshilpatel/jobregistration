package com.as.registration.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Jobs")
public class Jobs 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private int jobId;
	
	@Column(name="jobRole")
	private String jobRole;
	
	@Column(name="jobDescription")
	private String jobDescription;
	
	@Column(name="jobStatus")
	private String jobStatus;
	
	@Column(name="jobDuration")
	private String jobDuration;
	
	@Column(name="jobLocation")
	private String jobLocation;
	
	@Column(name="companyName")
	private String companyName;
	
	public Jobs() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public int getJobId() 
	{
		return jobId;
	}

	public void setJobId(int jobId) 
	{
		this.jobId = jobId;
	}

	public String getJobRole() 
	{
		return jobRole;
	}

	public void setJobRole(String jobRole) 
	{
		this.jobRole = jobRole;
	}

	public String getJobDescription() 
	{
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getJobStatus() {
		return jobStatus;
	}

	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}

	public String getJobDuration() {
		return jobDuration;
	}

	public void setJobDuration(String jobDuration) {
		this.jobDuration = jobDuration;
	}

	public String getJobLocation() {
		return jobLocation;
	}

	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}
	
	public void setCompanyName(String companyName)
	{
		this.companyName=companyName;
	}
	
	public String getCompanyName()
	{
		return companyName;
	}
	public String toString()
	{
		return this.jobId+" "+this.jobRole+"  "+this.jobDescription+" "+this.jobStatus+" "+this.jobDuration+" "+this.jobLocation+" "+this.companyName;
	}
	
}
