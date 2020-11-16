
package com.example.Framework2ConsumeAPI.controllers;

import com.example.Framework2ConsumeAPI.entities.rest.LoginInput;
import com.example.Framework2ConsumeAPI.entities.rest.RegisterUser;
import com.example.Framework2ConsumeAPI.services.RegistrationRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author acer
 */
@Controller
public class RegistrationRestController {
    @Autowired
    RegistrationRestService service;
    
    @GetMapping("registrasi")
    public String regris(Model model){
        model.addAttribute("registrasi",new RegisterUser());
        return "formRegistrasi";
    }
    
    @PostMapping("save")
    public String register(RegisterUser input){
         System.out.println(input);
         System.out.println(service.register(input));
         return "redirect:/";
    }
}
