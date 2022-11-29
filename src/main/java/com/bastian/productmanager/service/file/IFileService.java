package com.bastian.productmanager.service.file;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface IFileService {

    public void init();

    public void save (MultipartFile file);

    public Resource load (String filename);

    public void deletAll();

    public Stream<Path> loadAll();
}
