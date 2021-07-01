package com.edyco.portfolio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edyco.portfolio.entities.Education;
import com.edyco.portfolio.services.EducationService;

@RestController
@RequestMapping(value="/educations")
public class EducationResource {
	
	@Autowired
	private EducationService service;
	
	@GetMapping
	public ResponseEntity<List<Education>> findAll(){
		List<Education> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Education> findById(@PathVariable Long id){
		Education obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
