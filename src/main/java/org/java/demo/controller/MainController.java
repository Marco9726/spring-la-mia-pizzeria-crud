package org.java.demo.controller;

import java.util.List;

import org.java.demo.pojo.Pizza;
import org.java.demo.serv.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@Autowired
	private PizzaService pizzaService;
	
	@GetMapping("/")
	public String getPizzaIndex(Model model) {
		
		List<Pizza> pizze = pizzaService.findAll();
		model.addAttribute("pizze", pizze);
		
		return "pizza-index";
	}
}
