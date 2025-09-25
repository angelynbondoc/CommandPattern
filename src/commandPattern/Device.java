package commandPattern;

// Abstract Device class to define common behavior for all devices
public abstract class Device {
    protected String name;

    public Device(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Common methods for devices (to be overridden as needed)
    public abstract String turnOn();
    public abstract String turnOff();
}