package com.ru.weather.core.service.dto;

import lombok.Data;

@Data
public class CityDto {
    private Long id;
    private String name;
    private Double latitude;
    private Double longitude;

}
