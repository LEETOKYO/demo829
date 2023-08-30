package com.example.demo829.entity.controller;

import com.example.demo829.entity.entity.Product;
import com.example.demo829.entity.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;
    @PostMapping("/addProduct")
    public  Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }
    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody  List<Product> products){
        return service.saveProducts(products);
    }
    @GetMapping("/products")
    public List<Product> findALLProducts(){
        return service.getProducts();
    }
    @GetMapping("/products/{id}")
    public Product findProductById(@PathVariable  int id){
        return  service.getProductsById(id);
    }
    @GetMapping("/products/{name}")
    public Product findProductByName(@PathVariable String name){
        return  service.getProductsByName(name);
    }
    @PutMapping ("/update")
    public Product updateProducts(@RequestBody  Product product){
        return service.updateProduct(product);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return  service.deleteProduct(id);
    }
}
