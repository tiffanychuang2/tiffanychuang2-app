package com.tiffanychuang2.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Image {
	
	@Id
	@GeneratedValue
//	(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String imageUrl;
	
	@ManyToMany(mappedBy = "imageTags")
	private Set<OneAbout> imagesForTags;
	
	//constructors
	protected Image() {
		
	}
	
	public Image(String name, String imageUrl) {
		this.name = name;
		this.imageUrl = imageUrl;
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
	
	public Set<OneAbout> getImagesForTags() {
		return imagesForTags;
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
	
	@Override
	public String toString() {
		return name + " " + imageUrl;
	}

}
