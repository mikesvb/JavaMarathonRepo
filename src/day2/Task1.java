package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите этажность здания");

        Integer stingNumber = scanner.nextInt();

        if(stingNumber>=1 && stingNumber<=4){
            System.out.println("Малоэтажный дом");
        } else if(stingNumber>=5 && stingNumber<=8){
            System.out.println("Среднеэтажный дом");
        } else if(stingNumber>=9){
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Некорректный ввод");
        }

    }
}
