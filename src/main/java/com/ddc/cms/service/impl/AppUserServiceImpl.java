package com.ddc.cms.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.ddc.cms.service.AppUserService;

@Component
public class AppUserServiceImpl implements AppUserService {
	
	public Integer findUser(@RequestParam(value = "username") String username) {
       System.out.println("XXXX:::" +username);
		return -9999;	
	}

}
