package commandPattern;

public class MusicPlayerOff implements Command {
    private MusicPlayer musicPlayer;

    public MusicPlayerOff(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String execute() {
        return musicPlayer.turnOff();
    }
}