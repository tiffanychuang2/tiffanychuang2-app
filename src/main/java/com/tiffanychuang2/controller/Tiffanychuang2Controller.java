package com.tiffanychuang2.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tiffanychuang2.repository.AboutRepository;
import com.tiffanychuang2.repository.ContactRepository;
import com.tiffanychuang2.repository.ExperienceRepository;
import com.tiffanychuang2.repository.PageRepository;



@Controller
public class Tiffanychuang2Controller {

	@Resource
	AboutRepository aboutRepo;
	
	@Resource
	ContactRepository contactRepo;
	
	@Resource
	ExperienceRepository experienceRepo;
	
	@Resource
	PageRepository pageRepo;
	
	@RequestMapping("/")
	public String getAllPagesIndex (Model model) {
		model.addAttribute("home", pageRepo.findAll());
		return "index";
	}

	@RequestMapping("/home")
	public String getAllPages (Model model) {
		model.addAttribute("home", pageRepo.findAll());
		return "index";

	}
	
	@RequestMapping("/allAbout")
	public String getAboutPage(Model model) {
		model.addAttribute("allAbout", aboutRepo.findAll());
		return "allAbout";
	}
	
	@RequestMapping("/oneAbout")
	public String getOneAbout(@RequestParam Long id, Model model) {
		model.addAttribute("oneAbout", aboutRepo.findById(id));
		return "oneAbout";
	}
	
	
}


