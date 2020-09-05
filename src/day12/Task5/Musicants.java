package day12.Task5;

public class Musicants {
    private String name;
    private Integer year;

    public Musicants(String name, Integer year) {
        this.name = name;
        this.year = year;
    }

    public Musicants(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
