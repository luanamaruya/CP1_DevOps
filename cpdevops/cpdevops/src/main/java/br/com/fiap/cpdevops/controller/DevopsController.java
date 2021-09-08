package br.com.fiap.cpdevops.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.cpdevops.model.Invest;
import br.com.fiap.cpdevops.repository.InvestRepository;



@Controller
public class DevopsController {
	
	@Autowired
	private InvestRepository repository;
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	@PostMapping("/index")
	public String save(Invest invest) {
		repository.save(invest);
		return "index";
	}
	
	@RequestMapping("/cadastroInvest")
	public String create() {
		return "cadastroInvest";
		
	}
}
