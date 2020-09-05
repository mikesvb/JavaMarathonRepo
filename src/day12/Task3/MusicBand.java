package day12.Task3;

public class MusicBand {
    private String name;
    private Integer year;

    public MusicBand(String name, Integer year) {
        this.name = name;
        this.year = year;
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
}
