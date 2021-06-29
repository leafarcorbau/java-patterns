package dh.java.patterns.behavioral.observer.v2;

import dh.java.patterns.behavioral.observer.v2.display.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private int temperature;
    private int humidity;
    private int pressure;

    private List<Observer> displays;

    public WeatherData(){
        displays =  new ArrayList<>();
    }

    public void weatherChanged(){
        notifyObservers();
    }

    @Override
    public void addObserver(final Observer observer) {
        displays.add(observer);
    }

    @Override
    public void removeObserver(final Observer observer) {
        displays.remove(observer);
    }

    @Override
    public void notifyObservers() {
        displays.forEach(display -> display.update(temperature, humidity, pressure));
    }

    public void changeMeasurements (final int temperature, final int humidity, final int pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.weatherChanged();
    }
}
