/**
 * 
 */
package com.gymowner.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gymowner.model.GymOwner;
import com.gymowner.service.GymOwnerService;

/**
 * 
 */

@RestController
@RequestMapping(value = "/gymXpert/v1")
public class GymController {

	@Autowired
	GymOwnerService gymOwnerService;

	@GetMapping("/test")
	public String simpleMethod() {
		return "test from simpleMethod";
	}

	@GetMapping("/getOwnerDetails")
	public List<GymOwner> getOwnereDetails() {
		  List<GymOwner> gymOwner = new ArrayList<>(); 
		  gymOwner = gymOwnerService.getOwnereDetails();
		  return gymOwner;
		/*
		 * System.out.println(); GymOwner = gymOwner.get(0);
		 * System.out.println(GymOwner.toString()); return GymOwner;
		 */
	}
	
	/*@RequestMapping(value = "/greeting", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Greeting> greeting() {
	    Greeting greeting1 = new Greeting(1, "One");
	    Greeting greeting2 = new Greeting(2, "Two");
	    List<Greeting> list = new ArrayList<>();
	    list.add(greeting1);
	    list.add(greeting2);
	    return list;*/
	
	@PostMapping(value = "/saveOwnerDetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public void saveOwnerDetails(@RequestBody GymOwner gymOwner) {
		gymOwnerService.saveOwnerDetails(gymOwner);
	}
	}

