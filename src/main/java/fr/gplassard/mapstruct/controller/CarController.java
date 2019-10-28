package fr.gplassard.mapstruct.controller;

import fr.gplassard.mapstruct.dto.CarDto;
import fr.gplassard.mapstruct.entity.Car;
import fr.gplassard.mapstruct.entity.User;
import fr.gplassard.mapstruct.mapper.CarMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CarController {
    private CarMapper carMapper;

    public CarController(CarMapper carMapper) {
        this.carMapper = carMapper;
    }

    @RequestMapping("/api/v1/cars")
    public List<CarDto> cars() {
        return Arrays.asList(
                carMapper.toDto(new Car(1L, "make1", "model1", "version1", new User("firstName1", "lastName1"))),
                carMapper.toDto(new Car(2L, "make2", "model2", "version2", new User("firstName2", "lastName2"))),
                carMapper.toDto(new Car(3L, "make3", "model3", "version3", new User("firstName3", "lastName3"))),
                carMapper.toDto(new Car(4L, "make4", "model4", "version4", new User("firstName4", "lastName4"))),
                carMapper.toDto(new Car(5L, "make5", "model5", "version5", new User("firstName5", "lastName5")))
        );
    }

}
