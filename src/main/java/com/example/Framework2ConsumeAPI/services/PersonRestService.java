/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Framework2ConsumeAPI.services;

import com.example.Framework2ConsumeAPI.entities.Person;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Josua
 */
@Service
public class PersonRestService {

    @Autowired
    RestTemplate restTemplate;

    @Value("${api.uri}")
    private String uri;

    //getAll
    public List<Person> getAll() {
        List<Person> result;
        //respon
        ResponseEntity<List<Person>> response = restTemplate.exchange(
                uri,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                new ParameterizedTypeReference<List<Person>>() {
        });
        result = response.getBody();
        return result;
    }
    
    //getMale
    public List<Person> getMaleGender(String gender){
        List<Person> result;
        ResponseEntity<List<Person>> response = restTemplate.exchange(
                uri + "/gender/male", 
                HttpMethod.GET, 
                null, 
                new ParameterizedTypeReference<List<Person>>(){});
        result = response.getBody();
        return result;
    }
    
    //getFemale
    public List<Person> getFemaleGender(String gender){
        List<Person> result;
        ResponseEntity<List<Person>> response = restTemplate.exchange(
                uri + "/gender/female", 
                HttpMethod.GET, 
                null, 
                new ParameterizedTypeReference<List<Person>>(){});
        result = response.getBody();
        return result;
    }

    //save
    public void save(Person person) {
        restTemplate.postForObject(uri, person, Person.class);
    }
    
    public Person getById(String id){
        
        Person result;
        Map<String, String> param = new HashMap<>();
        // hasil > []
        param.put("id", id);
        // hasil > ["id" : "P01"]
        result = restTemplate.getForObject(uri+"/{id}", Person.class, param);
        return result;
    }
    public void delete(String id) {

        Map<String, String> param = new HashMap<>();
        param.put("id", id); // hasil -> { "id" : "P01" }

        restTemplate.delete(uri + "/{id}", param);
    }
    
}
