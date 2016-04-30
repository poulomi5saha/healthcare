package com.healthcare.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.healthcare.dao.IHealthcareDAO;
import com.healthcare.model.HealthcareDonor;
import com.healthcare.model.HealthcareRequest;

@Repository
public class HealthcareDAOImpl implements IHealthcareDAO{

	@PersistenceContext
    private EntityManager entityManager;

	@Override
	public HealthcareDonor saveDonor(HealthcareDonor healthcareDonor)throws Exception {
		
		if(null != healthcareDonor){
			
			entityManager.persist(healthcareDonor);
		}
		
		return healthcareDonor;
	}

	@Override
	public HealthcareRequest saveBloodRequest(HealthcareRequest healthcareRequest) throws Exception {

		if(null != healthcareRequest){
			
			entityManager.persist(healthcareRequest);
		}
		
		return healthcareRequest;
	}

	@Override
	public List<HealthcareDonor> fetchDonorList() throws Exception {

		Query query = entityManager.createQuery("SELECT o FROM HealthcareDonor o");
		return query.getResultList();
	}

	@Override
	public List<HealthcareRequest> fetchBloodRequestList() throws Exception {

		Query query = entityManager.createQuery("SELECT o FROM HealthcareRequest o");
		return query.getResultList();
	}

	

}
