package com.iiitb.modal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.iiitb.services.userlogindao;

@Service
public class myUserDetailService implements UserDetailsService {

	@Autowired
	private userlogindao repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		user user = repo.findByUname(username);
		if(user==null)
			throw new UsernameNotFoundException("User not found");
		
		return new currentuserDetail(user);
	}
	
}
