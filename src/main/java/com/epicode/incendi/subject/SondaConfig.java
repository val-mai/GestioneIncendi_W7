package com.epicode.incendi.subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SondaConfig {
	
	@Autowired
	private SondaRepository repo;

	@Bean(name = "sonda1")
	public Sonda newSonda1() {
		Sonda s1 = new Sonda();
		s1.setLatitudine(27.5);
		s1.setLongitudine(29.5);
		repo.save(s1);
		return s1;
	}
}
