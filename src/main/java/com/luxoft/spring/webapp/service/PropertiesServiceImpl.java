package com.luxoft.spring.webapp.service;

import com.luxoft.spring.webapp.model.Property;
import com.luxoft.spring.webapp.repository.PropertiesRepository;
import com.luxoft.spring.webapp.utils.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PropertiesServiceImpl implements PropertiesService {

    @Autowired
    private Logger LOGGER;

    @Autowired
    @Qualifier("memoryPropertiesRepository")
    private PropertiesRepository propertiesRepository;

    @Override
    public void addProperty(Property property) {
        propertiesRepository.addProperty(property);
    }

    @Override
    public Property getProperty(String name) {
        return propertiesRepository.getProperty(name);
    }

    @Override
    public Collection<Property> getAll() {
        return propertiesRepository.getAll();
    }

}
