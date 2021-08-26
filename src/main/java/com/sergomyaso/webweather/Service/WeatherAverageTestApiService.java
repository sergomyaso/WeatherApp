package com.sergomyaso.webweather.Service;

import com.sergomyaso.webweather.Model.WeatherAverage;

import java.time.LocalDate;

public class WeatherAverageTestApiService implements WeatherAverageApiService {

    @Override
    public WeatherAverage getAverageFromApi(LocalDate dateFrom, LocalDate dateTo, String compressedDate) {
        double randomAverageValue = Math.random();
        return new WeatherAverage(compressedDate, dateFrom, dateTo, randomAverageValue);
    }
}
