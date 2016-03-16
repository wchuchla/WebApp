package com.luxoft.spring.webapp.model;

import javax.persistence.Embeddable;

@Embeddable
public class UserInfo {

    private String login;
    private String email;
    private String fullName;

    public UserInfo() {
    }

    public UserInfo(String login, String email, String fullName) {
        this.login = login;
        this.email = email;
        this.fullName = fullName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
