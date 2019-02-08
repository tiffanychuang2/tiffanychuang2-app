package com.tiffanychuang2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

//import org.springframework.data.annotation.Id;

@Entity
public class Experience {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Lob
	private String experience;
	
//	Constructor
	public Experience(String experience) {
		this.experience = experience;
	}
	
//	Getter
	public Long getId() {
		return id;
	}
	
	public String getExperience() {
		return experience;
	}
	
//	Setters
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	@Override
	public String toString() {
		return experience;
	}

}
