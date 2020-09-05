package day12.Task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Toyota");
        list.add("Honda");
        list.add("Nissan");
        list.add("Lexus");
        list.add("Infinity");

        for(String cars :list){
            System.out.println(cars);
        }

        System.out.println("-----------------");
        list.add(3,"Lada");
        list.remove(0);

        for(String cars :list){
            System.out.println(cars);
        }

    }
}
