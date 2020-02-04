package com.alfatecsistemas.sina.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "SECU_ROLES")
public class SecuRoles {



    @Id
    @GeneratedValue
    @Column(name="SROL_CODE")
    private String srolCode;

    @Column(name="SROL_DESCRIPTION")
    private String srolDescription;

    @Column(name="SROL_DELETED")
    private Boolean srolDeleted;

    @Column(name="SROL_DELETED_DATE")
    private LocalDateTime srolDeletedDate;
}
