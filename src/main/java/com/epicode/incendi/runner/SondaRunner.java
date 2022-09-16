package com.epicode.incendi.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.epicode.incendi.listeners.CentroControllo;
import com.epicode.incendi.subject.Sonda;

@Component
public class SondaRunner implements ApplicationRunner {

	@Autowired
	@Qualifier(value = "sonda1")
	private Sonda sond1;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		CentroControllo roma = new CentroControllo(1L, "Roma");
		CentroControllo firenze = new CentroControllo(2L, "Firenze");
		
		sond1.subscribe(roma);
		sond1.subscribe(firenze);
		// sond3.subscribe(roma);
		// sond3.subscribe(firenze);
		// sond2.subscribe(bari);
		
		sond1.setLivelloFumo(6);
		// sond2.setLivelloFumo(8);
		
	}

}
