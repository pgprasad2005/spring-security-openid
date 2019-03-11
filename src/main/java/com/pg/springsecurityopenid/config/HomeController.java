package com.pg.springsecurityopenid.config;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pg.springsecurityopenid.security.OpenIdConnectUserDetails;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	@ResponseBody
	public final String home() {
		final String username = SecurityContextHolder.getContext().getAuthentication().getName();
			
//		OpenIdConnectUserDetails details = (OpenIdConnectUserDetails)SecurityContextHolder.getContext().getAuthentication();
		
		System.out.println("username--->>"+ username);
		return "Welcome " + username;
	}

}
