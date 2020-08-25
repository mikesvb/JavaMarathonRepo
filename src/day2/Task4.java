package day2;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Task4 {
    public static void main(String[] args) {

        Double y=420.0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите X");

        Double xNumber = scanner.nextDouble();

        if(xNumber>=5){
            y=(pow(xNumber,2)-10)/(xNumber+7);
        }else if(xNumber>-3 & xNumber<5){
            y=(xNumber+3)*(pow(xNumber,2)-2);
        }

        System.out.println("Значение y = " + y);
    }
}
