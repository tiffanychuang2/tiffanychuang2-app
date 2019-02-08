package com.tiffanychuang2.model;
//
//import org.springframework.data.annotation.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Page {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String pageName;
	private String pageIcon;
	
//	constructor
	public Page(String pageName, String pageIcon) {
		this.pageName = pageName;
		this.pageIcon = pageIcon;
	}
	
//	getters
	public Long getId() {
		return id;
	}
	
	public String getPageName() {
		return pageName;
	}
	
	public String getPageIcon() {
		return pageIcon;
	}
	
//	setters
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
	
	public void setPageIcon(String pageIcon) {
		this.pageIcon = pageIcon;
	}
	
	@Override
	public String toString() {
		return pageName + " " + pageIcon;
	}
}
