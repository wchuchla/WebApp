package com.luxoft.spring.webapp.repository;


import com.luxoft.spring.webapp.model.Property;

import java.util.Collection;

public interface PropertiesRepository {

    void addProperty(Property property);

    Property getProperty(String name);

    Collection<Property> getAll();

}
