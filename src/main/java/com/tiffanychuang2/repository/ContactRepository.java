package com.tiffanychuang2.repository;

import org.springframework.data.repository.CrudRepository;

import com.tiffanychuang2.model.Contact;

public interface ContactRepository extends CrudRepository<Contact, Long> {

}