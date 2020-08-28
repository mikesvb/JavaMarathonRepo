package day5.Task2;

import day5.Task2.Moto;

public class Task2 {
    public static void main(String[] args) {
        Moto moto = new Moto(2015, "Suzuki", "black" );
        System.out.println(moto.getYearOfManufactured() + " / " + moto.getModel() + " / " + moto.getColor());
    }
}
