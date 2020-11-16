/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Framework2ConsumeAPI.entities;

import lombok.Data;

/**
 *
 * @author Josua
 */
@Data
public class Person {
    private String id, name, gender;
    private int age;

    public Person() {
        
    }

    public Person(String id, String name, String gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    } 
}
