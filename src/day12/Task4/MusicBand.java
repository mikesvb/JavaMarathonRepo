package day12.Task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private Integer year;
    private List<String> musicants;

    public MusicBand(String name, Integer year) {
        this.name = name;
        this.year = year;
        this.musicants = new ArrayList<>();
    }

    public void addMusicant(String musicant){
        musicants.add(musicant);
    }

    public List<String> getMusicants() {
        return musicants;
    }

    public void delMusicant(String name) {
        musicants.remove(name);
    }
}
