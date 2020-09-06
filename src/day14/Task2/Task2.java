package day14.Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        List<String> list = parseFileToStringList();

        System.out.println(Arrays.toString(list.toArray()));
    }


    public static List<String> parseFileToStringList(){
        File file = new File("people.txt");
        List<String> list =new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);


            while (scanner.hasNext()){
                String string = scanner.nextLine();
                list.add(string);

                String[] stringSplit = string.split(" ");
                int year = Integer.parseInt(stringSplit[1]);

                if(year<0) {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("Некорректный входной файл");
                    }
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        return list;
    }

}


