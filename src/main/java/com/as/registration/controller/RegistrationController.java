package com.as.registration.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.as.registration.domain.Jobs;
import com.as.registration.domain.Registration;
import com.as.registration.services.RegistrationService;

@Controller
public class RegistrationController                        //localhost:8080/registration/enterRegistrationInformation
{
	private static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);  

    @Autowired
	RegistrationService registrationService;
	
    public void setRegistrationService(RegistrationService registrationService)
	{
		this.registrationService=registrationService;
	}
	
	@RequestMapping(value="/enterRegistrationInformation",method=RequestMethod.GET)
	public String enterRegistrationInfomationForm()                         // Handler Method
	{
		return "displayregistrationform";
	}
	
	@RequestMapping(value="/processRegistrationInformation",method=RequestMethod.POST)
	public @ResponseBody ModelAndView displayRegistrationInfomationForm(Registration reg)
	{
		ModelAndView modelView;
		registrationService.addRegistrationInformation(reg);
		modelView = new ModelAndView("processregistrationform");
		modelView.addObject("registration",reg);
		return modelView;
	}
	
	@RequestMapping(value="/findAll",method=RequestMethod.GET)
	public ModelAndView displayRegistrationInformationFromDB(Registration reg)
	{
		List<Registration> regList;
		ModelAndView modelView;
		regList=registrationService.findAllUsingService();
		
		modelView=new ModelAndView("displayregistrationinformationfromdb");
		modelView.addObject("regList",regList);
		return modelView;
	}
}
