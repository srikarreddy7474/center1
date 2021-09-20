package com.htc.vaccinationdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.htc.vaccinationdetails.entity.center;
import com.htc.vaccinationdetails.repository.centerinterface;



@RestController
public class vaccinationcontroller {

	@Autowired
	private centerinterface centreServiceInterface;
	
	@GetMapping("/vaccination/centre/{centreid}")
	public center getCentrebyId(@PathVariable Long centreid) {
		return centreServiceInterface.findById(centreid).get();
	}
	
	@PostMapping("/create/centre")
	public center createCentre(@RequestBody center centreService) {
		return centreServiceInterface.save(centreService);
	}
	
	@GetMapping("/vaccination/centre/{pincode}")
	public List<center> getCentrebypinCode(@PathVariable Long pincode) {
		return centreServiceInterface.findByPincode(pincode);
	}
}
