package com.example.simplepiano;
import java.util.HashMap;

/*
Storing all the resource button ids and the raw piano sounds in a key value pair using a hashmap
 */


public class Piano {

    HashMap<Integer, Integer> keys = new HashMap<Integer, Integer>();
    HashMap<Integer, Integer> creepyKeys = new HashMap<Integer, Integer>();
    int mode = 1;

    public Piano(){
        //this.mode = mode;

        keys.put(R.id.c, R.raw.piano_c);
        keys.put(R.id.c_sharp, R.raw.piano_c_sharp);
        keys.put(R.id.d, R.raw.piano_d);
        keys.put(R.id.d_sharp, R.raw.piano_d_sharp);
        keys.put(R.id.e, R.raw.piano_e);
        keys.put(R.id.f, R.raw.piano_f);
        keys.put(R.id.f_sharp, R.raw.piano_f_sharp);
        keys.put(R.id.g, R.raw.piano_g);
        keys.put(R.id.g_sharp, R.raw.piano_g_sharp);
        keys.put(R.id.a, R.raw.piano_a);
        keys.put(R.id.a_sharp, R.raw.piano_a_sharp);
        keys.put(R.id.b, R.raw.piano_b);

        creepyKeys.put(R.id.c, R.raw.piano_c_creepy);
        creepyKeys.put(R.id.c_sharp, R.raw.piano_c_sharp_creepy);
        creepyKeys.put(R.id.d, R.raw.piano_d_creepy);
        creepyKeys.put(R.id.d_sharp, R.raw.piano_d_sharp_creepy);
        creepyKeys.put(R.id.e, R.raw.piano_e_creepy);
        creepyKeys.put(R.id.f, R.raw.piano_f_creepy);
        creepyKeys.put(R.id.f_sharp, R.raw.piano_f_sharp_creepy);
        creepyKeys.put(R.id.g, R.raw.piano_g_creepy);
        creepyKeys.put(R.id.g_sharp, R.raw.piano_g_sharp_creepy);
        creepyKeys.put(R.id.a, R.raw.piano_a_creepy);
        creepyKeys.put(R.id.a_sharp, R.raw.piano_a_sharp_creepy);
        creepyKeys.put(R.id.b, R.raw.piano_b_creepy);
    }


    //Returning the raw file resource id when a button is clicked
    public int getPianoKey(int keyResourceId){
        if(mode == 1){
            return keys.get(keyResourceId);
        }else{
            return creepyKeys.get(keyResourceId);
        }
    }

    public void setMode(){
        if(mode == 1){
            mode = 2;
        }else{
            mode = 1;
        }
    }

    public int getMode(){
        return mode;
    }


}
