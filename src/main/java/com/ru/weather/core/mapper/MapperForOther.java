package com.ru.weather.core.mapper;

import com.ru.weather.core.model.openweatherapi.other.AllData;
import com.ru.weather.core.dto.WeatherDto;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import org.springframework.stereotype.Component;

@Component
public class MapperForOther extends ConfigurableMapper {
    @Override
    protected void configure(MapperFactory factory) {
        factory.classMap(AllData.class ,WeatherDto.class )
                .field("current.weather.description", "falloutAndTemperatureDto")
                .field("","")
                .field("","")
                .register();





    }
}