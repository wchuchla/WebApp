package com.luxoft.spring.webapp.web;

import com.luxoft.spring.webapp.model.Property;
import com.luxoft.spring.webapp.service.PropertiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/properties")
public class PropertiesController {

    @Autowired
    private PropertiesService propertiesService;

    @RequestMapping(value = "/{name}", method = GET)
    public Property getByName(@PathVariable String name) {
        return propertiesService.getProperty(name);
    }

    @RequestMapping(method = GET)
    public Collection<Property> getAll() {
        return propertiesService.getAll();
    }

    @RequestMapping(method = POST)
    public void addProperty(@RequestBody Property property) {
        propertiesService.addProperty(property);
    }
}
