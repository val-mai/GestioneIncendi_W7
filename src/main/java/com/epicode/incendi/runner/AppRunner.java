package com.epicode.incendi.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.epicode.incendi.centrocontrollo.CentroControllo;
import com.epicode.incendi.sonda.Sonda;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class AppRunner implements ApplicationRunner {

	@Autowired @Qualifier(value = "sonda1")
	private Sonda sond1;	
	@Autowired @Qualifier(value = "sonda2")
	private Sonda sond2;	
	@Autowired @Qualifier(value = "roma")
	private CentroControllo roma;
	@Autowired @Qualifier(value = "milano")
	private CentroControllo milano;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		log.info("------------- Centri di Controllo in ascolto ----------");
		sond1.subscribe(roma);
		sond1.subscribe(milano);
		sond2.subscribe(milano);
		
		sond1.setLivelloFumo(4);
		sond2.setLivelloFumo(3);
		sond2.setLivelloFumo(8);		
		sond1.setLivelloFumo(6);

		
	}

}
