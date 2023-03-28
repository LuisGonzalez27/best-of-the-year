package org.learning.bestoftheyear.classes;

public class Movie {
    private int id;
    private String name;

    public Movie(int id, String name){
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
