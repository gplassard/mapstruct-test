package fr.gplassard.mapstruct.mapper;

import fr.gplassard.mapstruct.dto.CarDto;
import fr.gplassard.mapstruct.entity.Car;
import org.mapstruct.Mapper;

@Mapper(uses = UserMapper.class, componentModel = "spring")
public interface CarMapper {
    Car toEntity(CarDto dto);
    CarDto toDto(Car entity);
}
