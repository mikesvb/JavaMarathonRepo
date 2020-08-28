package day5.Task1;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYearOfManufactured(2000);
        car.setColor("Silver");
        car.setModel("Honda HRV");
        System.out.println(car.getYearOfManufactured() + " / " + car.getModel() + " / " + car.getColor());
    }
}
