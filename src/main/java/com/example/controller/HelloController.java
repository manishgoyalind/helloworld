package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
    String hello() {
		System.out.print("SOP.........................");
        return "Hello Manish!";
    }
}
