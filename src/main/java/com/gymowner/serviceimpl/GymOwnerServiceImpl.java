package com.gymowner.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gymowner.model.GymOwner;
import com.gymowner.repository.GymOwnerRepository;
import com.gymowner.service.GymOwnerService;

@Service
public class GymOwnerServiceImpl implements GymOwnerService {

	@Autowired
	GymOwnerRepository gymOwnerRepository;

	@Override
	public List<GymOwner> getOwnereDetails() {
		return gymOwnerRepository.findAll();
	}
		
	@Override
	public GymOwner saveOwnerDetails(GymOwner gymOwner) {
		return gymOwnerRepository.save(gymOwner);
	}

}
