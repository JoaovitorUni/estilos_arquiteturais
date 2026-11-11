package Jvdreersimao_Patterns.observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        
        TemperatureObserver consoleDisplay = new ConsoleDisplay();
        TemperatureObserver fanController = new FanController();
        
        station.subscribe(consoleDisplay);
        station.subscribe(fanController);
        
        station.setTemperature(26);
        
        station.setTemperature(30);
        
        station.unsubscribe(consoleDisplay);

        station.setTemperature(27);
    }
}