package day3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String town="";


        while (town!="Stop"){
            System.out.println("Введите наименование города");
            Scanner scanner = new Scanner(System.in);
            town = scanner.nextLine();

            switch (town){
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;
                case "Stop":
                    System.out.println("Выходим...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        }
    }
}

            /*
            if(town.equals("Москва") || town.equals("Владивосток") || town.equals("Ростов")){
                System.out.println("Россия");
            }else if(town.equals("Рим") || town.equals("Милан") || town.equals("Турин")){
                System.out.println("Италия");
            }else if(town.equals("Ливерпуль") || town.equals("Манчестер") || town.equals("Лондон")){
                System.out.println("Англия");
            }else if(town.equals("Берлин") || town.equals("Мюнхен") || town.equals("Кёльн")){
                System.out.println("Германия");
            }else if(town.equals("")){
                //пустота от пользователя
            }
            else if(town.equals("Stop")){
                break;
            }
            else {
                System.out.println("Неизвестная страна");
            }
            */