package com.example.triovision.controller;

import com.example.triovision.HelloApplication;
import com.example.triovision.model.Card;
import com.example.triovision.model.Game;
import com.example.triovision.model.Player;
import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.*;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.transform.MatrixType;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;


public class CarteMotifController implements Initializable {




    // Rectangles des cartes
    @FXML
    public Rectangle rectHaut1;
    public Rectangle rectHaut2;
    public Rectangle rectHaut3;
    public Rectangle rectHaut4;
    public Rectangle rectHaut5;
    public Rectangle rectHaut6;
    public Rectangle rectHaut7;
    public Rectangle rectHaut8;
    public Rectangle rectHaut9;
    public Rectangle rectHaut10;
    public Rectangle rectHaut11;
    public Rectangle rectHaut12;
    @FXML
    public Rectangle rectMilieu1;
    public Rectangle rectMilieu2;
    public Rectangle rectMilieu3;
    public Rectangle rectMilieu4;
    public Rectangle rectMilieu5;
    public Rectangle rectMilieu6;
    public Rectangle rectMilieu7;
    public Rectangle rectMilieu8;
    public Rectangle rectMilieu9;
    public Rectangle rectMilieu10;
    public Rectangle rectMilieu11;
    public Rectangle rectMilieu12;
    @FXML
    public Rectangle rectDroite1;
    public Rectangle rectDroite2;
    public Rectangle rectDroite3;
    public Rectangle rectDroite4;
    public Rectangle rectDroite5;
    public Rectangle rectDroite6;
    public Rectangle rectDroite7;
    public Rectangle rectDroite8;
    public Rectangle rectDroite9;
    public Rectangle rectDroite10;
    public Rectangle rectDroite11;
    public Rectangle rectDroite12;
    @FXML
    public Rectangle rectGauche1;
    public Rectangle rectGauche2;
    public Rectangle rectGauche3;
    public Rectangle rectGauche4;
    public Rectangle rectGauche5;
    public Rectangle rectGauche6;
    public Rectangle rectGauche7;
    public Rectangle rectGauche8;
    public Rectangle rectGauche9;
    public Rectangle rectGauche10;
    public Rectangle rectGauche11;
    public Rectangle rectGauche12;

    // Tous les emplacements des pions
    @FXML
    public Rectangle pion00;
    @FXML
    public Rectangle pion01;
    @FXML
    public Rectangle pion02;
    @FXML
    public Rectangle pion03;
    @FXML
    public Rectangle pion10;
    @FXML
    public Rectangle pion11;
    @FXML
    public Rectangle pion12;
    @FXML
    public Rectangle pion13;
    @FXML
    public Rectangle pion20;
    @FXML
    public Rectangle pion21;
    @FXML
    public Rectangle pion22;
    @FXML
    public Rectangle pion23;
    @FXML
    public Rectangle pion30;
    @FXML
    public Rectangle pion31;
    @FXML
    public Rectangle pion32;
    @FXML
    public Rectangle pion33;

    @FXML
    TextField TextFieldselectX;
    @FXML
    TextField TextFieldselectY;


    @FXML
    private Label texteError;
/*
    FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
    Parent root = loader.load();
    HelloController recuperationNbJoueur = loader.getController();
                recuperationNbJoueur.getPlayerchoice()
*/


    public int x = -1;
    public int y = -1;

    public String nx;
    public String ny;
    public int newX;
    public int newY;

    public int nbCardEmpty = 0;


    public List<Rectangle> listePions;


    public List<Card> listePaquetCartes;

    public List<Player> players;

    public int ptj1=0;
    public int ptj2=0;
    public int d = 48;
    @FXML
    public Label labelBougerLePion;
    @FXML
    public CheckBox checkBoxJ1;
    @FXML
    public CheckBox checkBoxJ2;
    @FXML
    public Text textBoxJ2;
    @FXML
    public Label labelNbJ1;
    @FXML
    public Label labelNbJ2;
    @FXML
    public Label countDeck;
    @FXML
    public Text textQuiJoue;




    private final Color[] old_colors = {
            Color.TRANSPARENT,
            Color.DODGERBLUE,
            Color.RED,
            Color.YELLOW,
            Color.GREEN
    };
    private final List<Color> colors = Arrays.asList(old_colors);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }



    public void fillRectangle(Card card, Rectangle rectHaut, Rectangle rectMilieu, Rectangle rectDroite, Rectangle rectGauche) {

        int[][] matrix = card.getMatrix();
        int a = matrix[0][1];
        int b = matrix[1][1];
        int c = matrix[2][0];
        int d = matrix[2][2];
        rectHaut.setFill(colors.get(a));
        rectMilieu.setFill(colors.get(b));
        rectGauche.setFill(colors.get(c));
        rectDroite.setFill(colors.get(d));
    }

    public Rectangle[] getRectangles(int index) {
        if (index == 0) {
            Rectangle[] rects = {rectHaut1, rectMilieu1, rectDroite1, rectGauche1};
            return rects;
        }
        if (index == 1) {
            Rectangle[] rects = {rectHaut2, rectMilieu2, rectDroite2, rectGauche2};
            return rects;
        }
        if (index == 2) {
            Rectangle[] rects = {rectHaut3, rectMilieu3, rectDroite3, rectGauche3};
            return rects;
        }
        if (index == 3) {
            Rectangle[] rects = {rectHaut4, rectMilieu4, rectDroite4, rectGauche4};
            return rects;
        }
        if (index == 4) {
            Rectangle[] rects = {rectHaut5, rectMilieu5, rectDroite5, rectGauche5};
            return rects;
        }
        if (index == 5) {
            Rectangle[] rects = {rectHaut6, rectMilieu6, rectDroite6, rectGauche6};
            return rects;
        }
        if (index == 6) {
            Rectangle[] rects = {rectHaut7, rectMilieu7, rectDroite7, rectGauche7};
            return rects;
        }
        if (index == 7) {
            Rectangle[] rects = {rectHaut8, rectMilieu8, rectDroite8, rectGauche8};
            return rects;
        }
        if (index == 8) {
            Rectangle[] rects = {rectHaut9, rectMilieu9, rectDroite9, rectGauche9};
            return rects;
        }
        if (index == 9) {
            Rectangle[] rects = {rectHaut10, rectMilieu10, rectDroite10, rectGauche10};
            return rects;
        }
        if (index == 10) {
            Rectangle[] rects = {rectHaut11, rectMilieu11, rectDroite11, rectGauche11};
            return rects;
        }
        Rectangle[] rects = {rectHaut12, rectMilieu12, rectDroite12, rectGauche12};
        return rects;

    }

    public void fillColor(Game game) {
        players = game.getPlayers();
        if (players.size() == 1) {
            checkBoxJ1.setSelected(true);
            textQuiJoue.setVisible(false);
            checkBoxJ1.setVisible(false);
            checkBoxJ2.setVisible(false);
            labelNbJ2.setVisible(false);
            textBoxJ2.setVisible(false);
        }
        labelNbJ1.setText("(" + ptj1 + ") pts" );
        labelNbJ2.setText("(" + ptj2 + ") pts" );
        List<Card> cards = game.getCards();
        Card card1 = cards.get(0);
        Card card2 = cards.get(1);
        Card card3 = cards.get(2);
        Card card4 = cards.get(3);
        Card card5 = cards.get(4);
        Card card6 = cards.get(5);
        Card card7 = cards.get(6);
        Card card8 = cards.get(7);
        Card card9 = cards.get(8);
        Card card10 = cards.get(9);
        Card card11 = cards.get(10);
        Card card12 = cards.get(11);

        fillRectangle(card1, rectHaut1, rectMilieu1, rectDroite1, rectGauche1);
        fillRectangle(card2, rectHaut2, rectMilieu2, rectDroite2, rectGauche2);
        fillRectangle(card3, rectHaut3, rectMilieu3, rectDroite3, rectGauche3);
        fillRectangle(card4, rectHaut4, rectMilieu4, rectDroite4, rectGauche4);
        fillRectangle(card5, rectHaut5, rectMilieu5, rectDroite5, rectGauche5);
        fillRectangle(card6, rectHaut6, rectMilieu6, rectDroite6, rectGauche6);
        fillRectangle(card7, rectHaut7, rectMilieu7, rectDroite7, rectGauche7);
        fillRectangle(card8, rectHaut8, rectMilieu8, rectDroite8, rectGauche8);
        fillRectangle(card9, rectHaut9, rectMilieu9, rectDroite9, rectGauche9);
        fillRectangle(card10, rectHaut10, rectMilieu10, rectDroite10, rectGauche10);
        fillRectangle(card11, rectHaut11, rectMilieu11, rectDroite11, rectGauche11);
        fillRectangle(card12, rectHaut12, rectMilieu12, rectDroite12, rectGauche12);

        listePaquetCartes = cards;

        Rectangle t[] = new Rectangle[]{pion00, pion01, pion02, pion03, pion10, pion11, pion12, pion13, pion20, pion21, pion22, pion23, pion30, pion31, pion32, pion33};
        listePions = Arrays.asList(t);

        //initialisation des couleurs de pions

        pion00.setFill(colors.get(0));
        pion03.setFill(colors.get(0));
        pion30.setFill(colors.get(0));
        pion33.setFill(colors.get(0));
        pion11.setFill(colors.get(0));
        pion12.setFill(colors.get(0));
        pion21.setFill(colors.get(0));
        pion22.setFill(colors.get(0));
        pion01.setFill(colors.get(4));
        pion02.setFill(colors.get(4));
        pion13.setFill(colors.get(3));
        pion23.setFill(colors.get(3));
        pion31.setFill(colors.get(2));
        pion32.setFill(colors.get(2));
        pion10.setFill(colors.get(1));
        pion20.setFill(colors.get(1));

    }

    public void clickedRectangle00() {
        x = 0;
        y = 0;
    }


    public void clickedRectangle01() {
        x = 0;
        y = 1;
    }

    public void clickedRectangle02() {
        x = 0;
        y = 2;
    }

    public void clickedRectangle03() {
        x = 0;
        y = 3;
    }

    public void clickedRectangle10() {
        x = 1;
        y = 0;
    }

    public void clickedRectangle11() {
        x = 1;
        y = 1;
    }

    public void clickedRectangle12() {
        x = 1;
        y = 2;
    }

    public void clickedRectangle13() {
        x = 1;
        y = 3;
    }

    public void clickedRectangle20() {
        x = 2;
        y = 0;
    }

    public void clickedRectangle21() {
        x = 2;
        y = 1;
    }

    public void clickedRectangle22() {
        x = 2;
        y = 2;
    }

    public void clickedRectangle23() {
        x = 2;
        y = 3;
    }

    public void clickedRectangle30() {
        x = 3;
        y = 0;
    }

    public void clickedRectangle31() {
        x = 3;
        y = 1;
    }

    public void clickedRectangle32() {
        x = 3;
        y = 2;
    }

    public void clickedRectangle33() {
        x = 3;
        y = 3;
    }


    public void changePosition() {


        texteError.setText("         ");
    //    labelBougerLePion.setText("Quel joueur vient de remporter une carte ?");


        nx = TextFieldselectX.getText();
        ny = TextFieldselectY.getText();
        try {
            newX = Integer.parseInt(nx); //convertir string en integer
            newY = Integer.parseInt(ny);
        } catch (NumberFormatException ex) {

            texteError.setText("Remplissez x et y entre 0 et 3");
            texteError.setTextFill(Color.RED);
            x = -1;
            y = -1;
            return;
        }
        if (x == -1 || y == -1) {
            texteError.setText("Cliquez sur un pion à déplacer");
            texteError.setTextFill(Color.RED);
            return;
        }

        if (!checkBoxJ2.isSelected() && !checkBoxJ1.isSelected() || checkBoxJ2.isSelected() && checkBoxJ1.isSelected()){
            texteError.setText("   Choisissez un joueur !");
            texteError.setTextFill(Color.RED);
            x = -1;
            y = -1;
            return;
        }

        if (newX > 3 || newY > 3 || newY < 0 || newX < 0) {
            x = -1;
            y = -1;
            texteError.setText("Le x et le y doivent être entre 0 et 3");
            texteError.setTextFill(Color.RED);
            return;
        }
        int indexAncienPion = x * 4 + y;
        int indexNouveauPion = newX * 4 + newY;


        Rectangle ancienPion = listePions.get(indexAncienPion);

        Rectangle nouveauPion = listePions.get(indexNouveauPion);

        Color colorAncienPion = (Color) ancienPion.getFill();

        if (listePions.get(indexNouveauPion).getFill() != Color.TRANSPARENT) {
            texteError.setText("Choisissez un emplacement libre !");
            texteError.setTextFill(Color.RED);
            this.x = -1;
            y = -1;
            return;
        }
        ancienPion.setFill(colors.get(0));
        nouveauPion.setFill(colorAncienPion);
        x = -1;
        y = -1;



        List<Card> dispositionsPossiblesCartes =  createPossibleDisposition();

        boolean isFound = false;
        for ( int i = 0 ; i < dispositionsPossiblesCartes.size() && isFound == false; i++) {
            Card c = dispositionsPossiblesCartes.get(i);
            for ( int j = 0 ; j < 12 && isFound == false; j++) {

                 if (c.equals(listePaquetCartes.get(j))) {

                     isFound = true;


                    int[][] mEmpty = new int[3][3];
                    Card nextCard = new Card(mEmpty);
                    if (listePaquetCartes.size() > 12) {
                        nextCard = listePaquetCartes.get(12);
                    }
                    else {
                        nbCardEmpty++;
                    }

                    Rectangle[] nextRectangle = getRectangles(j);

                    fillRectangle(nextCard, nextRectangle[0], nextRectangle[1], nextRectangle[2], nextRectangle[3]);


                    listePaquetCartes.set(j, nextCard);
                     if (listePaquetCartes.size() > 12) {
                         listePaquetCartes.remove(12);
                         d--;
                         countDeck.setText(""+d);            // Mise à jour nb de cartes restantes
                     }

                     if (checkBoxJ1.isSelected() ){
                         ptj1 = ptj1 + 1;
                     }
                     else if (checkBoxJ2.isSelected()){
                         ptj2 = ptj2 + 1;
                     }
                     labelNbJ1.setText("(" + ptj1 + ") pts" );
                     labelNbJ2.setText("(" + ptj2 + ") pts" );
                 }
            }
        }
        if (isFound == false && players.size() == 2){
            texteError.setText("Deux deplacements pour le suivant");
        }
        if (nbCardEmpty == 12 && ptj1>ptj2) {
            texteError.setText("J1 remporte la partie !");
        }

        if (nbCardEmpty == 12 && ptj1<ptj2) {
            texteError.setText("J2 remporte la partie !");
        }

        if (players.size() == 2) {
            checkBoxJ1.setSelected(false);
            checkBoxJ2.setSelected(false);
        }
    }


    public int getNumberColorInRectangle(int x, int y) {
        Rectangle rect = listePions.get(x * 4 + y);
        Color colorPion = (Color) rect.getFill();
        int color = colors.indexOf(colorPion);
        return color;
    }

    public List<Card> createPossibleDisposition() {
        List<Card> dispositionPossible = new ArrayList<>();

        if ((newX == 2 || newX == 3) && (newY == 1 || newY == 2 || newY == 3)) {    // pour X bas droite   // REVU
            int[][] dispositionPossible1 = new int[3][3];
            dispositionPossible1[0][1] = getNumberColorInRectangle(newX - 2, newY - 1);
            dispositionPossible1[1][1] = getNumberColorInRectangle(newX - 1, newY - 1);
            dispositionPossible1[2][2] = getNumberColorInRectangle(newX, newY);
            Card cardPossible1 = new Card(dispositionPossible1);
            dispositionPossible.add(cardPossible1);


            dispositionPossible1 = new int[3][3];
            dispositionPossible1[0][1] = getNumberColorInRectangle(newX, newY);
            dispositionPossible1[1][1] = getNumberColorInRectangle(newX - 1, newY);
            dispositionPossible1[2][2] = getNumberColorInRectangle(newX - 2, newY - 1);
            cardPossible1 = new Card(dispositionPossible1);
            dispositionPossible.add(cardPossible1);
        }

        if ((newX == 2 || newX == 3) && (newY == 0 || newY == 1 || newY == 2)) {     //Pour X bas gauche // col 0 à gauche  // REVU
            int[][] dispositionPossible1 = new int[3][3];
            dispositionPossible1[2][0] = getNumberColorInRectangle(newX, newY);
            dispositionPossible1[1][1] = getNumberColorInRectangle(newX - 1, newY+1);
            dispositionPossible1[0][1] = getNumberColorInRectangle(newX - 2, newY + 1);
            Card cardPossible1 = new Card(dispositionPossible1);
            dispositionPossible.add(cardPossible1);

            dispositionPossible1 = new int[3][3];                  // col 0 à droite

            dispositionPossible1[0][1] = getNumberColorInRectangle(newX, newY);
            dispositionPossible1[1][1] = getNumberColorInRectangle(newX - 1, newY);
            dispositionPossible1[2][0] = getNumberColorInRectangle(newX - 2, newY + 1);
            cardPossible1 = new Card(dispositionPossible1);
            dispositionPossible.add(cardPossible1);

        }

        if ((newX == 1 || newX == 2) && (newY == 1 || newY == 2 || newY == 3)) {    // pour X milieu droite // col 0 à gauche  // REVU
            int[][] dispositionPossible1 = new int[3][3];
            dispositionPossible1[1][1] = getNumberColorInRectangle(newX, newY);
            dispositionPossible1[0][1] = getNumberColorInRectangle(newX - 1, newY);
            dispositionPossible1[2][0] = getNumberColorInRectangle(newX + 1, newY - 1);
            Card cardPossible1 = new Card(dispositionPossible1);
            dispositionPossible.add(cardPossible1);

            dispositionPossible1 = new int[3][3];                  // col 0 à droite

            dispositionPossible1[1][1] = getNumberColorInRectangle(newX, newY);
            dispositionPossible1[0][1] = getNumberColorInRectangle(newX + 1, newY);
            dispositionPossible1[2][2] = getNumberColorInRectangle(newX - 1, newY - 1);
            cardPossible1 = new Card(dispositionPossible1);
            dispositionPossible.add(cardPossible1);

        }


        if ((newX == 1 || newX == 2) && (newY == 0 || newY == 1 || newY == 2)) {    // pour X milieu gauche // col 0 à gauche  //REVU
            int[][] dispositionPossible1 = new int[3][3];
            dispositionPossible1[1][1] = getNumberColorInRectangle(newX, newY);
            dispositionPossible1[0][1] = getNumberColorInRectangle(newX - 1, newY);
            dispositionPossible1[2][2] = getNumberColorInRectangle(newX + 1, newY + 1);
            Card cardPossible1 = new Card(dispositionPossible1);
            dispositionPossible.add(cardPossible1);

            dispositionPossible1 = new int[3][3];                  // col 0 à droite

            dispositionPossible1[1][1] = getNumberColorInRectangle(newX, newY);
            dispositionPossible1[0][1] = getNumberColorInRectangle(newX + 1, newY);
            dispositionPossible1[2][0] = getNumberColorInRectangle(newX - 1, newY + 1);
            cardPossible1 = new Card(dispositionPossible1);
            dispositionPossible.add(cardPossible1);

        }

        if ((newX == 0 || newX == 1) && (newY == 1 || newY == 2 || newY == 3)) {    // pour X haut droite // col 0 à gauche  //REVU
            int[][] dispositionPossible1 = new int[3][3];

            dispositionPossible1[0][1] = getNumberColorInRectangle(newX, newY);
            dispositionPossible1[1][1] = getNumberColorInRectangle(newX + 1, newY);
            dispositionPossible1[2][0] = getNumberColorInRectangle(newX + 2, newY-1);
            Card cardPossible1 = new Card(dispositionPossible1);
            dispositionPossible.add(cardPossible1);

            dispositionPossible1 = new int[3][3];                  // col 0 à droite

            dispositionPossible1[2][0] = getNumberColorInRectangle(newX, newY);
            dispositionPossible1[1][1] = getNumberColorInRectangle(newX + 1, newY-1);
            dispositionPossible1[0][1] = getNumberColorInRectangle(newX +2, newY -1);
            cardPossible1 = new Card(dispositionPossible1);
            dispositionPossible.add(cardPossible1);

        }


        if ((newX == 0 || newX == 1) && (newY == 0 || newY == 1 || newY == 2)) {    // pour X haut gauche // col 0 à gauche  //REVU
            int[][] dispositionPossible1 = new int[3][3];

            dispositionPossible1[0][1] = getNumberColorInRectangle(newX, newY);
            dispositionPossible1[1][1] = getNumberColorInRectangle(newX + 1, newY);
            dispositionPossible1[2][2] = getNumberColorInRectangle(newX + 2, newY+1);
            Card cardPossible1 = new Card(dispositionPossible1);
            dispositionPossible.add(cardPossible1);

            dispositionPossible1 = new int[3][3];                  // col 0 à droite

            dispositionPossible1[2][2] = getNumberColorInRectangle(newX, newY);
            dispositionPossible1[1][1] = getNumberColorInRectangle(newX + 1, newY+1);
            dispositionPossible1[0][1] = getNumberColorInRectangle(newX +2, newY + 1);
            cardPossible1 = new Card(dispositionPossible1);
            dispositionPossible.add(cardPossible1);

        }

        if ((newX == 1 || newX == 2 || newX == 3) && ( newY == 0 || newY == 1)) {    // pour horiz X bas gauche   // REVU
            int[][] dispositionPossible1 = new int[3][3];

            dispositionPossible1[0][1] = getNumberColorInRectangle(newX, newY);
            dispositionPossible1[1][1] = getNumberColorInRectangle(newX, newY+1);
            dispositionPossible1[2][2] = getNumberColorInRectangle(newX -1, newY+2);
            Card cardPossible1 = new Card(dispositionPossible1);
            dispositionPossible.add(cardPossible1);

            dispositionPossible1 = new int[3][3];                  // col 0 à droite

            dispositionPossible1[2][2] = getNumberColorInRectangle(newX, newY);
            dispositionPossible1[1][1] = getNumberColorInRectangle(newX - 1, newY+1);
            dispositionPossible1[0][1] = getNumberColorInRectangle(newX -1, newY +2);
            cardPossible1 = new Card(dispositionPossible1);
            dispositionPossible.add(cardPossible1);

        }

        if ((newX == 1 || newX == 2|| newX == 3) && (newY == 2 || newY == 3)) {    // pour horiz X bas droite //OKK
            int[][] dispositionPossible1 = new int[3][3];

            dispositionPossible1[2][0] = getNumberColorInRectangle(newX, newY);
            dispositionPossible1[1][1] = getNumberColorInRectangle(newX - 1, newY-1);
            dispositionPossible1[0][1] = getNumberColorInRectangle(newX -1, newY-2);
            Card cardPossible1 = new Card(dispositionPossible1);
            dispositionPossible.add(cardPossible1);

            dispositionPossible1 = new int[3][3];                  // col 0 à droite

            dispositionPossible1[2][0] = getNumberColorInRectangle(newX - 1, newY - 2);
            dispositionPossible1[1][1] = getNumberColorInRectangle(newX, newY-1);
            dispositionPossible1[0][1] = getNumberColorInRectangle(newX, newY);
            cardPossible1 = new Card(dispositionPossible1);
            dispositionPossible.add(cardPossible1);

        }

        if ((newX == 0 || newX == 1 || newX == 2) && (newY == 1 || newY == 2 )) {    // pour horiz X  milieu haut  //OKK
            int[][] dispositionPossible1 = new int[3][3];

            dispositionPossible1[1][1] = getNumberColorInRectangle(newX, newY);
            dispositionPossible1[0][1] = getNumberColorInRectangle(newX, newY-1);
            dispositionPossible1[2][0] = getNumberColorInRectangle(newX +1, newY+1);
            Card cardPossible1 = new Card(dispositionPossible1);
            dispositionPossible.add(cardPossible1);

            dispositionPossible1 = new int[3][3];

            dispositionPossible1[1][1] = getNumberColorInRectangle(newX, newY);
            dispositionPossible1[0][1] = getNumberColorInRectangle(newX , newY+1);
            dispositionPossible1[2][2] = getNumberColorInRectangle(newX +1, newY - 1);
            cardPossible1 = new Card(dispositionPossible1);
            dispositionPossible.add(cardPossible1);

        }

        if ((newX == 1 || newX == 2 || newX == 3) && (newY == 1 || newY == 2)) {    // pour horiz X  milieu bas //REVU
            int[][] dispositionPossible1 = new int[3][3];

            dispositionPossible1[1][1] = getNumberColorInRectangle(newX, newY);
            dispositionPossible1[0][1] = getNumberColorInRectangle(newX , newY-1);
            dispositionPossible1[2][2] = getNumberColorInRectangle(newX -1, newY+1);
            Card cardPossible1 = new Card(dispositionPossible1);
            dispositionPossible.add(cardPossible1);

            dispositionPossible1 = new int[3][3];

            dispositionPossible1[1][1] = getNumberColorInRectangle(newX, newY);
            dispositionPossible1[0][1] = getNumberColorInRectangle(newX , newY+1);
            dispositionPossible1[2][0] = getNumberColorInRectangle(newX -1, newY - 1);
            cardPossible1 = new Card(dispositionPossible1);
            dispositionPossible.add(cardPossible1);

        }

        if ((newX == 0 || newX == 1 || newX == 2) && (newY == 0 || newY == 1 )) {    // pour horiz X  haut gauche  //REVU IF
            int[][] dispositionPossible1 = new int[3][3];

            dispositionPossible1[0][1] = getNumberColorInRectangle(newX, newY);
            dispositionPossible1[1][1] = getNumberColorInRectangle(newX , newY+1);
            dispositionPossible1[2][0] = getNumberColorInRectangle(newX +1, newY+2);
            Card cardPossible1 = new Card(dispositionPossible1);
            dispositionPossible.add(cardPossible1);

            dispositionPossible1 = new int[3][3];

            dispositionPossible1[2][0] = getNumberColorInRectangle(newX, newY);
            dispositionPossible1[0][1] = getNumberColorInRectangle(newX +1, newY+2);
            dispositionPossible1[1][1] = getNumberColorInRectangle(newX +1, newY +1);
            cardPossible1 = new Card(dispositionPossible1);
            dispositionPossible.add(cardPossible1);

        }


        if ((newX == 0 || newX == 1 || newX == 2) && (newY == 2 || newY == 3)) {    // pour horiz X  haut droite  //OKK
            int[][] dispositionPossible1 = new int[3][3];

            dispositionPossible1[2][2] = getNumberColorInRectangle(newX, newY);
            dispositionPossible1[1][1] = getNumberColorInRectangle(newX +1, newY-1);
            dispositionPossible1[0][1] = getNumberColorInRectangle(newX +1, newY-2);
            Card cardPossible1 = new Card(dispositionPossible1);
            dispositionPossible.add(cardPossible1);

            dispositionPossible1 = new int[3][3];

            dispositionPossible1[0][1] = getNumberColorInRectangle(newX, newY);
            dispositionPossible1[1][1] = getNumberColorInRectangle(newX, newY-1);
            dispositionPossible1[2][2] = getNumberColorInRectangle(newX +1, newY -2);
            cardPossible1 = new Card(dispositionPossible1);
            dispositionPossible.add(cardPossible1);

        }
        return dispositionPossible;


    }




}





















