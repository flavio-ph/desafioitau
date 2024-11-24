package com.example.desafioItau.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.desafioItau.DTO.ClientDTO;
import com.example.desafioItau.entity.Client;
import com.example.desafioItau.service.ClientService;

@RestController
@RequestMapping("/api")
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	
	@PostMapping("/save")
	public ResponseEntity<Client>saveClient(@RequestBody ClientDTO clientDTO) {
		
		Client client = clientService.saveClient(clientDTO);
		return ResponseEntity.ok().body(client);
		
	}
	
	@GetMapping
	public ResponseEntity<List<Client>> listALLClients() {
		
		List<Client> clientslist = clientService.listAllClients();
		return ResponseEntity.ok().body(clientslist);
		
	}

}
