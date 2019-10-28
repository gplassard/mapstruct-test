package fr.gplassard.mapstruct.dto;

import java.util.Objects;

public class CarDto {
    private Long id;
    private String make;
    private String model;
    private String version;
    private UserDto owner;

    public CarDto() {
    }

    public CarDto(Long id, String make, String model, String version, UserDto owner) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.version = version;
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarDto carDto = (CarDto) o;
        return Objects.equals(id, carDto.id) &&
                Objects.equals(make, carDto.make) &&
                Objects.equals(model, carDto.model) &&
                Objects.equals(version, carDto.version) &&
                Objects.equals(owner, carDto.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, make, model, version, owner);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public UserDto getOwner() {
        return owner;
    }

    public void setOwner(UserDto owner) {
        this.owner = owner;
    }
}
