package com.epicode.incendi.processo;

import com.epicode.incendi.sonda.SondaDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProcessoControlloHttp implements ProcessoControllo {

	@Override
	public void rilevaIncendio(SondaDto dto, String name) {		
		log.info("CENTRO DI CONTROLLO {} - ALLARME PROVOCATO DALLA SONDA {} : http://alarm?=idsonda={}&lat={}&lon={}&smokelevel={}",name,dto.getId() ,dto.getId(), dto.getLatitudine(), dto.getLongitudine(),dto.getLivelloFumo());
	}

}
