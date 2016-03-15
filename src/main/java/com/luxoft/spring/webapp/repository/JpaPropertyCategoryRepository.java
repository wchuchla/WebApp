package com.luxoft.spring.webapp.repository;

import com.luxoft.spring.webapp.model.PropertyCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaPropertyCategoryRepository extends JpaRepository<PropertyCategory, Long> {



}
