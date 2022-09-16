package com.epicode.incendi.centrocontrollo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CentroControlloConfig {

	@Autowired
	private CentroControlloRepository repo;
	
	@Bean(name = "roma")
	public CentroControllo roma() {
		CentroControllo c = new CentroControllo();
		c.setName("Roma");
		repo.save(c);
		return c;
	}
	
	@Bean(name = "milano")
	public CentroControllo milano() {
		CentroControllo c = new CentroControllo();
		c.setName("Milano");
		repo.save(c);
		return c;
	}
}
