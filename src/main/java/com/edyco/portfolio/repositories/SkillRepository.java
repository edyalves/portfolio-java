package com.edyco.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edyco.portfolio.entities.Skill;

public interface SkillRepository extends JpaRepository<Skill, Long>{}
