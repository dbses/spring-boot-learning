package com.springcss.account.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SpringCssSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder builder) throws Exception {

        builder.inMemoryAuthentication()
                .withUser("user")
                .password("123456")
                .roles("USER")
                .and()
                .withUser("admin")
                .password("123456")
                .roles("USER", "ADMIN");
    }

//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//
//        http.authorizeRequests()
//                .antMatchers(HttpMethod.DELETE, "accounts/**")
//                .hasRole("ADMIN")
//                .anyRequest()
//                .authenticated();
//    }

}
