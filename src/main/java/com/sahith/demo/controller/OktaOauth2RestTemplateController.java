package com.sahith.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OktaOauth2RestTemplateController {
    @Autowired
    OAuth2RestTemplate restTemplate;

    @GetMapping
    public String test() {
        return restTemplate.getForObject("RestEndpoint", String.class);
    }
}