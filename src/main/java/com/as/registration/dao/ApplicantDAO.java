package com.as.registration.dao;

import com.as.registration.domain.Applicant_List;

public interface ApplicantDAO
{
	public void insertApplicantInformation(Applicant_List appList);
	//public Applicant_List duplicateDatabaseSubmission(int jobId,String candidateEmail);	
}
