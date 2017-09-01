package com.as.registration.services;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.as.registration.dao.ApplicantDAO;
import com.as.registration.domain.Applicant_List;

@Service
public class ApplicantServiceImp implements ApplicantService
{
	@Autowired
	@Qualifier("ApplicantDAOImp")
	private ApplicantDAO applicantDao;
	
	private ArrayList<Applicant_List> arrayList;
	static int idCnt=0;
	
	public void setApplicantDAO(ApplicantDAO applicantDao)
	{
		this.applicantDao=applicantDao;
	}
	
	@Transactional
	@PostConstruct
	public void initData()
	{
		arrayList=new ArrayList<Applicant_List>();
	}
	
	@Transactional
	public void addApplicantInformation(Applicant_List appList)
	{
		arrayList.add(appList);
		applicantDao.insertApplicantInformation(appList);
		idCnt++;
		System.out.println("Count is :--->"+idCnt);
	}
	
	@Transactional
	public Applicant_List duplicateSubmissionService(int jobId,String candidateEmail)
	{
			for(Applicant_List appList: arrayList)
			{
				if(appList.getCandidateEmail()==candidateEmail)
				{
					System.out.println("jobId is Same......");
					return appList;
				}
			}
			return null;
	}

}
