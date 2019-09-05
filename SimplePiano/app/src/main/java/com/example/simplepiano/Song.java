package com.example.simplepiano;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
Songbook consist of three nursery rhymes: Mary Had a little lamb,
Jingle Bells, and Old Macdonald had a farm
 */


public class Song {
    ArrayList<Queue> songBook = new ArrayList<Queue>();
    Queue<Notes> maryHadALittleLamb = new LinkedList<>();
    Queue<Notes> jingleBells = new LinkedList<>();
    Queue<Notes> oldMacdonald = new LinkedList<>();


    public Song(){
        //Adding notes for Mary Had a little lamb
        maryHadALittleLamb.add(new Notes("E",false, false));
        maryHadALittleLamb.add(new Notes("D",false, false));
        maryHadALittleLamb.add(new Notes("C", false,false));
        maryHadALittleLamb.add(new Notes("D",false, false));
        maryHadALittleLamb.add(new Notes("E",false, false));
        maryHadALittleLamb.add(new Notes("E", false,false));
        maryHadALittleLamb.add(new Notes("E", true,true));

        maryHadALittleLamb.add(new Notes("D",false, false));
        maryHadALittleLamb.add(new Notes("D", false,false));
        maryHadALittleLamb.add(new Notes("D",false, false));
        maryHadALittleLamb.add(new Notes("E",false, false));
        maryHadALittleLamb.add(new Notes("G", false,false));
        maryHadALittleLamb.add(new Notes("G", true,true));

        maryHadALittleLamb.add(new Notes("E",false, false));
        maryHadALittleLamb.add(new Notes("D",false, false));
        maryHadALittleLamb.add(new Notes("C", false,false));
        maryHadALittleLamb.add(new Notes("D",false, false));
        maryHadALittleLamb.add(new Notes("E",false, false));
        maryHadALittleLamb.add(new Notes("E", false,false));
        maryHadALittleLamb.add(new Notes("E", true,true));

        maryHadALittleLamb.add(new Notes("E",false, false));
        maryHadALittleLamb.add(new Notes("D", true,false));
        maryHadALittleLamb.add(new Notes("D",true, false));
        maryHadALittleLamb.add(new Notes("E",true, false));
        maryHadALittleLamb.add(new Notes("D", true,false));
        maryHadALittleLamb.add(new Notes("C", true,true));
        songBook.add(maryHadALittleLamb);

        //Adding notes to the jingleBells song
        jingleBells.add(new Notes("E", false, false));
        jingleBells.add(new Notes("E", false, false));
        jingleBells.add(new Notes("E", false, false));
        jingleBells.add(new Notes("E", true, false));
        jingleBells.add(new Notes("E", false, false));
        jingleBells.add(new Notes("E", false, true));

        jingleBells.add(new Notes("E", false, false));
        jingleBells.add(new Notes("G", false, false));
        jingleBells.add(new Notes("C", false, false));
        jingleBells.add(new Notes("D", false, false));
        jingleBells.add(new Notes("E", false, true));

        jingleBells.add(new Notes("F", false, false));
        jingleBells.add(new Notes("F", false, false));
        jingleBells.add(new Notes("F", false, false));
        jingleBells.add(new Notes("F", false, false));
        jingleBells.add(new Notes("F", false, false));
        jingleBells.add(new Notes("E", false, false));
        jingleBells.add(new Notes("E", false, false));
        jingleBells.add(new Notes("E", false, true));

        jingleBells.add(new Notes("E", false, false));
        jingleBells.add(new Notes("D", false, false));
        jingleBells.add(new Notes("D", false, false));
        jingleBells.add(new Notes("E", false, false));
        jingleBells.add(new Notes("D", false, false));
        jingleBells.add(new Notes("G", true, true));

        songBook.add(jingleBells);

        //Adding notes to OldMacdonald had a farm
        oldMacdonald.add(new Notes("G", false, false));
        oldMacdonald.add(new Notes("G", false, false));
        oldMacdonald.add(new Notes("G", true, false));
        oldMacdonald.add(new Notes("D", false, false));
        oldMacdonald.add(new Notes("E", false, false));
        oldMacdonald.add(new Notes("E", false, false));
        oldMacdonald.add(new Notes("D", false, true));

        oldMacdonald.add(new Notes("B", false, false));
        oldMacdonald.add(new Notes("B", false, false));
        oldMacdonald.add(new Notes("A", true, false));
        oldMacdonald.add(new Notes("A", false, false));
        oldMacdonald.add(new Notes("G", false, false));
        oldMacdonald.add(new Notes("D", true, true));

        oldMacdonald.add(new Notes("G", false, false));
        oldMacdonald.add(new Notes("G", false, false));
        oldMacdonald.add(new Notes("G", true, false));
        oldMacdonald.add(new Notes("D", false, false));
        oldMacdonald.add(new Notes("E", false, false));
        oldMacdonald.add(new Notes("E", false, false));
        oldMacdonald.add(new Notes("D", false, true));

        oldMacdonald.add(new Notes("B", false, false));
        oldMacdonald.add(new Notes("B", false, false));
        oldMacdonald.add(new Notes("A", true, false));
        oldMacdonald.add(new Notes("A", false, false));
        oldMacdonald.add(new Notes("G", false, false));

        songBook.add(oldMacdonald);

    }

    //Get a song from the song book
    public Queue<Notes> getSong(int songNumber){
        if(songNumber == 1){
            return songBook.get(0);
        }else if(songNumber == 2){
            return songBook.get(1);
        }else{
            return songBook.get(2);
        }
    }
}
