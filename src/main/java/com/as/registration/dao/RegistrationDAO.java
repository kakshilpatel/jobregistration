package com.as.registration.dao;

import java.util.List;

import com.as.registration.domain.Jobs;
import com.as.registration.domain.Registration;

public interface RegistrationDAO 
{
	public void insertRegistrationInformation(Registration reg);
	public List<Registration> findAll();
	public List<Jobs> findAllJobs();
}
