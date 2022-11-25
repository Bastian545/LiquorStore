package com.bastian.productmanager.dao;

import com.bastian.productmanager.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category,Long> {
}
