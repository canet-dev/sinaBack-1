package com.alfatecsistemas.sina.dto;

public class UserDto {

    private String name;

    private String password;

    private Integer profId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getProfessionalId() {
        return profId;
    }

    public void setProfessionalId(Integer professionalId) {
        this.profId = professionalId;
    }
}
