package commandPattern;

public class LightDecrease implements Command {
    private Light light;

    public LightDecrease(Light light) {
        this.light = light;
    }

    @Override
    public String execute() {
        return light.decreaseBrightness();
    }
}