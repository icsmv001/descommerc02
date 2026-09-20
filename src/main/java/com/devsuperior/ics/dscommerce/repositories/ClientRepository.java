package com.devsuperior.ics.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.ics.dscommerce.entities.Client;

public interface ClientRepository extends JpaRepository <Client, Long>{
	
	
}

