package com.epicode.incendi.listeners;

import com.epicode.incendi.subject.SondaDto;

public interface ControlloFactory {

	public ProcessoControllo creaControllo(SondaDto dto);
	
}
