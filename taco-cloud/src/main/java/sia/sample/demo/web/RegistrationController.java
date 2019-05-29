/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sia.sample.demo.web;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import sia.sample.demo.data.UserRepository;
import sia.sample.demo.security.RegistrationForm;

/**
 *
 * @author usgdal
 */
@Controller
@RequestMapping("/register")
public class RegistrationController {
    
    private UserRepository userRepo;
    private PasswordEncoder passwordEconder;
    
    public RegistrationController(UserRepository userRepo, PasswordEncoder encoder) {
        this.userRepo = userRepo;
        this.passwordEconder = encoder;
    }
    
    @GetMapping
    public String registerForm(){
        return "registration";
    }
    
    @PostMapping
    public String processRegistration(RegistrationForm form) {
        userRepo.save(form.toUser(PasswordEncoder));
        return "redirect:/login";
    }
    
}
