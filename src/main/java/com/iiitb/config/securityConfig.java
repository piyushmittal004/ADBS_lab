package com.iiitb.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class securityConfig extends WebSecurityConfigurerAdapter{


	/*@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// set configuration on the auth object
			auth.inMemoryAuthentication()   //not persistent
				.withUser("piyush")
				.password("password")
				.roles("Admin")
				.and()
				.withUser("rahul")
				.password("vyas")
				.roles("user");
	}*/
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	private JwtRequestFilter jwtrequestfilter;
	
	@Bean
	public AuthenticationProvider authProvider() {
		DaoAuthenticationProvider Provider = new DaoAuthenticationProvider();
		Provider.setUserDetailsService(userDetailsService);
		Provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		return Provider;
	}
	
	@Override
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
		// TODO Auto-generated method stub
		return super.authenticationManagerBean();
	}
	
	@Bean 	
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
	//	http.authorizeRequests()
		//	.antMatchers("/adminlogin").hasRole("Admin")
			//.antMatchers("/").permitAll()
			//.and().formLogin();
		http.csrf().disable()
			.authorizeRequests().antMatchers("/login").permitAll()
			.antMatchers("/authenticate").permitAll()
			.anyRequest().authenticated()
			.and()
			.formLogin()
			.loginPage("/login").permitAll()
			.and()
			.exceptionHandling()
			.and().sessionManagement()
			.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
			.and()
			.logout().invalidateHttpSession(true)
			.clearAuthentication(true)
			.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
			.logoutSuccessUrl("/login").permitAll();
		http.addFilterBefore(jwtrequestfilter, UsernamePasswordAuthenticationFilter.class);
	}


	
}
