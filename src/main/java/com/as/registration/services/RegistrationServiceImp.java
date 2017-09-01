package com.as.registration.services;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.as.registration.dao.RegistrationDAO;
import com.as.registration.domain.Jobs;
import com.as.registration.domain.Registration;

@Service
public class RegistrationServiceImp implements RegistrationService
{
	@Autowired
	@Qualifier("RegistrationDAOImp")
	private RegistrationDAO registrationDao;
	
	private ArrayList<Registration> arrayList;
	static int idCnt=0;
	
	@Transactional
	public void setRegistrationDAO(RegistrationDAO registrationDao)
	{
		this.registrationDao=registrationDao;
	}
	
	@Transactional
	@PostConstruct
	public void initData()
	{
		arrayList=new ArrayList<Registration>();
	}
	
	@Transactional
	public void addRegistrationInformation(Registration reg)
	{
		arrayList.add(reg);
		registrationDao.insertRegistrationInformation(reg);
		System.out.println(reg.toString());
		idCnt++;
		System.out.println("Count is:--->"+idCnt);
	}
	
	@Transactional
	public List<Registration> findAllUsingService()
	{
		return registrationDao.findAll();
	}
	
	@Transactional
	public List<Jobs> findAllJobsUsingService()
	{
		return registrationDao.findAllJobs();
	}	
}
