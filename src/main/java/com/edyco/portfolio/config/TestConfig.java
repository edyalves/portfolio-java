package com.edyco.portfolio.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.edyco.portfolio.entities.Company;
import com.edyco.portfolio.entities.Education;
import com.edyco.portfolio.entities.User;
import com.edyco.portfolio.repositories.CompanyRepository;
import com.edyco.portfolio.repositories.EducationRepository;
import com.edyco.portfolio.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private CompanyRepository companyRepository;
	@Autowired
	private EducationRepository educationRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown");
		User u2 = new User(null, "Alex Green");

		Company c1 = new Company(null, "Empresa A", Instant.parse("2021-01-20T19:53:07Z"), Instant.parse("2021-03-20T19:53:07Z"), "Esta é uma descrição da empresa A", u1);
		Company c2 = new Company(null, "Empresa B", Instant.parse("2021-03-20T19:53:07Z"), Instant.parse("2021-06-20T19:53:07Z"), "Esta é uma descrição da empresa B", u1);
		Company c3 = new Company(null, "Empresa B", Instant.parse("2021-01-20T19:53:07Z"), Instant.parse("2021-06-20T19:53:07Z"), "Esta é uma descrição da empresa B", u2);
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		companyRepository.saveAll(Arrays.asList(c1,c2,c3));
	}

}
