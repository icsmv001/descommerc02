package com.devsuperior.ics.dscommerce.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.ics.dscommerce.dto.ProductDTO;
import com.devsuperior.ics.dscommerce.entities.Product;
import com.devsuperior.ics.dscommerce.repositories.ProductRepository;
import com.devsuperior.ics.dscommerce.services.ProductService;

@RestController
@RequestMapping(value= "/products")
public class ProductController {
	
	
	@Autowired
    private ProductService service;
	
	@GetMapping(value="/{id}")
	public ProductDTO findBy( @PathVariable Long id) {
	
	ProductDTO dto = service.findById(id);
	return dto;
	
	}
	

}
