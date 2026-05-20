package com.learning.simpleWebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.simpleWebApp.model.Product;


//springdata jpa is responsible forcreating the class for this interface and creates object for it 
// and this jparepository contains many methods
@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

}
