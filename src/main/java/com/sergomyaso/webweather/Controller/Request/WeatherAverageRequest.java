package com.sergomyaso.webweather.Controller.Request;

public class WeatherAverageRequest {
    private String date;
    private int countDays;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCountDays() {
        return countDays;
    }

    public void setCountDays(int countDays) {
        this.countDays = countDays;
    }
}
