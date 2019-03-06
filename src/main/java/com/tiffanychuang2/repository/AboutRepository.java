package com.tiffanychuang2.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.yaml.snakeyaml.tokens.Token.ID;

import com.tiffanychuang2.model.OneAbout;

public interface AboutRepository extends CrudRepository<OneAbout, Long> {

	Optional<OneAbout> findById(ID id);
//	Optional<OneAbout> findById(Long id);
	
}
