package com.luxoft.spring.webapp.repository;

import com.luxoft.spring.webapp.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaPropertiesRepository extends JpaRepository<Property, Long> {

    Property save (Property property);

    List<Property> findAll();

    Property findByName(String name);

}
