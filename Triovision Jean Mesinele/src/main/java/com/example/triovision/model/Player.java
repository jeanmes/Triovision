package com.example.triovision.model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private int cards;
    private final String name;


    public Player(String name) {
        this.name = name;
        this.cards = 0;
    }




    public String getName() {return name;}

    public void addCard(){
        cards = cards+1;
    }


    public int getCards() {
        return cards;
    }



}

