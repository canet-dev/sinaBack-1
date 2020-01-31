package com.alfatecsistemas.sina.service.impl;


import com.alfatecsistemas.sina.domain.SecuUsers;
import com.alfatecsistemas.sina.service.SecuUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecuUsersServiceImpl implements SecuUsersService {

    @Autowired
    private SecuUsersService secuUsersService;

    public SecuUsers getUsers(){
        return secuUsersService.getUsers();
    }
}
