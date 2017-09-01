package com.as.registration.services;

import java.util.List;

import com.as.registration.domain.Jobs;
import com.as.registration.domain.Registration;

public interface RegistrationService
{
	public void addRegistrationInformation(Registration reg);
	public List<Registration> findAllUsingService();
	public List<Jobs> findAllJobsUsingService();
	
	
}
