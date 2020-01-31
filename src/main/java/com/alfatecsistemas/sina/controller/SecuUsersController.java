package com.alfatecsistemas.sina.controller;

import com.alfatecsistemas.sina.domain.SecuUsers;
import com.alfatecsistemas.sina.service.SecuUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")

public class SecuUsersController {

    @Autowired
    private SecuUsersService secuUsersService;
    @GetMapping(headers = "Accept=application/json")
    public SecuUsers getUsers(){
        return secuUsersService.getUsers();
    }


}
