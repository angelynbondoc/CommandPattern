package commandPattern;

public class MusicPlayerDecrVol implements Command {
    private MusicPlayer musicPlayer;

    public MusicPlayerDecrVol (MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String execute() {
        return musicPlayer.decreaseVolume();
    }
}