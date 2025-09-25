package commandPattern;

public class SmartHomeApp {
    public static void main(String[] args) {
       
        Light livingRoomLight = new Light("Living Room Light");
        Thermostat thermostat = new Thermostat("Home Thermostat");
        MusicPlayer musicPlayer = new MusicPlayer("Living Room Music Player");

        SmartHomeHub hub = new SmartHomeHub();

        //Light commands
        hub.setCommand(new LightOn(livingRoomLight));
        System.out.println(hub.executeCommand());

        hub.setCommand(new LightIncrease(livingRoomLight));
        System.out.println(hub.executeCommand());

        hub.setCommand(new LightDecrease(livingRoomLight));
        System.out.println(hub.executeCommand());

        hub.setCommand(new LightOff(livingRoomLight));
        System.out.println(hub.executeCommand());

        //Thermostat commands
        hub.setCommand(new ThermostatOn(thermostat));
        System.out.println(hub.executeCommand());

        hub.setCommand(new ThermostatIncrTemp(thermostat));
        System.out.println(hub.executeCommand());

        hub.setCommand(new ThermostatDecrTemp(thermostat));
        System.out.println(hub.executeCommand());

        hub.setCommand(new ThermostatOff(thermostat));
        System.out.println(hub.executeCommand());

        //MusicPlayer commands
        hub.setCommand(new MusicPlayerOn(musicPlayer));
        System.out.println(hub.executeCommand());

        hub.setCommand(new MusicPlayerIncrVol(musicPlayer));
        System.out.println(hub.executeCommand());

        hub.setCommand(new MusicPlayerDecrVol(musicPlayer));
        System.out.println(hub.executeCommand());

        hub.setCommand(new MusicPlayerOff(musicPlayer));
        System.out.println(hub.executeCommand());
    }
}