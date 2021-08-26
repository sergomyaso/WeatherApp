package com.sergomyaso.webweather.Config;

import com.sergomyaso.webweather.Service.WeatherAverageApiService;
import com.sergomyaso.webweather.Service.WeatherAverageAtpmApiService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WeatherAverageApiServiceConfig {
    @Bean
    public WeatherAverageApiService weatherAverageApiService() {
        // You cat return WeatherAverageTestApiService for testing
        return new WeatherAverageAtpmApiService();
    }
}
