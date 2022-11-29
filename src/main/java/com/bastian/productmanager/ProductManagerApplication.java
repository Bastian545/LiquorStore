package com.bastian.productmanager;

import com.bastian.productmanager.service.file.IFileService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class ProductManagerApplication {

    @Resource
    IFileService fileService;

    public static void main(String[] args) {
        SpringApplication.run(ProductManagerApplication.class, args);
    }
}