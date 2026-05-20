package com.learning.simpleWebApp.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data // creates getter setter methods for all fields
@AllArgsConstructor //creates constructor for with parameters
@Component //marks class as spring bean and generates object and handles it
@Entity
public class Product {

    public Product(){

    }
    @Id
    private int prodId;
    private String prodName;
    private int prodPrice;

}
