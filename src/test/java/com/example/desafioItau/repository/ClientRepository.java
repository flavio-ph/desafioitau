package com.example.desafioItau.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.desafioItau.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
	
	

}
