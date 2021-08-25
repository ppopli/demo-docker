package com.example.docker.demo.docker.demo.controller;

import com.example.docker.demo.docker.demo.Employee;
import com.example.docker.demo.docker.demo.EmployeeRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@Configuration
@RestController
@RequestMapping("/test")
public class TestController {
    Logger log = LoggerFactory.getLogger(TestController.class);

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/greeting")
    public String greet() {
        log.debug("Sending greeting");
        String result = this.restTemplate.getForEntity("http://www.google.com", String.class).getBody();
        return result;
    }

    @PostMapping("/getEmployee")
    public Employee pulkit(@RequestBody EmployeeRequest request) throws URISyntaxException {
        final String url = "http://localhost:9100/downstream/getEmployee";
        URI uri = new URI(url);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("content/type", "application/json");

        HttpEntity<EmployeeRequest> entity = new HttpEntity<>(request, httpHeaders);

        ResponseEntity<Employee> response = restTemplate.postForEntity(uri, request, Employee.class);
//        log.info("Response = {}", response.getBody());
//        log.info("Response complete = {}", response);
        return response.getBody();
    }


 }
