package com.alfatecsistemas.sina.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ORMA_AMBITS")
public class OrmaAmbits {



    @Id
    @GeneratedValue
    @Column(name="AMBI_ID")
    private Integer ambiId;

    @Column(name="AMBI_CODE")
    private String ambiCode;

    @Column(name="AMBI_DESCRIPTION")
    private String ambiDescription;

    @Column(name="AMBI_DELETED")
    private Boolean ambiDeleted;

    @Column(name="AMBI_DELETED_DATE")
    private LocalDateTime ambiDeletedDate;

    public Integer getAmbifId() {
        return ambiId;
    }

    public Integer getAmbiId() {
        return ambiId;
    }

    public void setAmbiId(Integer ambiId) {
        this.ambiId = ambiId;
    }

    public String getAmbiCode() {
        return ambiCode;
    }

    public void setAmbiCode(String ambiCode) {
        this.ambiCode = ambiCode;
    }

    public String getAmbiDescription() {
        return ambiDescription;
    }

    public void setAmbiDescription(String ambiDescription) {
        this.ambiDescription = ambiDescription;
    }

    public Boolean getAmbiDeleted() {
        return ambiDeleted;
    }

    public void setAmbiDeleted(Boolean ambiDeleted) {
        this.ambiDeleted = ambiDeleted;
    }

    public LocalDateTime getAmbiDeletedDate() {
        return ambiDeletedDate;
    }

    public void setAmbiDeletedDate(LocalDateTime ambiDeletedDate) {
        this.ambiDeletedDate = ambiDeletedDate;
    }
}