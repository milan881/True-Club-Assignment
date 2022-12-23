package com.trueclub.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trueclub.entites.Assignment;
import com.trueclub.repositries.TrueClubRepositries;

@RestController
@RequestMapping("/Assignment/api")
public class LeadRestController {

	@Autowired
	TrueClubRepositries trueClub;
	
	//Insert new record in database
	//localhost:8080/Assignment/api/save
	@PostMapping("/save")
	public void saveData(@RequestBody Assignment Assi) {
		trueClub.save(Assi);
	}
	
	//Get the record based on given id
	@GetMapping("/get/{id}")
	//localhost:8080/Assignment/api/get/1
	public Assignment getLeadbyid(@PathVariable ("id") long id) {
	Optional<Assignment> findById = trueClub.findById(id);
		Assignment lead = findById.get();
		return lead;
	}
	
	//update the existing record
	@PutMapping("/update")
	//localhost:8080/Assignment/api/update
	public void UpdateLeadData(@RequestBody Assignment Assi) {
		trueClub.save(Assi);
	}
	
	//Delete the record based on id
	@DeleteMapping("/delete/{id}")
	//localhost:8080/Assignment/api/delete/{id}
	public void DeleteLeadData(@PathVariable("id") long id) {
		trueClub.deleteById(id);
	}
	
	//Get all record
	@GetMapping
	//localhost:8080/Assignment/api
	public List<Assignment> getallData(){
		List<Assignment> findAllData = trueClub.findAll();
		return findAllData;
	}
	
}
