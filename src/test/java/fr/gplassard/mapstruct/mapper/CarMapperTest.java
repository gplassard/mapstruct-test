package fr.gplassard.mapstruct.mapper;

import fr.gplassard.mapstruct.dto.CarDto;
import fr.gplassard.mapstruct.dto.UserDto;
import fr.gplassard.mapstruct.entity.Car;
import fr.gplassard.mapstruct.entity.User;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarMapperTest {

    @Test
    public void toEntityNominal() {
        CarDto dto = new CarDto(12L, "make", "model", "version", new UserDto("firstName", "lastName"));

        Car entity = CarMapper.INSTANCE.toEntity(dto);

        assertThat(entity).isEqualTo(new Car(12L, "make", "model", "version", new User("firstName", "lastName")));
    }

    @Test
    public void toDtoNominal() {
        Car entity = new Car(12L, "make", "model", "version", new User("firstName", "lastName"));

        CarDto dto = CarMapper.INSTANCE.toDto(entity);

        assertThat(dto).isEqualTo(new CarDto(12L, "make", "model", "version", new UserDto("firstName", "lastName")));
    }
}
