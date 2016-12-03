package com.mycomp.myapp.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.mycomp.myapp")
public class FeignConfiguration {

}
