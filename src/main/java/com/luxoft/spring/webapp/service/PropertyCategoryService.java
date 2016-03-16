package com.luxoft.spring.webapp.service;

import com.luxoft.spring.webapp.model.Property;
import com.luxoft.spring.webapp.model.PropertyCategory;

import java.util.Collection;

public interface PropertyCategoryService {

    Collection<PropertyCategory> getAll();

    PropertyCategory getById(Long id);

    void addPropertyCategory(PropertyCategory propertyCategory);

    void addProperty(Long categoryId, Property property);
}
