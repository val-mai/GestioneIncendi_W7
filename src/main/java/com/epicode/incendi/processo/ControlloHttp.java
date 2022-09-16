package com.epicode.incendi.processo;

import com.epicode.incendi.sonda.SondaDto;

public class ControlloHttp implements ControlloFactory {

	@Override
	public ProcessoControlloHttp creaControllo(SondaDto dto) {
		return new ProcessoControlloHttp();
	}
}
