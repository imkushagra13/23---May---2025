package com.example.weather.WeatherForecast.controller;

import com.example.weather.WeatherForecast.entity.WeatherForecast;
import com.example.weather.WeatherForecast.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.MalformedURLException;
import java.util.List;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    @Autowired
    WeatherService weatherService;

    public WeatherController(WeatherService weatherService){
        this.weatherService=weatherService;
    }

    @GetMapping("/forecast")
    public List<WeatherForecast> getWeather(@RequestParam String latitude,@RequestParam String longitude) throws MalformedURLException {
        return weatherService.fetchWeather(latitude,longitude);
    }

    @GetMapping("/compare")
    public String compareWeather(@RequestParam String lat1, @RequestParam String long1,
                                 @RequestParam String lat2, @RequestParam String long2) throws MalformedURLException {
        return weatherService.compareWeather(lat1, long1, lat2, long2);
    }

}
