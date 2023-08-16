package com.example.triovision.controller;

import com.example.triovision.model.Player;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

import java.util.ArrayList;
import java.util.List;

public class CreatePlayerController {
    @FXML
    public ChoiceBox<Integer> playerchoice;
    public final Integer[] num = {1,2,3,4,5,6};
    public List<Player> players;

    public void addPlayer(){
        Integer selectedValue = playerchoice.getValue();
        players = new ArrayList<>();
        if (selectedValue != null) {
            for (int i = 0; i < selectedValue; i++) {
                players.add(new Player("tot"));
            }
    }


}}
