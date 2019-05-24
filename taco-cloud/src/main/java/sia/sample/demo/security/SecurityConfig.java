/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sia.sample.demo.security;

import javax.activation.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author usgdal
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    
    @Autowired
    DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // In memory user store
        auth
                .inMemoryAuthentication().withUser("buzz").password("infinity").authorities("ROLE_USER")
                .and().withUser("woody").password("bullseye").authorities("ROLE_USER");
        
        /* JDBC-based user store
        auth.jdbcAuthentication().dataSource(dataSource);*/
        
        /* 
        auth
                .jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery(
                "select username, password, enabled from Users where username=?")
                .authoritiesByUsernameQuery(
                "select username, authority from UserAuthorities where username=?");*/
        
        /* With passowrdEncoder
        auth
                .jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery(
                "select username, password, enabled from Users where username=?")
                .authoritiesByUsernameQuery("select username, authority from UserAuthorities where username=?")
                .passwordEncoder(new StandardPasswordEcoder("53cr3t"));*/
        
        /* LDAP-backed user store
        auth
                .ldapAuthentication().userSearchFilter("(uid={0})").groupSearchFilter("member={0}"); */
        
        /*
        auth
                .ldapAuthentication().userSearchBase("ou=people")
                .userSearchFilter("(uid={0})").groupSearchBase("ou=groups")
                .groupSearchFilter("member={0}");*/
        
        
    }
}
