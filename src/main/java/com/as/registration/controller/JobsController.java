package com.as.registration.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.as.registration.domain.Applicant_List;
import com.as.registration.domain.Jobs;
import com.as.registration.services.ApplicantService;
import com.as.registration.services.RegistrationService;

@Controller
public class JobsController											//localhost:8080/registration/findAllJobs
{
	private static final Logger logger = LoggerFactory.getLogger(JobsController.class); 
	
	@Autowired
	RegistrationService registrationService;
	
	@Autowired
	ApplicantService applicantService;
	
    public void setRegistrationService(RegistrationService registrationService)
	{
		this.registrationService=registrationService;
	}
    
    public void setApplicantService(ApplicantService applicantService)
    {
    	this.applicantService=applicantService;
    }
    
    @RequestMapping(value="/findAllJobs",method=RequestMethod.GET)
	public String showAllJobs()
	{
			return "findalljobs";
	}
	
	@RequestMapping(value="/displayAllJobs",method=RequestMethod.GET)
	public ModelAndView displayAllJobs(Jobs jobs)
	{
		List<Jobs> jobList;
		ModelAndView modelView;
		jobList=registrationService.findAllJobsUsingService();
		
		modelView=new ModelAndView("displayalljobs");
		modelView.addObject("jobList", jobList);
		return modelView;
	}
	
	@RequestMapping(value="/applyJobForm",method=RequestMethod.GET)
	public ModelAndView displayJobForm(@RequestParam("jobId") int jobId,@RequestParam("jobTitle") String jobRole,String candidateEmail)
	{
		ModelAndView modelView;
		modelView=new ModelAndView("applyjobform");
		modelView.addObject("jobId",jobId);
		modelView.addObject("jobRole",jobRole);
		modelView.addObject("candidateEmail",candidateEmail);
		applicantService.duplicateSubmissionService(jobId,candidateEmail);
		return modelView;
	}
	
	@RequestMapping(value="/successfullyAppliedForm",method=RequestMethod.POST)
	public ModelAndView processJobForm(Applicant_List appList,HttpSession httpSession)
	{
		ModelAndView modelView;
		applicantService.addApplicantInformation(appList);
		httpSession.setAttribute("appList",appList);
		modelView=new ModelAndView("successfullyappliedform");
		return modelView;
	}
}
