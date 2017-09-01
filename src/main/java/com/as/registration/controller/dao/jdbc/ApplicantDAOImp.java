package com.as.registration.controller.dao.jdbc;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.as.registration.dao.ApplicantDAO;
import com.as.registration.domain.Applicant_List;


@Repository("ApplicantDAOImp")
@Transactional
public class ApplicantDAOImp implements ApplicantDAO
{
		
	@Autowired
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf)
	{
		this.sessionFactory = sf;
	}

	
	public void insertApplicantInformation(Applicant_List appList)
	{
		Session session;
		session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(appList);
	}
	/*public Applicant_List duplicateDatabaseSubmission(int jobId,String candidateEmail)
	{
		Session session;
		session=this.sessionFactory.getCurrentSession();
		applicant_List=(Applicant_List)session.get(Applicant_List.class,jobId);
		//System.out.println("Email is :--->"+applicant_List.getCandidateEmail());
		return applicant_List;
	}*/
	
	
}
