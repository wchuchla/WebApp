package com.luxoft.spring.webapp.repository;

import com.luxoft.spring.webapp.model.Property;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Repository
public class MemoryPropertiesRepository implements PropertiesRepository {

    private Collection<Property> properties = new ArrayList<>();

    @Override
    public void addProperty(Property property) {
        properties.add(property);
    }

    @Override
    public Property getProperty(String name) {
        return properties
                .stream()
                .filter(property -> property.getName().equals(name))
                .findFirst()
                .get();
    }

    @Override
    public Collection<Property> getAll() {
        return properties;
    }
}
