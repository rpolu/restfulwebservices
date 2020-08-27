package com.spring.rest.security.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// Here we will specify the authorization . based on which role has access for which API.
		http.httpBasic().and().
		authorizeRequests().
		antMatchers("/account").hasRole("ADMIN").
		antMatchers("/user/**").hasAnyRole("ADMIN", "USER").
		and().csrf().disable();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("rama").password("mohan").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("anup").password("anup").roles("USER");
		auth.inMemoryAuthentication().withUser("thulasi").password("thulasi").roles("USER");
		auth.inMemoryAuthentication().withUser("sujana").password("sujana").roles("USER");
	}
}