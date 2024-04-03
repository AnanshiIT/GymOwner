package com.gymowner.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gymowner.model.GymOwner;

public interface GymOwnerRepository extends JpaRepository<GymOwner, Serializable> {

	//public String getOwnereDetails();

}
