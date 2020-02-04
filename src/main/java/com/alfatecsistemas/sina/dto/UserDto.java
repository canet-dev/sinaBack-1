package com.alfatecsistemas.sina.dto;

public class UserDto {

    private Integer id;

    private String name;

    private String password;

    private Integer profId;

    private ProfessionalDto professional;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProfessionalId() {
        return profId;
    }

    public void setProfessionalId(Integer professionalId) {
        this.profId = professionalId;
    }

    public ProfessionalDto getProfessional() {
        return professional;
    }

    public void setProfessional(ProfessionalDto professional) {
        this.professional = professional;
    }
}
