package com.tiffanychuang2.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

@Entity
public class About {

	@Id
	@GeneratedValue
	private Long id;
	private String aboutTitle;
	
	@Lob
	private String aboutPar;
	
	@OneToMany(mappedBy = "about")
	private Set<Image> images;
	
	protected About() {
	}
	
	//constructors
	public About(String aboutTitle, String aboutPar, Image... images) {
		this.aboutTitle = aboutTitle;
		this.aboutPar = aboutPar;
		this.images = new HashSet<>(Arrays.asList(images));
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
	
	public Set<Image> getImages() {
		return images;
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
	
	public void setImages(Set<Image> images) {
		this.images = images;
	}
}


//package com.tiffanychuang2.model;
//
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Set;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Lob;
//import javax.persistence.OneToMany;
//
//@Entity
//public class About {
//	
//	@Id
//	@GeneratedValue
//	private Long id;
//	
//	@Lob
//	private String about;
//	
//	@OneToMany(mappedBy = "about")
//	private Set<Image> listOfImages;
//	
////	Constructor
//	public About(String about, Image... listOfImages) {
//		this.about = about;
//		this.listOfImages = new HashSet<>(Arrays.asList(listOfImages));
//	}
//	
////	Getter
//	public Long getId() {
//		return id;
//	}
//	
//	public String getAbout() {
//		return about;
//	}
//	
////	Setters
//	public void setId(Long id) {
//		this.id = id;
//	}
//	
//	public void setAbout(String about) {
//		this.about = about;
//	}
//	
//	@Override
//	public String toString() {
//		return about;
//	}
//
//}
