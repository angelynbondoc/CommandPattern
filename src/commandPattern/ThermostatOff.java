package commandPattern;

public class ThermostatOff implements Command {
    private Thermostat thermostat;

    public ThermostatOff(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public String execute() {
        return thermostat.turnOff();
    }
}