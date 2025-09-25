package commandPattern;

public class Thermostat extends Device {
    private int temperature;

    public Thermostat(String name) {
        super(name);
        this.temperature = 25; //in Celsius
    }

    @Override
    public String turnOn() {
        return name + " is turned on at " + temperature + "°C";
    }

    @Override
    public String turnOff() {
        return name + " is turned off";
    }

    public String increaseTemperature() {
        temperature += 1;
        return name + " temperature increased to " + temperature + "°C";
    }

    public String decreaseTemperature() {
        temperature -= 1;
        return name + " temperature decreased to " + temperature + "°C";
    }

}
