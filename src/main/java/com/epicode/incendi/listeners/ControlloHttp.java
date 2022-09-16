package com.epicode.incendi.listeners;

import com.epicode.incendi.subject.SondaDto;

public class ControlloHttp implements ControlloFactory {

	@Override
	public ProcessoControlloHttp creaControllo(SondaDto dto) {
		return new ProcessoControlloHttp();
	}
}
