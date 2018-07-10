package com.itmuch.cloud.feign;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient("microservice-user")
public interface UserFeignClient {
	  @RequestMapping(value = "/user/hello/{userName}", method = RequestMethod.GET)
	  public String sayHello(@PathVariable("userName") String userName);
}
