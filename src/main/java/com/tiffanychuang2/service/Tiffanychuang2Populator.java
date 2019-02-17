package com.tiffanychuang2.service;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tiffanychuang2.model.About;
import com.tiffanychuang2.model.Page;
import com.tiffanychuang2.repository.AboutRepository;
import com.tiffanychuang2.repository.PageRepository;

@Component
public class Tiffanychuang2Populator implements CommandLineRunner {
	
	@Resource
	private AboutRepository aboutRepo;
	
	@Resource
	private PageRepository pageRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Page about = new Page("About", "./images/polaroid-one.JPEG");
		pageRepo.save(about);
		Page experience = new Page("Experience", "./images/polaroid-one.JPEG");
		pageRepo.save(experience);
		Page contact = new Page("Contact", "./images/polaroid-one.JPEG");
		pageRepo.save(contact);
		
		About dogs = new About("Dog Lover", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum");
		aboutRepo.save(dogs);
		
		About texas = new About("Texas Born and Raised", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum");
		aboutRepo.save(texas);
		
		About bootcamp = new About("Bootcamp", "Lorem ipsum dolor sit amet, consectetur");
		aboutRepo.save(bootcamp);
		
//		//images for dogs
//		Image dogImg = new Image("dog", "./images/derps.JPG", dogs);
//		
//		//images for texas
//		Image tx = new Image("texas state fair", "./images/derps.JPG", texas);
//		
//		//images for columbus
//		Image columbus = new Image("columbus", "./images/derps.JPG", dogs);
//		
//		//images for travel
//		Image travel = new Image("travel", "./images/smokey-mountains.JPG", texas);
//		
	}

}
