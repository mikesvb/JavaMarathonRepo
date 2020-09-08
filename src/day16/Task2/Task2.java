package day16.Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        String line1="";
        String line2="";
        File file = new File("newNumsDay16.txt");
        PrintWriter pw = new PrintWriter(file);
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int num = random.nextInt(101);
            line1+=" " + num;
            pw.println(num);
        }

        pw.close();

        File newFile = new File("newNumsDay16_2.txt");
        PrintWriter pwNewFile = new PrintWriter(newFile);
        Scanner scanner = new Scanner(file);

        int i=0;
        double summ = 0.0;


        while (scanner.hasNext()) {
            i++;
            String string = scanner.nextLine();
            int intFromFile = Integer.parseInt(string);
            double newDouble = (double)intFromFile;
            summ +=newDouble;
            if (i%20 == 0) {
                Double sr= (summ/20);
                pwNewFile.println(sr);
                line2+=" " + (sr);
                summ=0.0;
            }
        }
        pwNewFile.close();

        Scanner scanner2 = new Scanner(newFile);


        double allSumm = 0.0;

        while (scanner2.hasNext()) {
            String string = scanner2.nextLine();
            Double newDouble = Double.parseDouble(string);
            allSumm +=newDouble;

         }



        System.out.println("Файл 1: " + line1);
        System.out.println("Файл 2: " + line2);
        DecimalFormat df = new DecimalFormat("#");
        System.out.println("Общая сумма: " + df.format(allSumm));

    }
}
