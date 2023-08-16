package com.example.triovision.model;

import java.util.List;

public class Game {

    private List<Card> cards;
    private List<Player> players;

    public Game(List<Card> cards, List<Player> players) {
        this.cards = cards;
        this.players = players;
    }

    public List<Card> getCards() {
        return cards;
    }

    public List<Player> getPlayers() {
        return players;
    }
}
