package com.sergomyaso.webweather.Controller.Response;

import com.sergomyaso.webweather.Model.WeatherAverage;

import java.time.LocalDate;
import java.util.UUID;

public class WeatherAverageResponse {
    private UUID id;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private double average;

    public WeatherAverageResponse(WeatherAverage average) {
        this.id = average.getId();
        this.dateFrom = average.getDateFrom();
        this.dateTo = average.getDateTo();
        this.average = average.getAverage();
    }

    public WeatherAverageResponse(UUID id, LocalDate dateFrom, LocalDate dateTo, double average) {
        this.id = id;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.average = average;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
