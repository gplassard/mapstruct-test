package fr.gplassard.mapstruct.mapper;

import fr.gplassard.mapstruct.dto.UserDto;
import fr.gplassard.mapstruct.entity.User;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserMapperTest {

    @Test
    public void toEntityNominal() {
        UserDto dto = new UserDto("firstName", "lastName");

        User entity = UserMapper.INSTANCE.toEntity(dto);

        assertThat(entity).isEqualTo(new User("firstName", "lastName"));
    }

    @Test
    public void toDtoNominal() {
        User entity = new User("firstName", "lastName");

        UserDto dto = UserMapper.INSTANCE.toDto(entity);

        assertThat(dto).isEqualTo(new UserDto("firstName", "lastName"));
    }
}
