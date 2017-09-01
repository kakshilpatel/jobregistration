package com.as.registration.services;

import com.as.registration.domain.Applicant_List;

public interface ApplicantService 
{
	public void addApplicantInformation(Applicant_List appList);
	public Applicant_List duplicateSubmissionService(int jobId,String candidateEmail);	
}
