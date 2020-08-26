package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите два числа через пробел");

            Double firstNumber = scanner.nextDouble();
            Double secondNumber = scanner.nextDouble();

            if(secondNumber.equals(new Double("0.0"))){
                System.out.println("На ноль делить нельзя");
                break;
            }

            System.out.println("Результат " + (firstNumber/secondNumber));
        }

    }
}
