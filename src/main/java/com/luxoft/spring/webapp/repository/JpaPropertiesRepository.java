package com.luxoft.spring.webapp.repository;

import com.luxoft.spring.webapp.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JpaPropertiesRepository extends JpaRepository<Property, Long> {

    Property save (Property property);

    List<Property> findAll();

    Property findByName(String name);

}
