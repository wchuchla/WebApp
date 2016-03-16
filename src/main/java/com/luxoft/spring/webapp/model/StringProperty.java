package com.luxoft.spring.webapp.model;

import javax.persistence.Entity;

@Entity
public class StringProperty<T> extends Property<String> {

    private String stringValue;

    @Override
    public String getValue() {
        return stringValue;
    }

    @Override
    public void setValue(String value) {
        this.stringValue = stringValue;
    }

}
