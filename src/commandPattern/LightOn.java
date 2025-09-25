package commandPattern;

// Command implementations for Light
public class LightOn implements Command {
    private Light light;

    public LightOn(Light light) {
        this.light = light;
    }

    @Override
    public String execute() {
        return light.turnOn();
    }
}





