package day14.Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        List<Person> list = parseFileToObjList();

        System.out.println(Arrays.toString(list.toArray()));
    }


    public static List<Person> parseFileToObjList(){
        File file = new File("people.txt");
        List<Person> list =new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);


            while (scanner.hasNext()){
                String string = scanner.nextLine();


                String[] stringSplit = string.split(" ");
                String name = stringSplit[0];
                int years = Integer.parseInt(stringSplit[1]);

                Person person = new Person(name, years);
                list.add(person);
                if(years<0) {
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
