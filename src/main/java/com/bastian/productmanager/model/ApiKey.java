package com.bastian.productmanager.model;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;

@Entity
@Table(name = "api_key")
public class ApiKey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name="key_name")
    private String keyName;


    public ApiKey() {}

    public ApiKey(String keyName) {
        this.keyName = keyName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKeyName() {return keyName;}

    public void setKeyName(String key) {this.keyName = key;}

}