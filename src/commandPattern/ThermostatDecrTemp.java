package commandPattern;

public class ThermostatDecrTemp implements Command {
    private Thermostat thermostat;

    public ThermostatDecrTemp(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public String execute() {
        return thermostat.decreaseTemperature();
    }
}