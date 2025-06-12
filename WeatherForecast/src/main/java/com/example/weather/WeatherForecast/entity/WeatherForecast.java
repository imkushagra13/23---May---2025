package com.example.weather.WeatherForecast.entity;

import java.time.LocalDate;

public class WeatherForecast {
    LocalDate date;
    double temperature;


    public WeatherForecast(LocalDate date, double temp) {
        this.date=date;
        this.temperature=temp;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Date: "+date+", Temperature: "+temperature+"°C";
    }
}
