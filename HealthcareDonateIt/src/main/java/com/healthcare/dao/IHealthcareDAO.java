package com.healthcare.dao;

import java.util.List;

import com.healthcare.model.HealthcareDonor;
import com.healthcare.model.HealthcareRequest;


public interface IHealthcareDAO {

	HealthcareDonor saveDonor(HealthcareDonor healthcareDonor)throws Exception;
	
	HealthcareRequest saveBloodRequest(HealthcareRequest healthcareRequest)throws Exception;
	
	List<HealthcareDonor> fetchDonorList()throws Exception;
	
	List<HealthcareRequest> fetchBloodRequestList()throws Exception;
}
