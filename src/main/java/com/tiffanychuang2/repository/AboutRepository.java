package com.tiffanychuang2.repository;

import org.springframework.data.repository.CrudRepository;

import com.tiffanychuang2.model.OneAbout;

public interface AboutRepository extends CrudRepository<OneAbout, Long> {
	
}
