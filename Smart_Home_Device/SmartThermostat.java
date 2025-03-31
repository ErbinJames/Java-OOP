package Smart_Home_Device;

public class SmartThermostat extends SmartDevice{

    SmartThermostat (String deviceName) {
        super(deviceName);
    }

    //abstract methods
    @Override
    void turnOn() {
        System.out.println("Thermostat is now set to 22°C");
    }

    @Override
    void turnOff() {
        System.out.println("Thermostat is turned off");
    }
    
}
