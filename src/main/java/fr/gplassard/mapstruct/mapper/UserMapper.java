package fr.gplassard.mapstruct.mapper;

import fr.gplassard.mapstruct.dto.UserDto;
import fr.gplassard.mapstruct.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(UserDto dto);
    UserDto toDto(User entity);
}
