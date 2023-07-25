package com.ez.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
    public String index() { 
		System.out.println("index page!");
        return "index";
    }
	
	@RequestMapping("/[d/pdList")
	public String pdList() { 
		System.out.println("pdList page!");
		return "pd/pdList";
	}
}
