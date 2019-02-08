package com.tiffanychuang2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Image {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String imageUrl;
	
	@ManyToOne
	private About about;
	
	protected Image() {
		
	}
	
	//constructors
	public Image(String name, String imageUrl, About about) {
		this.name = name;
		this.imageUrl = imageUrl;
		this.about = about;
	}

	//getters
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	
	public About getAbout() {
		return about;
	}

	
	//setters
	public void setId (Long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	public void setAbout(About about) {
		this.about = about;
	}

}
