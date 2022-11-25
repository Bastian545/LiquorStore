package com.bastian.productmanager.service.apiKey;

import com.bastian.productmanager.model.ApiKey;

public interface IApiKeyService {
    ApiKey findByKey (String key);
}
