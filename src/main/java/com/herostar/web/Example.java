package com.herostar.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example {

	private static final Logger logger = LoggerFactory.getLogger(Example.class);
	
    @RequestMapping("/")
    String home() {
    	logger.info("Hello");
        return "Hello World!";
    }
}
