package day14.Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        File file = new File("test14.txt");
        try {
            Scanner scanner = new Scanner(file);
            String string = scanner.nextLine();

            String[] numberString = string.split(":::");
            int length = numberString.length;

            if(length>10 || length<10){
                try {
                    throw  new IOException();
                }catch (IOException e){
                    System.out.println("Некорректный входной файл");
                }
            }else{
                int summ=0;
                for (String number:numberString){

                    summ+=Integer.parseInt(number);
                }

                System.out.println("Сумма чисел из файла равна: " + summ);
            }



        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
