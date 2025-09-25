package commandPattern;

public class Light extends Device {
    private int brightness;

    public Light(String name) {
        super(name);
        this.brightness = 0; //default brightness
    }

    @Override
    public String turnOn() {
        brightness = 50; //brightness when turned on
        return name + " is turned on with brightness " + brightness + "%";
    }

    @Override
    public String turnOff() {
        brightness = 0;
        return name + " is turned off";
    }

    public String increaseBrightness() {
        if (brightness < 100) {
            brightness += 10;
        }
        return name + " brightness increased to " + brightness + "%";
    }

    public String decreaseBrightness() {
        if (brightness > 0) {
            brightness -= 10;
        }
        return name + " brightness decreased to " + brightness + "%";
    }
}