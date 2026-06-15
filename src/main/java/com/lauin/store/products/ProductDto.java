package com.lauin.store.products;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ProductDto {
    private Long id;
    private String name;
    private double price;
    private String description;
    private Byte categoryId;
}
