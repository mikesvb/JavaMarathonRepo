package day16.Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        File file = new File("test14.txt");
        try {
            Scanner scanner = new Scanner(file);
            String string = scanner.nextLine();

            String[] numberString = string.split(":::");
            int length = numberString.length;

            int summ=0;
            String lineNum="";
            for (String number:numberString){

                summ+=Integer.parseInt(number);
                lineNum +=" " + number;
            }
            double newSumm = (double)summ;
            double newLength = (double)length;
            double newNum= newSumm/newLength;

            System.out.println("Среднее в txt файле: " + lineNum);
            DecimalFormat df = new DecimalFormat("#.###");

            System.out.println("Ответ (среднее): " + newNum + " -->" + df.format(newNum));

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
