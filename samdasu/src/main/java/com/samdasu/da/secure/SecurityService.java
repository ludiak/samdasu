package com.samdasu.da.secure;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SecurityService implements UserDetailsService{

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		String pass = "1234";
		String passEnc = passwordEncoder.encode(pass);
		
		List<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
		
		if("user".equals(username)) {
			roles.add(new SimpleGrantedAuthority("ROLE_USER"));
		} else if("admin".equals(username)) {
			roles.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		} else {
			throw new UsernameNotFoundException("없음");
		}
		return new User(username, passEnc, roles);
	}

}
