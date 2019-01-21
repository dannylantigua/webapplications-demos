/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grullon.ReactSpringWebApp.payroll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author dannylantigua
 */
@Controller
public class HomeController {
    
    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }
}
