package com.sergomyaso.webweather.Service;

import com.sergomyaso.webweather.Model.WeatherAverage;
import com.sergomyaso.webweather.Repository.WeatherAverageRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class WeatherAverageService {
    @Autowired
    WeatherAverageRepository averageRepository;


    public WeatherAverage getAverage(String compressedDates) {
        WeatherAverage averageFromDB = averageRepository.findByCompressedDates(compressedDates);
        if (averageFromDB == null)
            return null;
        return averageFromDB;
    }

    public void saveAverage(WeatherAverage average) {
        averageRepository.save(average);
    }


}
