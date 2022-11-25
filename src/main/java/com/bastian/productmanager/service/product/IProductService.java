package com.bastian.productmanager.service.product;

import com.bastian.productmanager.dao.ProductRepo;
import com.bastian.productmanager.model.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface IProductService {

    List<Product> findAll();
    Product save (Product product);
    void delete (Long id);
    Product findByid(Long id);

}
