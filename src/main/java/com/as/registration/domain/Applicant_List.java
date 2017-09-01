package com.as.registration.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="applicant_list")
public class Applicant_List
{
	@Id
	@Column(name="jobId")
	private int jobId;
	
	@Column(name="candidateEmail")
	private String candidateEmail;
	
	@Column(name="jobTitle")
	private String jobTitle;
	
	@Column(name="candidateName")
	private String candidateName;
	
	@Column(name="candidatePhone")
	private String candidatePhone;

	public Applicant_List() 
	{
		super();
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public String getCandidatePhone() {
		return candidatePhone;
	}

	public void setCandidatePhone(String candidatePhone) {
		this.candidatePhone = candidatePhone;
	}

	public String getCandidateEmail() {
		return candidateEmail;
	}

	public void setCandidateEmail(String candidateEmail) {
		this.candidateEmail = candidateEmail;
	}	
}
