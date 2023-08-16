package com.example.triovision.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

public class AddPointToPlayersController {



    public int ptj1;
    public int ptj2;

    @FXML
    public ChoiceBox choiceBoxJ1;
    @FXML
    public ChoiceBox choiceBoxJ2;

    public void addPoint(){

        if (choiceBoxJ1.isShowing()){
            ptj1 = ptj1 + 1;
        }
        else {
            ptj2 = + 1;
        }


    }
}
