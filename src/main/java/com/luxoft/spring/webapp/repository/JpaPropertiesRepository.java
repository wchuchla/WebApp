package com.luxoft.spring.webapp.repository;

import com.luxoft.spring.webapp.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaPropertiesRepository extends JpaRepository<Property, Long> {

    Property findByName(String name);

}
