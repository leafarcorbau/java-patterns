package dh.java.patterns.behavioral.observer.v1.display;

public interface WeatherDisplay {

    void update(int temperature, int humidity, int pressure);
    void display();
}
