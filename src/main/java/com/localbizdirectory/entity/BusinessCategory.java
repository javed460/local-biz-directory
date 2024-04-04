package com.localbizdirectory.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "BUSINESS_CATEGORY")
@Data
public class BusinessCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String category;
}
