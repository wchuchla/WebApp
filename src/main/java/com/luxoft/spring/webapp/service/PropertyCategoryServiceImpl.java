package com.luxoft.spring.webapp.service;

import com.luxoft.spring.webapp.model.Property;
import com.luxoft.spring.webapp.model.PropertyCategory;
import com.luxoft.spring.webapp.repository.JpaPropertyCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
@Transactional
public class PropertyCategoryServiceImpl implements PropertyCategoryService {

    @Autowired
    JpaPropertyCategoryRepository jpaPropertyCategoryRepository;

    @Override
    public Collection<PropertyCategory> getAll() {
        return jpaPropertyCategoryRepository.findAll();
    }

    @Override
    public PropertyCategory getById(Long id) {
        return jpaPropertyCategoryRepository.findOne(id);
    }

    @Override
    public void addPropertyCategory(PropertyCategory propertyCategory) {
        jpaPropertyCategoryRepository.save(propertyCategory);
    }

    @Override
    public void addProperty(Long categoryId, Property property) {
        PropertyCategory category = jpaPropertyCategoryRepository.findOne(categoryId);
        category.addProperty(property);
    }
}
