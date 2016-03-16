package com.luxoft.spring.webapp.web;

import com.luxoft.spring.webapp.model.PropertyCategory;
import com.luxoft.spring.webapp.service.PropertyCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/category")
public class PropertyCategoriesController {

    @Autowired
    private PropertyCategoryService propertyCategoryService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<PropertyCategory> getAll() {
        return propertyCategoryService.getAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addPropertyCategory(@RequestBody PropertyCategory propertyCategory) {
        propertyCategoryService.addPropertyCategory(propertyCategory);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public PropertyCategory getById(@PathVariable Long id) {
        return propertyCategoryService.getById(id);
    }
}
