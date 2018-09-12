package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogController {
	
	@RequestMapping("/")
    public @ResponseBody String index() {
        return "Greetings from Catalog Service !";
    }

}
