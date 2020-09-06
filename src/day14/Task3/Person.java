package day14.Task3;

public class Person {
    private String name;
    private Integer years;

    public Person(String name, Integer years) {
        this.name = name;
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }
    @Override
    public String toString() {
        return "{name='" + name + "', year="+ years +"}";
    }
}
