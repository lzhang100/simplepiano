package com.example.simplepiano;
/*
Every song has a note, sometimes pauses between notes occur so a space is denoted for that, and a
new line is created when one line of a song finishes.
 */


public class Notes {
    String nNotes;
    boolean nSpace;
    boolean nEndLine;

    public Notes(String notes, boolean space, boolean endLine){
        nNotes = notes;
        nSpace = space;
        nEndLine = endLine;
    }

    public String getNote(){
        return nNotes;
    }

    public boolean getSpace(){
       return nSpace;
    }

    public boolean getEndLine(){
        return nEndLine;
    }


}
