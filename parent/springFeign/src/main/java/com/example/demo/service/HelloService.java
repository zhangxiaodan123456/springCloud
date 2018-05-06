package com.example.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="serviceHI",fallback=HelloServiceImpl.class)
public interface HelloService {
  @RequestMapping(value="/HI/get",method=RequestMethod.GET)
  public String getName();
}
