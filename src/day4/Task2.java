package day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arrayRandom = new int[100];

        for(int i=0; i<100; i++){
            int random = (int) (Math.random() * 10001);
            arrayRandom[i]=random;
        }
        int max = 0;
        int min = 0;
        int countEndZero = 0;
        int summOfEndZero = 0;

        int i=0;
        for (int num : arrayRandom) {

            if(i==0){//инизиализация минимального первым числом массива, т.к. в массиве могут быть нули
                min=num;
            }

            if(num>max){
                max=num;
            }

            if(num<min){
                min=num;
            }

            if(num%10==0){
                countEndZero++;
                summOfEndZero+=num;
            }

            i++;
        }

        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + countEndZero);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + summOfEndZero);

        //System.out.println(Arrays.toString(arrayRandom));
    }
}
