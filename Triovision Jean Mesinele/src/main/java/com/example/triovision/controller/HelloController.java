package com.example.triovision.controller;

import com.example.triovision.HelloApplication;
import com.example.triovision.model.Card;
import com.example.triovision.model.Game;
import com.example.triovision.model.Player;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable  {

    public Game game;
    @FXML
    private Label question;
    @FXML
    public CheckBox checkBoxJ1;
    @FXML
    public Label labelNbJ2;
    @FXML
    public CheckBox checkBoxJ2;
    @FXML
    public Text textBoxJ2;

    @FXML
    public ChoiceBox<Integer> playerchoice;
    public final Integer[] num = {1,2};


    @FXML
    private Label welcomeText;

    public ChoiceBox<Integer> getPlayerchoice(Integer[] num) {
        return playerchoice;
    }

    public void setPlayerchoice(ChoiceBox<Integer> playerchoice) {
        this.playerchoice = playerchoice;
    }

    @FXML
    protected void buttonValidate()  {
        Integer selectedValue = playerchoice.getValue();

        if (selectedValue == null) {
            welcomeText.setText("Sélectionnez un nombre de joueurs !");
            welcomeText.setTextFill(Color.RED);
            return;
        }
        else {

            try {

                FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("principal-page.fxml"));
                Parent root = loader.load();


                Stage newStage = new Stage();
                newStage.setScene(new Scene(root));
                newStage.setTitle("Triovision Page Principale");  // Titre fenêtre
                newStage.show();
                List<Card> cards = createRandomCards();
                List<Player> players = new ArrayList<>();
                Player player1 = new Player("J1");
                players.add(player1);

                if(selectedValue == 2) {
                    Player player2 = new Player("J2");
                    players.add(player2);
                }

                game = new Game(cards, players);

                CarteMotifController carteMotifController = loader.getController();
                carteMotifController.fillColor(game);




            }
            catch (Exception e) {
                e.printStackTrace();

            }

        }
    }




    private List<Card> createRandomCards() {
        List<Card> cards = new ArrayList<>();
        for (int i = 0; i < 60; i++) {
            int a = 1 + (int) (Math.random() * 4);
            int b = 1 + (int) (Math.random() * 4);
            int c = 1 + (int) (Math.random() * 4);
            int d = 1 + (int) (Math.random() * 4);
            if ((int) (Math.random() * 2) == 0) {
                c = 0;
            } else {
                d = 0;
            }

            if( i < 11 && a==b){ // MARCHE VRAIMENT ??
                i--;
                continue;
            }
            if (a==b && b==c || a==b && b==d){
                i--;
                continue;
            }
            Card card = new Card(a,b,c,d);
            cards.add(card);
        }
        return cards;
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        playerchoice.getItems().addAll(num);
    }
}