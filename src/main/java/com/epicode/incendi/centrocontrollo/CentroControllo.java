package com.epicode.incendi.centrocontrollo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.epicode.incendi.processo.ProcessoControlloProxy;
import com.epicode.incendi.sonda.Sonda;
import com.epicode.incendi.sonda.SondaDto;
import com.epicode.incendi.sonda.Subject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CentroControllo implements Observer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;

	@Override
	public void update(Subject sonda) {
		
		SondaDto dto = new SondaDto((Sonda) sonda);
		ProcessoControlloProxy proxy = new ProcessoControlloProxy(dto);
		proxy.rilevaIncendio(dto, this.name);
		
	}

}
