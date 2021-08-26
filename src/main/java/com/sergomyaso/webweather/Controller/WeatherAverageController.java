package com.sergomyaso.webweather.Controller;

import com.sergomyaso.webweather.Controller.Request.WeatherAverageRequest;
import com.sergomyaso.webweather.Controller.Response.WeatherAverageResponse;
import com.sergomyaso.webweather.Model.WeatherAverage;
import com.sergomyaso.webweather.Provider.DateProvider;
import com.sergomyaso.webweather.Service.WeatherAverageApiService;
import com.sergomyaso.webweather.Service.WeatherAverageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class WeatherAverageController {

    @Autowired
    WeatherAverageService averageService;
    @Autowired
    WeatherAverageApiService averageApiService;

    @GetMapping("/weather/average")
    public WeatherAverageResponse getWeatherAverage(@RequestBody WeatherAverageRequest request) {
        LocalDate dateFrom = DateProvider.getConvertedDate(request.getDate());
        LocalDate dateTo = dateFrom.plusDays(request.getCountDays());
        String compressedDates = DateProvider.getCompressedDate(dateFrom, dateTo);
        WeatherAverage average = averageService.getAverage(compressedDates); // Find average in db
        if (average != null) {
            // If we have average in data base, we return it
            return new WeatherAverageResponse(average);
        }
        average = averageApiService.getAverageFromApi(dateFrom, dateTo, compressedDates); //Get average from api
        averageService.saveAverage(average);
        average = averageService.getAverage(compressedDates); // Get average entity from repository, as required
        return new WeatherAverageResponse(average);
    }

}
