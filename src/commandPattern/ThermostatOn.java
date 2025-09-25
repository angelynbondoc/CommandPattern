package commandPattern;

public class ThermostatOn implements Command {
    private Thermostat thermostat;

    public ThermostatOn(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public String execute() {
        return thermostat.turnOn();
    }
}




