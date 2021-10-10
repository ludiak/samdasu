package com.samdasu.da.secure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class SecurityProvider implements AuthenticationProvider {
	
	@Autowired
	private SecurityService securityService;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String id = (String) authentication.getPrincipal();
		String pass = (String) authentication.getCredentials();
		
		UserDetails user = securityService.loadUserByUsername(id);
		
		if(!passwordEncoder.matches(pass, user.getPassword())) {
			throw new BadCredentialsException("wrong password");
		}
		
		return new UsernamePasswordAuthenticationToken(user.getUsername(), pass, user.getAuthorities());
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}
