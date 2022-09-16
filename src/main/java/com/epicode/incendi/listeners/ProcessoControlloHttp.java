package com.epicode.incendi.listeners;

import com.epicode.incendi.subject.SondaDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProcessoControlloHttp implements ProcessoControllo {

	@Override
	public void rilevaIncendio(SondaDto dto, String name) {		
		log.info("CENTRO DI CONTROLLO {} - ALLARME SCATTATO DALLA SONDA : http://alarm?=idsonda={}&lat={}&lon={}&smokelevel={}",name,dto.getId(), dto.getLatitudine(), dto.getLongitudine(),dto.getLivelloFumo());
	}

}
