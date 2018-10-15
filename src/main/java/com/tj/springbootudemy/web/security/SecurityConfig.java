package com.tj.springbootudemy.web.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    //TODO: THIS ISNT WORKING. COME BACK AND FIX?
    //Create User (tj) and Password (abc)
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("tj").password("abc").roles("USER", "ADMIN");
    }



}
