package com.epicode.incendi.processo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import com.epicode.incendi.centrocontrollo.CentroControllo;
import com.epicode.incendi.sonda.Sonda;
import com.epicode.incendi.sonda.SondaDto;

@SpringBootTest
public class TestControlloHttp {

	@Autowired @Qualifier(value = "sondaTest")
	private Sonda sonda;
	@Autowired @Qualifier(value = "roma")
	private CentroControllo roma;
	@Autowired
	private ProcessoControlloHttp controllo;
	
	@Test
	public void rilevaIncendioFalse() {
		sonda.subscribe(roma);
		sonda.setLivelloFumo(2);
		SondaDto dto = new SondaDto((Sonda) sonda);
		assertThat(controllo.rilevaIncendio(dto, null)).isNull();
	}
	
	@Test
	public void rilevaIncendioTrue() {
		sonda.subscribe(roma);
		sonda.setLivelloFumo(8);
		SondaDto dto = new SondaDto((Sonda) sonda);
		assertThat(controllo.rilevaIncendio(dto, null)).isNotNull();
	}
}
