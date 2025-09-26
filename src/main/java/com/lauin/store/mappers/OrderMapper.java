package com.lauin.store.mappers;

import com.lauin.store.dtos.OrderDto;
import com.lauin.store.entities.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel= "spring")
public interface OrderMapper {
    OrderDto toDto(Order order);
}
