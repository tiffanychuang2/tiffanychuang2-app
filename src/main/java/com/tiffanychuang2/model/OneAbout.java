package com.tiffanychuang2.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;

@Entity
public class OneAbout {

	@Id
	@GeneratedValue
	private Long id;
	private String aboutTitle;
	
	@Lob
	private String aboutPar;
	
	@ManyToMany
	private Set<Image> imageTags;
	
	protected OneAbout() {
	}
	
	//constructors
	public OneAbout(String aboutTitle, String aboutPar, Image... imageTags) {
		this.aboutTitle = aboutTitle;
		this.aboutPar = aboutPar;
		this.imageTags = new HashSet<Image>(Arrays.asList(imageTags));
	}
	
	//getters
	public Long getId() {
		return id;
	}
	
	public String getAboutTitle() {
		return aboutTitle;
	}
	
	public String getAboutPar() {
		return aboutPar;
	}
	
	public Set<Image> getImageTags() {
		return imageTags;
	}
	
	//setters
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setAboutTitle(String aboutTitle) {
		this.aboutTitle = aboutTitle;
	}
	
	public void setAboutPar(String aboutPar) {
		this.aboutPar = aboutPar;
	}
	
	public void setImageTags(Set<Image> imageTags) {
		this.imageTags = imageTags;
	}
}