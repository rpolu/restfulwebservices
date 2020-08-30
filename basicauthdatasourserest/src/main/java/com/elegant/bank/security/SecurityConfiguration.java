package com.elegant.bank.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Autowired
	private DataSource dataSource;

	public void configure(HttpSecurity http) throws Exception {
		 http.csrf().disable().authorizeRequests()
		.antMatchers("/bank/users/getAll").hasRole("ADMIN")
		.antMatchers("/bank/getuser/**").hasAnyRole("ADMIN", "USER")
		.antMatchers("/bank/user/register").permitAll()
		.and().httpBasic();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(passwordEncoder())
				.usersByUsernameQuery("SELECT USERNAME, PASSWORD, ENABLED FROM BANK_USERS WHERE USERNAME=?")
				.authoritiesByUsernameQuery("SELECT USERNAME, ROLE FROM BANK_USERS WHERE USERNAME=?");
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}

}
