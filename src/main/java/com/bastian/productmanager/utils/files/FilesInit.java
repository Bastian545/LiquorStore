package com.bastian.productmanager.utils.files;

import com.bastian.productmanager.service.file.IFileService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilesInit {
    @Bean
    CommandLineRunner initFiles(IFileService fileService){
        return args -> fileService.init();
    }
}
