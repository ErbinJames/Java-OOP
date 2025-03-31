package Smart_Home_Device;

public class SmartHomeDevices {
    public static void main (String[] args) {
        //create the smart light object
        SmartLight smartlight = new SmartLight("Smart Light");
        //create the smart speaker object
        SmartSpeaker smartspeaker = new SmartSpeaker("Smart Speaker");
        //create the Smart thermostat object
        SmartThermostat smartthermostat = new SmartThermostat("Smart Thermostat");


        //display calling method for smart light
        System.out.println("Smart Light: ");
        smartlight.turnOn();
        smartlight.showStatus();
        smartlight.turnOff();

        System.out.println();

        //display calling method for smart speaker
        System.out.println("Smart Speaker: ");
        smartspeaker.turnOn();
        smartspeaker.showStatus();
        smartspeaker.turnOff();

        System.out.println();

        //display calling method for Smart Thermostat
        System.out.println("Smart Thermostat: ");
        smartthermostat.turnOn();
        smartthermostat.showStatus();
        smartthermostat.turnOff();




    }
}
