/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sia.sample.demo.security;

import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;
import sia.sample.demo.User;

/**
 *
 * @author usgdal
 */
@Data
public class RegistrationForm {
    
    private String username;
    private String password;
    private String fullName;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String phone;
    
    public User toUser(PasswordEncoder passwordEncoder) {
        return new User(
                username, passwordEncoder.encode(password),
                fullName, street, city, state, zip, phone);
    }
    
}
