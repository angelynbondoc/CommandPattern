package commandPattern;

// Command implementations for MusicPlayer
public class MusicPlayerOn implements Command {
    private MusicPlayer musicPlayer;

    public MusicPlayerOn(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String execute() {
        return musicPlayer.turnOn();
    }
}





