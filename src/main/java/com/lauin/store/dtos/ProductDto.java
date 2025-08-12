package com.lauin.store.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Data
public class ProductDto {
    private Long id;
    private String name;
    private double price;
    private String description;
    private Byte categoryId;
}
