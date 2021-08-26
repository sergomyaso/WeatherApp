package com.sergomyaso.webweather.Service;

import com.sergomyaso.webweather.Model.WeatherAverage;
import com.sergomyaso.webweather.Provider.DateProvider;
import com.sergomyaso.webweather.Provider.WeatherAtpmProvider;

import java.time.LocalDate;

public class WeatherAverageAtpmApiService implements WeatherAverageApiService {

    @Override
    public WeatherAverage getAverageFromApi(LocalDate dateFrom, LocalDate dateTo, String compressedDate) {
        double averageValue = WeatherAtpmProvider.getAverageValue(DateProvider.getStringDate(dateFrom), DateProvider.getStringDate(dateTo));
        return new WeatherAverage(compressedDate, dateFrom, dateTo, averageValue);
    }

}
