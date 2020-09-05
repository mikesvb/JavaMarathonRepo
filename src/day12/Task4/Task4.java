package day12.Task4;


import day12.Task5.Musicants;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        MusicBand groupA = new MusicBand("Группа А", 2001);
        groupA.addMusicant("Иванов");
        groupA.addMusicant("Петров");
        groupA.addMusicant("Сидоров");

        groupA.delMusicant("Иванов");//удаление для теста

        MusicBand groupB = new MusicBand("Группа Б", 1999);
        groupB.addMusicant("Иванов");
        groupB.addMusicant("Петров");
        groupB.addMusicant("Сидоров2");
        System.out.println("До слияния группа А");
        System.out.println(groupA.getMusicants().toString());
        System.out.println("До слияния группа Б");
        System.out.println(groupB.getMusicants().toString());


        mergeGroup(groupA,groupB);

        System.out.println("После слияния группа А");
        System.out.println(groupA.getMusicants().toString());
        System.out.println("После слияния группа Б");
        System.out.println(groupB.getMusicants().toString());
    }

    private static void mergeGroup(MusicBand groupA, MusicBand groupB) {

        List<String> listA = groupA.getMusicants();

        List<String> listB = groupB.getMusicants();


        List<String> forDelete =new ArrayList<>();

        Iterator<String> musIterator = listA.iterator();

        while(musIterator.hasNext()) {
            String nextMus = musIterator.next();

            int i = 0;
            for (String listb : listB) {
                if (nextMus.equals(listb)) {
                    i = 1;
                    System.out.println(nextMus + " уже есть в группе Б");
                }
                forDelete.add(nextMus);
            }
            if (i == 0) {
                listB.add(nextMus);
            }

        }

        for(String listDel:forDelete){
            groupA.delMusicant(listDel);
        }
    }
}
