package Smart_Home_Device;

public class SmartSpeaker extends SmartDevice {
    //constructor
    SmartSpeaker (String deviceName) {
        super(deviceName);
    }

    //abstract methods
    @Override
    void turnOn() {
        System.out.println("Speaker is now playing music");
    }

    @Override
    void turnOff() {
        System.out.println("Speaker is now OFF");
    }
}
