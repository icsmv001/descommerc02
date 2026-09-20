
package com.devsuperior.ics.dscommerce.dto;

import java.time.LocalDate;

import com.devsuperior.ics.dscommerce.entities.Client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;

public class ClientDTO {

    private Long id;
    
    @NotBlank(message = "Campo requirido")
    private String name;
    private String cpf;
    private Double income;
    @PastOrPresent(message = "A data de nascimento não pode ser uma data futura.")
        
    private LocalDate birthDate;
    private Integer children;

    public ClientDTO(Long id, String name, String cpf, Double income,
                     LocalDate birthDate, Integer children) {
        super();
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    
    public ClientDTO() {
    }
    
    
    
    
    public ClientDTO(Client entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.cpf = entity.getCpf();
        this.income = entity.getIncome();
        this.birthDate = entity.getBirthDate();
        this.children = entity.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}

