package commandPattern;

public class MusicPlayerIncrVol implements Command {
    private MusicPlayer musicPlayer;

    public MusicPlayerIncrVol(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String execute() {
        return musicPlayer.increaseVolume();
    }
}