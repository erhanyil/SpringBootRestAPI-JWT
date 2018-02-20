package com.stdiosoft.Controllers;


import com.stdiosoft.Repository.UsersRepository;
import com.stdiosoft.Response.ReturnResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projects")
public class ProjectsController {

    @Autowired
    private UsersRepository usersRepository;

    @RequestMapping(value ="")
    @PreAuthorize("hasAuthority('ADMIN_USER')")
    public ReturnResponse getUser(){
        return usersRepository.getP();
    }
}
