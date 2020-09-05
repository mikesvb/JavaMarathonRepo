package day12.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> list = new ArrayList<>();

        list.add(new MusicBand("MusicGroup1", 1999));
        list.add(new MusicBand("MusicGroup2", 2000));
        list.add(new MusicBand("MusicGroup3", 1998));
        list.add(new MusicBand("MusicGroup4", 2002));
        list.add(new MusicBand("MusicGroup5", 2004));
        list.add(new MusicBand("MusicGroup6", 2007));
        list.add(new MusicBand("MusicGroup7", 1999));
        list.add(new MusicBand("MusicGroup8", 1970));
        list.add(new MusicBand("MusicGroup9", 1980));
        list.add(new MusicBand("MusicGroup10", 1996));
        list.add(new MusicBand("MusicGroup11", 2001));

        Collections.shuffle(list);

        List<MusicBand> newList = new ArrayList<>();
        for(MusicBand groups :list){
            if(groups.getYear()>2000){
                newList.add(groups);
            }
        }

        for (MusicBand group:list)System.out.println(group);

        System.out.println("------------------");

        for (MusicBand group:newList)System.out.println(group);

    }
}
