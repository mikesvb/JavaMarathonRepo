package day6.Task1;

public class Car {

    private int yearOfManufactured;
    private String color;
    private String model;

    public int getYearOfManufactured() {
        return yearOfManufactured;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void setYearOfManufactured(int yearOfManufactured) {
        this.yearOfManufactured = yearOfManufactured;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void info(){
        System.out.println("Это Автомобиль");
    }

    public int year(int sendYear){
        return (sendYear-this.yearOfManufactured);
    }
}
