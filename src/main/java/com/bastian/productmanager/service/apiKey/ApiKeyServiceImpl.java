package com.bastian.productmanager.service.apiKey;

import com.bastian.productmanager.dao.KeyRepo;
import com.bastian.productmanager.model.ApiKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiKeyServiceImpl implements IApiKeyService {
    @Autowired
    KeyRepo keyRepo;
    @Override
    public ApiKey findByKey(String key) {
        return keyRepo.getApiKeyByKeyName(key);
    }
}
