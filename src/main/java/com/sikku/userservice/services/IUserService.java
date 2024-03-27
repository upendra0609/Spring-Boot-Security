package com.sikku.userservice.services;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService {
	UserDetailsService userDetailsService();
}
