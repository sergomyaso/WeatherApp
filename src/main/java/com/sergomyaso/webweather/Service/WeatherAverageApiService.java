package com.sergomyaso.webweather.Service;

import com.sergomyaso.webweather.Model.WeatherAverage;

import java.time.LocalDate;

public interface WeatherAverageApiService {

    WeatherAverage getAverageFromApi(LocalDate dateFrom, LocalDate dateTo, String compressedDate);
}
