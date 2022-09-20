package com.epicode.incendi.processo;

import org.springframework.stereotype.Component;

import com.epicode.incendi.sonda.SondaDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ProcessoControlloHttp implements ProcessoControllo {

	@Override
	public SondaDto rilevaIncendio(SondaDto dto, String name) {	
		if (dto.getLivelloFumo()>5) {
			log.info("CENTRO DI CONTROLLO {} - ALLARME PROVOCATO DALLA SONDA {} : http://alarm?=idsonda={}&lat={}&lon={}&smokelevel={}",name,dto.getId() ,dto.getId(), dto.getLatitudine(), dto.getLongitudine(),dto.getLivelloFumo());			
			return dto;
		}
		return null;
	}

}
