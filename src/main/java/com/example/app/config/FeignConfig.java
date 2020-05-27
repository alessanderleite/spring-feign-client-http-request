package com.example.app.config;

import org.springframework.cloud.openfeign.EnableFeignClients;

import com.example.app.integration.TodoClient;

@EnableFeignClients(clients = {TodoClient.class})
public class FeignConfig {

}
