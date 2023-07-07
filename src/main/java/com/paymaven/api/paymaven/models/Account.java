package com.paymaven.api.paymaven.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Double total;
    private Long userId;
    private String createdAt;
    private String updatedAt;
    private boolean visible;
    
    // Constructor, getters y setters

    // ...

}
