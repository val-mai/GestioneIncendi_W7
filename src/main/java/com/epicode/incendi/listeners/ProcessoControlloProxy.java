package com.epicode.incendi.listeners;

import com.epicode.incendi.subject.SondaDto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProcessoControlloProxy {

	private ProcessoControlloHttp centroControllo;
	
	public ProcessoControlloProxy(SondaDto dto) {
		ControlloHttp chttp = new ControlloHttp();
		this.centroControllo = chttp.creaControllo(dto);
	}
	
	public void rilevaIncendio(SondaDto dto, String name) {
		centroControllo.rilevaIncendio(dto, name);
	}
}
