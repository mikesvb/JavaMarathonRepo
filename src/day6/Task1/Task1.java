package day6.Task1;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYearOfManufactured(2000);
        car.setColor("Silver");
        car.setModel("Honda HRV");
        System.out.println(car.getYearOfManufactured() + " / " + car.getModel() + " / " + car.getColor());
        car.info();
        System.out.println("Разница между 2020 годом и годом производства: " + car.year(2020));



        Moto moto = new Moto(2015, "Suzuki", "black" );
        System.out.println(moto.getYearOfManufactured() + " / " + moto.getModel() + " / " + moto.getColor());
        moto.info();
        System.out.println("Разница между 2020 годом и годом производства: " + moto.year(2020));

    }
}
