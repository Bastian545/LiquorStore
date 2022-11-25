package com.bastian.productmanager.dao;

import com.bastian.productmanager.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product,Long> {
}
