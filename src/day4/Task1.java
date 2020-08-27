package day4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] arrayRandom = new int[size];

        int countNumbersOver8=0;//количество чисел больше 8
        int countNumbersEqual1=0;//количество чисела равных 1
        int countEvenNumbers=0;//количество четных чисел
        int countNotEvenNumbers=0;//количество нечетных чисел
        int summ=0;//сумма всех элементов массива

        for(int i=0; i<size; i++){
            int random = (int) ( Math.random() * 11 );
            arrayRandom[i]=random;

            if(arrayRandom[i]>8){
                countNumbersOver8++;
            }

            if(arrayRandom[i]==1){
                countNumbersEqual1++;
            }

            if(arrayRandom[i]%2==0){
                countEvenNumbers++;
            } else{
                countNotEvenNumbers++;
            }

            summ+=arrayRandom[i];
        }

        int sizeArray=arrayRandom.length;//длина массива

        System.out.println("Длина массива: " + sizeArray);
        System.out.println("Количество чисел больше 8: " + countNumbersOver8);
        System.out.println("Количество чисела равных 1: " + countNumbersEqual1);
        System.out.println("Количество четных чисел: " + countEvenNumbers);
        System.out.println("Количество нечетных чисел: " + countNotEvenNumbers);
        System.out.println("Сумма всех элементов массива: " + summ);
        //System.out.println(Arrays.toString(arrayRandom));
    }
}