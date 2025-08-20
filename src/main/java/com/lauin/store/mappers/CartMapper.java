package com.lauin.store.mappers;

import com.lauin.store.dtos.CartDto;
import com.lauin.store.dtos.CartItemDto;
import com.lauin.store.entities.Cart;
import com.lauin.store.entities.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CartMapper {
    @Mapping(target = "totalPrice", expression = "java(cart.getTotalPrice())")
    CartDto toDto(Cart cart);

    @Mapping(target = "totalPrice", expression = "java(cartItem.getTotalPrice())")
    CartItemDto toDto(CartItem cartItem);
}
