package com.luxoft.spring.webapp.service;

import com.luxoft.spring.webapp.model.Property;
import com.luxoft.spring.webapp.repository.JpaPropertiesRepository;
import com.luxoft.spring.webapp.utils.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@Service
@Transactional
public class PropertiesServiceImpl implements PropertiesService {

    @Autowired
    private Logger LOGGER;

    @Autowired
    @Qualifier("jpaPropertiesRepository")
    private JpaPropertiesRepository propertiesRepository;

    @Override
    public void addProperty(Property property) {
        propertiesRepository.save(property);
    }

    @Override
    public Property getProperty(String name) {
        return propertiesRepository.findByName(name);
    }

    @Override
    public Collection<Property> getAll() {
        return propertiesRepository.findAll();
    }

}
