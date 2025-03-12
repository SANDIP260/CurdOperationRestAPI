package com.sm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sm.model.Tourist;
import com.sm.repository.ITouristRepository;

@Service
public class TouristMgmtServiceImpl implements ITouristMgmtService {
	
	@Autowired
	private  ITouristRepository touristRepo;

	@Override
	public String registerTourist(Tourist tourist) {
		Integer ids = touristRepo.save(tourist).getId();
		return "Tourist registered successfully with id "+ids;
	}

}
