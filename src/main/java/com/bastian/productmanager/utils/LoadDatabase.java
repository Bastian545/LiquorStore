package com.bastian.productmanager.utils;

import com.bastian.productmanager.dao.CategoryRepo;
import com.bastian.productmanager.dao.ProductRepo;
import com.bastian.productmanager.model.Category;
import com.bastian.productmanager.model.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


@Configuration
public class LoadDatabase {
    @Bean
    CommandLineRunner initDatabaseCategory(CategoryRepo categoryRepo, ProductRepo productRepo) {

        List<Category> listCat = new ArrayList<>();
        listCat.add(new Category("Piscos"));
        listCat.add(new Category("Vinos"));
        listCat.add(new Category("Cervezas"));
        listCat.add(new Category("Licores"));
        listCat.add(new Category("Espumantes"));
        listCat.add(new Category("Energetica"));
        listCat.add(new Category("Whiskys"));


        List<Product> listPro = new ArrayList<>();
        listPro.add(new Product(listCat.get(1), 14L, "https://upload.wikimedia.org/wikipedia/commons/6/63/Helles_im_Glas-Helles_(pale_beer).jpg"));
        listPro.add(new Product(listCat.get(3), 5L, "https://upload.wikimedia.org/wikipedia/commons/6/63/Helles_im_Glas-Helles_(pale_beer).jpg"));
        listPro.add(new Product(listCat.get(5), 24L, "https://upload.wikimedia.org/wikipedia/commons/6/63/Helles_im_Glas-Helles_(pale_beer).jpg"));
        listPro.add(new Product(listCat.get(2), 37L, "https://upload.wikimedia.org/wikipedia/commons/6/63/Helles_im_Glas-Helles_(pale_beer).jpg"));
        listPro.add(new Product(listCat.get(1), 58L, "https://upload.wikimedia.org/wikipedia/commons/6/63/Helles_im_Glas-Helles_(pale_beer).jpg"));

        return args -> {
            categoryRepo.saveAll(listCat);
            productRepo.saveAll(listPro);
        };
    }

}
