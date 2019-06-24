package scaits.config;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import scaits.listners.CustomizedLoginEvent;
import scaits.service.CustomSuccessHandler;
import scaits.service.CustomizedServiceImpl;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableTransactionManagement
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	CustomizedServiceImpl userService;

	@Autowired
	CustomizedLoginEvent LoginEvent;
	
	
	@Autowired
    CustomSuccessHandler customSuccessHandler;
	
	

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		
    	
    	/* String hasAuthority = urmRoleStrList.stream()
    		     .map(i -> "hasAuthority('"+i.toString()+"') ")
    		     .collect(Collectors.joining("or "));*/
		
		

		http.authorizeRequests()
		    .antMatchers("/assets/**")
		    .permitAll()
		    .antMatchers("/",
		                 "/scaits","/scaits/*")
		    .access("hasAuthority('ADMIN')")
		    .anyRequest()
		    .permitAll()
		    .and()
		    .formLogin()
		    .loginPage("/login")
		    //.successHandler(customSuccessHandler)
		    .usernameParameter("username")
		    .passwordParameter("password")
		    .and()
		    .logout()
		    .logoutUrl("/logout")
		    .logoutSuccessUrl("/")
		    .and()
	          .exceptionHandling()
		    .accessDeniedPage("/myTheme1/exceptionPage.html")
		    .and()
		    .csrf()
		    .and()
		    .sessionManagement()
		      .maximumSessions(1)
		      .expiredUrl("/login")
		      ;
	}
	
	
	
	@Bean
    @Override
    public UserDetailsService userDetailsService() {
		Collection<UserDetails> users=new ArrayList<UserDetails>();
        UserDetails user =
             User.withUsername("username").password("password").roles("*").build();
        
        users.add(user);

        return new InMemoryUserDetailsManager(users);
    }
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userService)
		    .passwordEncoder(new Md5PasswordEncoder());
		auth.authenticationEventPublisher(LoginEvent);
		auth.inMemoryAuthentication().withUser("username").password("password").roles("*").credentialsExpired(true)
        .accountExpired(true)
        .accountLocked(true);
	}

}
