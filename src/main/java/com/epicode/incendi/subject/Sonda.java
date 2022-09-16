package com.epicode.incendi.subject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Sonda extends Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double latitudine;
	private Double longitudine;
	private Integer livelloFumo;
	
	public void setLivelloFumo(Integer livello) {
		this.livelloFumo = livello;
		if (this.livelloFumo >5) {
			notifyObserver();
		}
	}
	
}
