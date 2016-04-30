package com.healthcare.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.healthcare.dao.IHealthcareDAO;
import com.healthcare.dto.HealthcareDonorDTO;
import com.healthcare.dto.HealthcareRequestDTO;
import com.healthcare.exceptions.HealthcareServiceException;
import com.healthcare.model.HealthcareDonor;
import com.healthcare.model.HealthcareRequest;
import com.healthcare.service.IHealthcareService;

@Service
public class HealthcareServiceImpl implements IHealthcareService{

	@Autowired
	private IHealthcareDAO healthcareDAO;

	@Transactional
	public HealthcareDonorDTO saveDonor(HealthcareDonorDTO healthcareDonorDTO)throws HealthcareServiceException {
				
		ModelMapper modelMapper = null;
		
		try{
			
			if(null != healthcareDonorDTO){
				
				modelMapper = new ModelMapper();
				HealthcareDonor healthcareDonor = modelMapper.map(healthcareDonorDTO, HealthcareDonor.class);
				healthcareDonor = healthcareDAO.saveDonor(healthcareDonor);
				
				if(null != healthcareDonor && healthcareDonor.getId() > 0){
					
					healthcareDonorDTO = modelMapper.map(healthcareDonor, HealthcareDonorDTO.class);
				}
			}
		}
		catch(Exception exception){
			exception.printStackTrace();
			throw new HealthcareServiceException(exception);
		}
		return healthcareDonorDTO;
	}

	@Transactional
	public HealthcareRequestDTO saveBloodRequest(HealthcareRequestDTO healthcareRequestDTO)throws HealthcareServiceException {

		ModelMapper modelMapper = null;
		
		try{
			
			if(null != healthcareRequestDTO){
				
				modelMapper = new ModelMapper();
				HealthcareRequest healthcareRequest = modelMapper.map(healthcareRequestDTO, HealthcareRequest.class);
				healthcareRequest = healthcareDAO.saveBloodRequest(healthcareRequest);
				
				if(null != healthcareRequest && healthcareRequest.getId() > 0){
					
					healthcareRequestDTO = modelMapper.map(healthcareRequest, HealthcareRequestDTO.class);
				}
			}
		}
		catch(Exception exception){
			exception.printStackTrace();
			throw new HealthcareServiceException(exception);
		}
		return healthcareRequestDTO;
	}

	@Transactional
	public List<HealthcareDonorDTO> getDonorList()throws HealthcareServiceException {
		
		List<HealthcareDonorDTO> healthcareDonorDTOList = null;
		List<HealthcareDonor> healthcareDonorList = null;
		ModelMapper modelMapper = null;
		
		try {
			
			healthcareDonorList = healthcareDAO.fetchDonorList();
			if(null != healthcareDonorList && !healthcareDonorList.isEmpty()){
				
				modelMapper = new ModelMapper();
				healthcareDonorDTOList = modelMapper.map(healthcareDonorList,  new TypeToken<List<HealthcareDonorDTO>>() {}.getType());
			}
		} 
		catch (Exception exception) {

			exception.printStackTrace();
			throw new HealthcareServiceException(exception);
		}
		
		return healthcareDonorDTOList;
	}

	@Transactional
	public List<HealthcareRequestDTO> getBloodRequestList()throws HealthcareServiceException {
		
		List<HealthcareRequestDTO> healthcareRequestDTOList = null;
		List<HealthcareRequest> healthcareRequestList = null;
		ModelMapper modelMapper = null;
		
		try {
			
			healthcareRequestList = healthcareDAO.fetchBloodRequestList();
			if(null != healthcareRequestList && !healthcareRequestList.isEmpty()){
				
				modelMapper = new ModelMapper();
				healthcareRequestDTOList = modelMapper.map(healthcareRequestList,  new TypeToken<List<HealthcareRequestDTO>>() {}.getType());
			}
		} 
		catch (Exception exception) {

			exception.printStackTrace();
			throw new HealthcareServiceException(exception);
		}
		return healthcareRequestDTOList;
	}
	
	

}
