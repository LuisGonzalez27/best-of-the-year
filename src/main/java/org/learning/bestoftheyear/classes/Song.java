package org.learning.bestoftheyear.classes;

public class Song {
    int id;
    String name;

    public Song(int id, String name){
        super();
        this.id = id;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getId() {
        return id;
    }
}
