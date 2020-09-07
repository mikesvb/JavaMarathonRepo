package day15.Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("shoes.csv");
        File newFile = new File("zeroShoes.txt");
        PrintWriter pw = new PrintWriter(newFile);

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()){
                String string = scanner.nextLine();

                String[] stringSplit = string.split(";");
                int countShoes = Integer.parseInt(stringSplit[2]);

                if(countShoes==0) {
                    pw.println(string);
                }
            }
        pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}
