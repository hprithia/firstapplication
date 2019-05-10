package com.cg.testapplication.first_application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
@RequestMapping("/")
public static String home() {
return "Spring boot is working!";
}
}