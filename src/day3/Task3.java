package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Integer i =0;
        while(i<5){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите два числа через пробел");

            Double firstNumber = scanner.nextDouble();
            Double secondNumber = scanner.nextDouble();

            if(secondNumber.equals(new Double("0.0"))){
                System.out.println("Деление на 0");
                i++;
                continue;
            }

            System.out.println("Результат " + (firstNumber/secondNumber));
            i++;
        }
    }
}
