package day6.Task1;

public class Moto {

    private int yearOfManufactured;
    private String color;
    private String model;

    public Moto(int yearOfManufactured, String model, String color) {
        this.yearOfManufactured = yearOfManufactured;
        this.color = color;
        this.model = model;
    }

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
        System.out.println("Это Мотоцикл");
    }

    public int year(int sendYear){
        return (sendYear-this.yearOfManufactured);
    }
}
