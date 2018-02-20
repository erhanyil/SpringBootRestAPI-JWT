package com.stdiosoft.Controllers;

import com.stdiosoft.Repository.UsersRepository;
import com.stdiosoft.Response.ReturnResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @RequestMapping(value ="")
    @PreAuthorize("hasAuthority('ADMIN_USER')")
    public ReturnResponse getUser(){
        return usersRepository.get();
    }

    @RequestMapping(value ="/{id}", method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
    public ReturnResponse getUsers(@PathVariable Long id){
        return usersRepository.get(id);
    }
}
