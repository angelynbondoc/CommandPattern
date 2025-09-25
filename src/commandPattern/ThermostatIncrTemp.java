package commandPattern;

public class ThermostatIncrTemp implements Command {
    private Thermostat thermostat;

    public ThermostatIncrTemp(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public String execute() {
        return thermostat.increaseTemperature();
    }
}