package com.luxoft.spring.webapp.repository;

import com.luxoft.spring.webapp.model.Property;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class FilePropertiesRepository implements PropertiesRepository {

    @Override
    public void addProperty(Property property) {

    }

    @Override
    public Property getProperty(String name) {
        return null;
    }

    @Override
    public Collection<Property> getAll() {
        return null;
    }
}
