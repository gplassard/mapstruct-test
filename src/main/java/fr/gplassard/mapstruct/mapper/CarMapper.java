package fr.gplassard.mapstruct.mapper;

import fr.gplassard.mapstruct.dto.CarDto;
import fr.gplassard.mapstruct.entity.Car;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper( CarMapper.class );
    Car toEntity(CarDto dto);
    CarDto toDto(Car entity);
}
