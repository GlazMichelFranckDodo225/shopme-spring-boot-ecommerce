package com.shopme.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	// Http Request : "http://localhost:8080/ShopmeAdmin"
	@GetMapping("")
	public String viewHomePage() {
		return "index";
	}
}
