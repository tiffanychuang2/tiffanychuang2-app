package com.tiffanychuang2.repository;

import org.springframework.data.repository.CrudRepository;

import com.tiffanychuang2.model.Image;

public interface ImageRepository extends CrudRepository<Image, Long> {

}
