package day12.Task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MusicBand {
    private String name;
    private Integer year;
    private List<Musicants> musicants;

    public MusicBand(String name, Integer year) {
        this.name = name;
        this.year = year;
        this.musicants = new ArrayList<>();
    }

    public List<Musicants> getMusicants() {
        return musicants;
    }

    public void setMusicants(List<Musicants> musicants) {
        this.musicants = musicants;
    }

    public void addMusicant(String musicant, Integer year){
        musicants.add(new Musicants(musicant, year));
    }

    public void delMusicant(String musicant){

        Iterator<Musicants> musIterator = musicants.iterator();

        while(musIterator.hasNext()) {
            Musicants nextMus = musIterator.next();
            if (nextMus.getName().equals(musicant)) {
                musIterator.remove();
            }
        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String toString(){
        return "Name: "+name+" | Year: "+year ;
    }

    public void getStringMusicants() {

        for(Musicants musicantString :musicants){
            System.out.println(musicantString.getName());
        }

    }
}
