package commandPattern;

public class LightIncrease implements Command {
    private Light light;

    public LightIncrease(Light light) {
        this.light = light;
    }

    @Override
    public String execute() {
        return light.increaseBrightness();
    }
}
