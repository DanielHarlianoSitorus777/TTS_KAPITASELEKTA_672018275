/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Framework2ConsumeAPI.controllers;

import com.example.Framework2ConsumeAPI.entities.rest.ProfileAddress;
import com.example.Framework2ConsumeAPI.entities.rest.ProfileBasic;
import com.example.Framework2ConsumeAPI.entities.rest.ProfileContact;
import com.example.Framework2ConsumeAPI.entities.rest.ProfileEducation;
import com.example.Framework2ConsumeAPI.entities.rest.ProfileOccupation;
import com.example.Framework2ConsumeAPI.services.ProfileRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author acer
 */
@Controller
public class ProfileRestController {
    @Autowired
    ProfileRestService service;
    
    @GetMapping("basic")
    public String profileBasic(Model model){
        model.addAttribute("basic", service.getProfileBasic(getId.id));
        System.out.println(service.getProfileBasic(getId.id));
        return "profileBasic";
    }
    
    @GetMapping("address")
    public String profileAddress(Model model){
        model.addAttribute("address", service.getProfileAddress(getId.id));
        System.out.println(service.getProfileAddress(getId.id));
        return "profileAddress";
    }
    
    @GetMapping("contact")
    public String profileContact(Model model){
        model.addAttribute("contact", service.getProfileContact(getId.id));
        System.out.println(service.getProfileContact(getId.id));
        return "profileContact";
    }
    
    @GetMapping("occupation")
    public String profileOccupation(Model model){
        model.addAttribute("occupation", service.getProfileOccupation(getId.id));
        System.out.println(service.getProfileOccupation(getId.id));
        return "profileOccupation";
    }
    
    @GetMapping("education")
    public String profileEducation(Model model){
        model.addAttribute("education", service.getProfileEducation(getId.id));
        System.out.println(service.getProfileEducation(getId.id));
        return "profileEducation";
    }
    
    @PostMapping("/savebasic")
    public String saveBasic(ProfileBasic input){
        System.out.println(input);
        System.out.println(service.updateProfileBasic(input));
        return "redirect:/basic";
    }
    
    @PostMapping("/saveaddress")
    public String saveAddress(ProfileAddress input){
        System.out.println(input);
        System.out.println(service.updateProfileAddress(input));
        return "redirect:/address";
    }
    
    @PostMapping("/savecontact")
    public String saveContact(ProfileContact input){
        System.out.println(input);
        System.out.println(service.updateProfileContact(input));
        return "redirect:/contact";
    }
    
    @PostMapping("/saveoccupation")
    public String saveOccupation(ProfileOccupation input){
        System.out.println(input);
        System.out.println(service.updateProfileOccupation(input));
        return "redirect:/occupation";
    }
    
    @PostMapping("/saveeducation")
    public String saveEducation(ProfileEducation input){
        System.out.println(input);
        System.out.println(service.updateProfileEducation(input));
        return "redirect:/education";
    }
}
