package com.usa.habilitacion.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="supplements")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {
    @Id
    private String reference;
    private String brand;
    private String category;
    private String nombre;
    private String description;
    private boolean availability = true;
    private double price;
    private int quantity;
    private String photography;

}