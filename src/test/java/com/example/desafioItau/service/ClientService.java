package com.example.desafioItau.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.desafioItau.DTO.ClientDTO;
import com.example.desafioItau.entity.Client;
import com.example.desafioItau.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	public Client saveClient(ClientDTO clientDTO) {
		
		Client client = new Client();
		
		client.setFirstName(clientDTO.firstName());
		client.setLastName(clientDTO.lastName());
		client.setParticipation(clientDTO.participation());
		
		if (client == null || client.getFirstName() == null || client.getLastName() == null || client.getParticipation() == null) {
			
			throw new NullPointerException();
			
		}
		
		return clientRepository.save(client);
	}
	
	
	public List<Client> listAllClients() {
		
		List<Client> allClients = clientRepository.findAll();
		
		if(allClients == null) {
			throw new NullPointerException();
		}
		
		return allClients;
	}
	
}
