package com.edyco.portfolio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edyco.portfolio.entities.Skill;
import com.edyco.portfolio.repositories.SkillRepository;

@Service
public class SkillService {

	@Autowired
	private SkillRepository repository;
	
	public List<Skill> findAll(){
		return repository.findAll();
	}
	
	public Skill findById(Long id) {
		Optional<Skill> obj = repository.findById(id);
		return obj.get();
	}
}
