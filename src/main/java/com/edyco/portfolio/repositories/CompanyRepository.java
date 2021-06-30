package com.edyco.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edyco.portfolio.entities.Company;

public interface CompanyRepository extends JpaRepository<Company, Long>{

}
