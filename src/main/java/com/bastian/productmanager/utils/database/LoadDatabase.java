package com.bastian.productmanager.utils.database;

import com.bastian.productmanager.dao.CategoryRepo;
import com.bastian.productmanager.dao.KeyRepo;
import com.bastian.productmanager.dao.ProductRepo;
import com.bastian.productmanager.model.ApiKey;
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
    CommandLineRunner initDatabase(CategoryRepo categoryRepo, ProductRepo productRepo, KeyRepo keyRepo) {

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

        List<ApiKey> keyList = new ArrayList<>();
        keyList.add(new ApiKey("abc-123"));
        keyList.add(new ApiKey("cba-321"));
        keyList.add(new ApiKey("123-abc"));

        return args -> {
            categoryRepo.saveAll(listCat);
            productRepo.saveAll(listPro);
            keyRepo.saveAll(keyList);
        };
    }

}
