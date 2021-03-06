package com.example.app.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

import com.example.app.client.TodoClient;

@Configuration
@EnableFeignClients(clients = {TodoClient.class})
public class FeignConfig {

}
