package com.epicode.incendi.sonda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SondaConfig {
	
	@Autowired
	private SondaRepository repo;

	@Bean(name = "sonda1")
	public Sonda newSonda1() {
		Sonda s = new Sonda();
		s.setLatitudine(27.5);
		s.setLongitudine(29.5);
		repo.save(s);
		return s;
	}
	
	@Bean(name = "sonda2")
	public Sonda newSonda2() {
		Sonda s = new Sonda();
		s.setLatitudine(55.5);
		s.setLongitudine(30.5);
		repo.save(s);
		return s;
	}
}
