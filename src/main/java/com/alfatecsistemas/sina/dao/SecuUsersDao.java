package com.alfatecsistemas.sina.dao;

import com.alfatecsistemas.sina.domain.SecuUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecuUsersDao extends JpaRepository<SecuUsers, Long> {

}
