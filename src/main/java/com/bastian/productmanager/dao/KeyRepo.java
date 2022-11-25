package com.bastian.productmanager.dao;

import com.bastian.productmanager.model.ApiKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KeyRepo extends JpaRepository<ApiKey,Long> {
   ApiKey getApiKeyByKeyName(String key);
}
