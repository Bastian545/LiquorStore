package com.bastian.productmanager.controller;


import com.bastian.productmanager.dao.ProductRepo;
import com.bastian.productmanager.model.Product;
import com.bastian.productmanager.service.product.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @GetMapping("/products")
    List<Product> findAll(){
        return productService.findAll();
    }

    @GetMapping("/products/{id}")
    Product findByid(@PathVariable Long id){
        return productService.findByid(id);
    }

    @PostMapping("/products")
    Product newProduct(@RequestBody Product product){
        return productService.save(product);
    }

    @PutMapping("/products/{id}")
    Product editProduct(@RequestBody Product product,@PathVariable Long id){
       Product productEdit = productService.findByid(id);
       productEdit.setCategory(product.getCategory());
       productEdit.setFilePath(product.getFilePath());
       productEdit.setStock(product.getStock());

       return productService.save(productEdit);
    }

    @DeleteMapping("/products/{id}")
    public void delete (@PathVariable Long id){
        productService.delete(id);
    }

}
