package Smart_Home_Device;

public abstract class SmartDevice {
    String deviceName;

    //constructor
    SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    //Abstract methods
    abstract void turnOn();
    abstract void turnOff();

    void showStatus() {
        System.out.println("Device: " + deviceName);
    }

}
