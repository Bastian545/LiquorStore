package com.bastian.productmanager.service.category;

import com.bastian.productmanager.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
    Category save(Category category);
    void delete (Long id);
    Category findById (Long id);
}
