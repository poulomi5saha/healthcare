package com.healthcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.healthcare.dto.HealthcareDonorDTO;
import com.healthcare.dto.HealthcareRequestDTO;
import com.healthcare.service.IHealthcareService;

@Controller
@Lazy(value = true)
public class HealthcareController {

	@Autowired
	private IHealthcareService healthcareService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)  
	public String loadApp(Model model)  
	{  
		List<HealthcareDonorDTO> healthcareDonorDTOList = null;
		List<HealthcareRequestDTO> healthcareRequestDTOList = null;
		
		try{
			
			healthcareDonorDTOList = healthcareService.getDonorList();
			healthcareRequestDTOList = healthcareService.getBloodRequestList();
			
			model.addAttribute("healthcareDonorDTOList", healthcareDonorDTOList);
			model.addAttribute("healthcareRequestDTOList", healthcareRequestDTOList);
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		
		return "home";  
	}
	
	@RequestMapping(value = "/saveDonor", method = RequestMethod.POST, headers = {"Content-type=application/json"})  
	public @ResponseBody HealthcareDonorDTO saveDonor(@RequestBody HealthcareDonorDTO healthcareDonorDTO)  
	{  
		try{
			
			if(null != healthcareDonorDTO){
				healthcareDonorDTO = healthcareService.saveDonor(healthcareDonorDTO);
			}
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return healthcareDonorDTO;  
	}
	
	@RequestMapping(value = "/saveBloodRequest", method = RequestMethod.POST, headers = {"Content-type=application/json"})  
	public @ResponseBody HealthcareRequestDTO saveBloodRequest(@RequestBody HealthcareRequestDTO healthcareRequestDTO)  
	{  
		try{
			
			if(null != healthcareRequestDTO){
				healthcareRequestDTO = healthcareService.saveBloodRequest(healthcareRequestDTO);
			}
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return healthcareRequestDTO;  
	}
}
