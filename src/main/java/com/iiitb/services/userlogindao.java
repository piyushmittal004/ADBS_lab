package com.iiitb.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iiitb.modal.user;

public interface userlogindao extends JpaRepository<user, Integer> {
	user findByUname(String uname);
}
