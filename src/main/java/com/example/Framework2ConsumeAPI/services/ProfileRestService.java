/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Framework2ConsumeAPI.services;

import com.example.Framework2ConsumeAPI.entities.rest.ProfileAddress;
import com.example.Framework2ConsumeAPI.entities.rest.ProfileBasic;
import com.example.Framework2ConsumeAPI.entities.rest.ProfileContact;
import com.example.Framework2ConsumeAPI.entities.rest.ProfileEducation;
import com.example.Framework2ConsumeAPI.entities.rest.ProfileOccupation;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author acer
 */
@Service
public class ProfileRestService {

    @Autowired
    RestTemplate restTemplate;

    public ProfileBasic getProfileBasic(String id) {
        ProfileBasic result;
        Map<String, String> param = new HashMap<>();

        param.put("id", id);

        result = restTemplate.getForObject("http://116.254.101.228:8080/ma_test/profile/basic/{id}", ProfileBasic.class, param);
        return result;

    }

    public ProfileAddress getProfileAddress(String id) {
        ProfileAddress result;
        Map<String, String> param = new HashMap<>();

        param.put("id", id);

        result = restTemplate.getForObject("http://116.254.101.228:8080/ma_test/profile/address/{id}", ProfileAddress.class, param);
        return result;
    }

    public ProfileContact getProfileContact(String id) {
        ProfileContact result;
        Map<String, String> param = new HashMap<>();

        param.put("id", id);

        result = restTemplate.getForObject("http://116.254.101.228:8080/ma_test/profile/contact/{id}", ProfileContact.class, param);
        return result;
    }

    public ProfileOccupation getProfileOccupation(String id) {
        ProfileOccupation result;
        Map<String, String> param = new HashMap<>();

        param.put("id", id);

        result = restTemplate.getForObject("http://116.254.101.228:8080/ma_test/profile/currentoccupation/{id}", ProfileOccupation.class, param);
        return result;
    }

    public ProfileEducation getProfileEducation(String id) {
        ProfileEducation result;
        Map<String, String> param = new HashMap<>();

        param.put("id", id);

        result = restTemplate.getForObject("http://116.254.101.228:8080/ma_test/profile/education/{id}", ProfileEducation.class, param);
        return result;
    }

    public boolean updateProfileBasic(ProfileBasic input) {
        HttpEntity<ProfileBasic> request = new HttpEntity<>(input, null);
        ResponseEntity<Boolean> responseEntity = restTemplate.exchange("http://116.254.101.228:8080/ma_test/profile/basic",
                HttpMethod.POST,
                request,
                new ParameterizedTypeReference<Boolean>() {
        }
        );
        return responseEntity.getBody();
    }
    
    public boolean updateProfileAddress(ProfileAddress input) {
        HttpEntity<ProfileAddress> request = new HttpEntity<>(input, null);
        ResponseEntity<Boolean> responseEntity = restTemplate.exchange("http://116.254.101.228:8080/ma_test/profile/address",
                HttpMethod.POST,
                request,
                new ParameterizedTypeReference<Boolean>() {
        }
        );
        return responseEntity.getBody();
    }
    
    public boolean updateProfileContact(ProfileContact input) {
        HttpEntity<ProfileContact> request = new HttpEntity<>(input, null);
        ResponseEntity<Boolean> responseEntity = restTemplate.exchange("http://116.254.101.228:8080/ma_test/profile/contact",
                HttpMethod.POST,
                request,
                new ParameterizedTypeReference<Boolean>() {
        }
        );
        return responseEntity.getBody();
    }
    
    public boolean updateProfileOccupation(ProfileOccupation input) {
        HttpEntity<ProfileOccupation> request = new HttpEntity<>(input, null);
        ResponseEntity<Boolean> responseEntity = restTemplate.exchange("http://116.254.101.228:8080/ma_test/profile/currentoccupation",
                HttpMethod.POST,
                request,
                new ParameterizedTypeReference<Boolean>() {
        }
        );
        return responseEntity.getBody();
    }
    
    public boolean updateProfileEducation(ProfileEducation input) {
        HttpEntity<ProfileEducation> request = new HttpEntity<>(input, null);
        ResponseEntity<Boolean> responseEntity = restTemplate.exchange("http://116.254.101.228:8080/ma_test/profile/education",
                HttpMethod.POST,
                request,
                new ParameterizedTypeReference<Boolean>() {
        }
        );
        return responseEntity.getBody();
    }
}
