package com.healthcare.service;

import java.util.List;

import com.healthcare.dto.HealthcareDonorDTO;
import com.healthcare.dto.HealthcareRequestDTO;
import com.healthcare.exceptions.HealthcareServiceException;


public interface IHealthcareService {

	HealthcareDonorDTO saveDonor(HealthcareDonorDTO healthcareDonorDTO)throws HealthcareServiceException;
	
	HealthcareRequestDTO saveBloodRequest(HealthcareRequestDTO healthcareRequestDTO)throws HealthcareServiceException;
	
	List<HealthcareDonorDTO> getDonorList()throws HealthcareServiceException;
	
	List<HealthcareRequestDTO> getBloodRequestList()throws HealthcareServiceException;
}
