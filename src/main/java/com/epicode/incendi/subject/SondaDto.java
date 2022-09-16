package com.epicode.incendi.subject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SondaDto {

	private Long id;
	private Double latitudine;
	private Double longitudine;
	private Integer livelloFumo;
	
	public SondaDto(Sonda sonda) {
		this.id = sonda.getId();
		this.latitudine = sonda.getLatitudine();
		this.longitudine = sonda.getLongitudine();
		this.livelloFumo = sonda.getLivelloFumo();
	}
}
