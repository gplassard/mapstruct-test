package fr.gplassard.mapstruct.mapper;

import fr.gplassard.mapstruct.dto.UserDto;
import fr.gplassard.mapstruct.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper( UserMapper.class );

    User toEntity(UserDto dto);
    UserDto toDto(User entity);
}
