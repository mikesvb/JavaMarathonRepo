package day12.Task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        MusicBand groupA = new MusicBand("Группа А", 2001);
        groupA.addMusicant("Иванов",15);
        groupA.addMusicant("Петров", 20);
        groupA.addMusicant("Сидоров", 30);

        groupA.delMusicant("Иванов");//удаление для теста

        MusicBand groupB = new MusicBand("Группа Б", 1999);
        groupB.addMusicant("Иванов", 15);
        groupB.addMusicant("Петров", 20);
        groupB.addMusicant("Сидоров2", 35);
        System.out.println("До слияния группа А");
        System.out.println(groupA.getMusicants().toString());
        System.out.println("До слияния группа Б");
        System.out.println(groupB.getMusicants().toString());


        mergeGroup(groupA,groupB);

        System.out.println("После слияния группа А");
        System.out.println(groupA.getMusicants().toString());
        System.out.println("После слияния группа Б");
        System.out.println(groupB.getMusicants().toString());


        //groupB.getStringMusicants();



    }

    public static void mergeGroup(MusicBand groupA, MusicBand groupB){

        List<Musicants> listA = groupA.getMusicants();

        List<Musicants> listB = groupB.getMusicants();

        List<Musicants> forDelete =new ArrayList<>();

        Iterator<Musicants> musIterator = listA.iterator();

        while(musIterator.hasNext()) {
            Musicants nextMus = musIterator.next();

            int i = 0;
            for (Musicants listb : listB) {
                if (nextMus.getName().equals(listb.getName())) {
                    i = 1;
                    System.out.println(nextMus.getName() + " уже есть в группе Б");
                }
                forDelete.add(new Musicants(nextMus.getName()));
            }
            if (i == 0) {
                listB.add(nextMus);
            }

        }

        for(Musicants listDel:forDelete){
            groupA.delMusicant(listDel.getName());
        }


    }
}
