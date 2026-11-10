package Jvdreersimao_Patterns.observer;

public class FanController implements TemperatureObserver {
    @Override
    public void onTemperatureChanged(double temp) {
        if (temp > 28) {
            
            System.out.println("Ventilador: LIGAR");
            return;
        }
        System.out.println("Ventilador: DESLIGAR");
    }
}
