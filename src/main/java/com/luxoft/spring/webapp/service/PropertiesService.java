package com.luxoft.spring.webapp.service;

import com.luxoft.spring.webapp.model.Property;

import java.util.Collection;

public interface PropertiesService {

    void addProperty(Property property);

    Property getProperty(String name);

    Collection<Property> getAll();
}
