package com.edyco.portfolio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edyco.portfolio.entities.Education;
import com.edyco.portfolio.repositories.EducationRepository;

@Service
public class EducationService {

	@Autowired
	private EducationRepository repository;
	
	public List<Education> findAll(){
		return repository.findAll();
	}
	
	public Education findById(Long id) {
		Optional<Education> obj = repository.findById(id);
		return obj.get();
	}
	
}
