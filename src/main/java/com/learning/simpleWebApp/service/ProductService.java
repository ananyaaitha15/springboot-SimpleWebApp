package com.learning.simpleWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learning.simpleWebApp.model.Product;
import com.learning.simpleWebApp.repository.ProductRepo;

@Service
public class ProductService {

    @Autowired 
    ProductRepo repo;

    // List<Product>products=new ArrayList<>(Arrays.asList(new Product(101, "Iphone", 500000),
    //                         new Product(102, "Samsung", 450000),
    //                     new Product(103,"oppo",23000)));

    public List<Product> getProducts(){
        return repo.findAll();
    }

    //here getProdId we didnt define but still works bz lombok will create getter methods for all fields
    public Product getProductById(int prodId){
        // return products.stream().filter(p->p.getProdId()==prodId).findFirst().get();
        // return products.stream().filter(p->p.getProdId()==prodId).findFirst().orElse(new Product(100,"No item",0));
        return repo.findById(prodId).orElse(new Product());
    }


    public void addProduct(Product prod){
        // products.add(prod);
        repo.save(prod);
    }

    public void updateProduct(Product prod){
        // int ind=0;
        // for(int i=0;i<products.size();i++){
        //     if(products.get(i).getProdId()==prod.getProdId())
        //         ind=i;
        // }
        // products.set(ind, prod);
        repo.save(prod);
    }

    public void deleteProduct(int prodId){
        // int ind=0;
        // for(int i=0;i<products.size();i++){
        //     if(products.get(i).getProdId()==prodId)
        //         ind=i;
        // }
        // products.remove(ind);
        repo.deleteById(prodId);
    }
}

