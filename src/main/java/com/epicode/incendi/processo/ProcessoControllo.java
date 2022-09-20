package com.epicode.incendi.processo;

import com.epicode.incendi.sonda.SondaDto;

public interface ProcessoControllo {

	public SondaDto rilevaIncendio(SondaDto dto, String name);
	
}
