/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Framework2ConsumeAPI.services;

import com.example.Framework2ConsumeAPI.entities.rest.Major;
import com.example.Framework2ConsumeAPI.entities.rest.University;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author ASUS
 */
@Service
public class GetRestService {
    @Autowired 
    RestTemplate restTemplate;
    
    public List<University> getAllUniversity() {
        List<University> result;
        //respon
        ResponseEntity<List<University>> response = restTemplate.exchange(
                "http://116.254.101.228:8080/ma_test/get/universities",
                HttpMethod.GET,
                HttpEntity.EMPTY,
                new ParameterizedTypeReference<List<University>>() {
        });
        result = response.getBody();
        return result;
    }
    
    public List<Major> getAllMajor() {
        List<Major> result;
        //respon
        ResponseEntity<List<Major>> response = restTemplate.exchange(
                "http://116.254.101.228:8080/ma_test/get/majors",
                HttpMethod.GET,
                HttpEntity.EMPTY,
                new ParameterizedTypeReference<List<Major>>() {
        });
        result = response.getBody();
        return result;
    }
    
}