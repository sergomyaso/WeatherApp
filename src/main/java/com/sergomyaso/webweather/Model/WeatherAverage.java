package com.sergomyaso.webweather.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "weather_average")
public class WeatherAverage {

    @Id
    @GeneratedValue
    private UUID id = UUID.randomUUID();
    private String compressedDates;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private double average;

    public WeatherAverage() {
    }

    public WeatherAverage(String compressedDates, LocalDate dateFrom, LocalDate dateTo, double average) {
        this.compressedDates = compressedDates;
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

    public String getCompressedDates() {
        return compressedDates;
    }

    public void setCompressedDates(String compressedDates) {
        this.compressedDates = compressedDates;
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
