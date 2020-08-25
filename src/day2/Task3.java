package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Integer bezOstatka = 5;
        Integer neDelyatsya = 10;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите диапазон (два числа через пробел)");

        Integer firstNumber = scanner.nextInt();
        Integer secondNumber = scanner.nextInt();

        System.out.println("Вычисляем диапазон между... " + firstNumber + " и " + secondNumber + " (без остатка деления на " + bezOstatka +", но не делятся на " + neDelyatsya +". Введённые цифры диапазона не учитываются)");
        firstNumber++;
        while(firstNumber<secondNumber){
            if ((firstNumber % bezOstatka)==0 & (firstNumber % neDelyatsya)!=0) {
                System.out.print(firstNumber + " ");
            }
            firstNumber++;
        }


    }
}
