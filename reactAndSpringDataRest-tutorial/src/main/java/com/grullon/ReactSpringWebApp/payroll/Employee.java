/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grullon.ReactSpringWebApp.payroll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author dannylantigua
 */
@Data
@Entity
public class Employee {
    
    private @Id @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private String description;
    
    private Employee() {}
    
    public Employee(String fisrtName, String lastName, String description){
        this.firstName = fisrtName;
        this.lastName = lastName;
        this.description = description;
    }
}
