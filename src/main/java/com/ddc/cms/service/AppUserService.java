package com.ddc.cms.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ddc.cms.service.impl.AppUserServiceImpl;

@FeignClient(name = "ddc-service2-demo", fallback = AppUserServiceImpl.class)
public interface AppUserService {

	@RequestMapping(method = RequestMethod.GET,value="/find")
	public Integer findUser(@RequestParam(value = "username") String username);
	
}
