package com.lauin.store.mappers;

import com.lauin.store.dtos.RegisterUserRequest;
import com.lauin.store.dtos.UpdateUserRequest;
import com.lauin.store.dtos.UserDto;
import com.lauin.store.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(RegisterUserRequest request);
    void update(UpdateUserRequest request, @MappingTarget User user);
}
