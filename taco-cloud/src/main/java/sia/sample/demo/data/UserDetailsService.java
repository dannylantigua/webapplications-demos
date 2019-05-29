/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sia.sample.demo.data;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 *
 * @author USGDAL
 */
public interface UserDetailsService {
    
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
