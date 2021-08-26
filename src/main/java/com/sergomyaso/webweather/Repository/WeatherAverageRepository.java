package com.sergomyaso.webweather.Repository;

import com.sergomyaso.webweather.Model.WeatherAverage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WeatherAverageRepository extends JpaRepository<WeatherAverage, UUID> {
    WeatherAverage findByCompressedDates(String compressedDates);
}
