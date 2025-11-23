package br.com.lue93.spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/v1/health-check")
public class HealthController {

    @GetMapping
    public Map<String, String> check() {
        return Map.of("healthcheck", "up");
    }

}