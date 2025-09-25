package commandPattern;

public class MusicPlayer extends Device {
    private int volume;
    private String currentPlaylist;

    public MusicPlayer(String name) {
        super(name);
        this.volume = 50; //default volume
        this.currentPlaylist = "None";
    }

    @Override
    public String turnOn() {
        currentPlaylist = "Default Playlist";
        return name + " is turned on, playing " + currentPlaylist;
    }

    @Override
    public String turnOff() {
        currentPlaylist = "None";
        return name + " is turned off";
    }

    public String increaseVolume() {
        if (volume < 100) {
            volume += 10;
        }
        return name + " volume increased to " + volume;
    }

    public String decreaseVolume() {
        if (volume > 0) {
            volume -= 10;
        }
        return name + " volume decreased to " + volume;
    }
}