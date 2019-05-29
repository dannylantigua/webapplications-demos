/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sia.sample.demo.data;

import org.springframework.data.repository.CrudRepository;
import sia.sample.demo.User;

/**
 *
 * @author USGDAL
 */
public interface UserRepository extends CrudRepository<User, Long> {
    
    User findByUsername(String username);
}
