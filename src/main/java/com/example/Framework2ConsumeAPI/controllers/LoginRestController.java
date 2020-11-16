/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Framework2ConsumeAPI.controllers;

import com.example.Framework2ConsumeAPI.entities.rest.LoginInput;
import com.example.Framework2ConsumeAPI.services.LoginRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author acer
 */
@Controller
public class LoginRestController {
    @Autowired 
    LoginRestService service;
    @GetMapping("")
    public String index(Model model){
        model.addAttribute("logininput",new LoginInput());
        return "formLogin";
    }
    
    @PostMapping("login")
    public String login(LoginInput input) {
        System.out.println(input);
        System.out.println(service.login(input));
        getId.id = service.getId(service.login(input));
        return "redirect:/basic";
    }
    
}
