package dh.java.patterns.behavioral.observer.v1;

import dh.java.patterns.behavioral.observer.v1.display.CurrentDisplay;
import dh.java.patterns.behavioral.observer.v1.display.ForecastDisplay;
import dh.java.patterns.behavioral.observer.v1.display.StatisticsDisplay;

public class WeatherData {

    private int temperature;
    private int humidity;
    private int pressure;

    private CurrentDisplay currentDisplay;
    private ForecastDisplay forecastDisplay;
    private StatisticsDisplay statisticsDisplay;

    public void weatherChanged(){
        this.currentDisplay.update(temperature, humidity, pressure);
        this.forecastDisplay.update(temperature, humidity, pressure);
        this.statisticsDisplay.update(temperature, humidity, pressure);
    }

    public void changeMeasurements (int temperature, int humidity, int pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.weatherChanged();
    }
}
