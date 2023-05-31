package org.java.demo.serv;

import java.util.List;
import java.util.Optional;

import org.java.demo.pojo.Pizza;
import org.java.demo.repo.PizzaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaService {

	@Autowired
	private PizzaRepo pizzaRepo;
	
	public List<Pizza> findAll()  {
		
		return pizzaRepo.findAll();
	}
	
	public Optional<Pizza> findById(int id) {
		
		return pizzaRepo.findById(id);
	}
	
	public Pizza save(Pizza pizza) {
		
		return pizzaRepo.save(pizza);
	}
}
