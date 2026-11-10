package Jvdreersimao_Patterns.observer;

import java.util.ArrayList;
import java.util.List;

class WeatherStation {
    private List<TemperatureObserver> observers = new ArrayList<>();
    private double currentTemperature;

    public void subscribe(TemperatureObserver observer) {
        observers.add(observer);
    }

    public void unsubscribe(TemperatureObserver observer) {
        observers.remove(observer);
    }

    public void setTemperature(double newTemp) {
        this.currentTemperature = newTemp;
        notifyObservers();
    }

    private void notifyObservers() {
        for (TemperatureObserver observer : observers) {
            observer.onTemperatureChanged(currentTemperature);
        }
    }
}
