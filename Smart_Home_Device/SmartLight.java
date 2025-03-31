package Smart_Home_Device;

public class SmartLight extends SmartDevice {
    //Constructor
    SmartLight (String deviceName) {
        super(deviceName);
    }

    //implement abstact methods (with override)
    @Override
    void turnOn() {
        System.out.println("Light is now ON");
    }

    @Override
    void turnOff() {
        System.out.println("Light is now OFF");
    }
}
