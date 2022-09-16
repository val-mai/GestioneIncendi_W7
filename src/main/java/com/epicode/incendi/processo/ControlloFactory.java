package com.epicode.incendi.processo;

import com.epicode.incendi.sonda.SondaDto;

public interface ControlloFactory {

	public ProcessoControllo creaControllo(SondaDto dto);
	
}
