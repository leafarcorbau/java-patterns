package dh.java.patterns.behavioral.observer.v2.display;

public class CurrentDisplay implements Observer, WeatherDisplay {
    @Override
    public void update(int temperature, int humidity, int pressure){
        //some logic
    }

    @Override
    public void display() {
        //some logic
    }
}
