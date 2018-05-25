package hsdrinkinggame;

import javafx.application.Application;
import java.util.ArrayList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.Background;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.CheckBox;
import javafx.beans.value.ChangeListener;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ToggleButton;
import java.awt.*;
import java.awt.event.*;
import static javafx.application.Application.launch;
import javafx.collections.ObservableList;
import javafx.stage.Popup;
public class HSDrinkingGame extends Application {
    private int players;
    private int index;
    private ArrayList<Player> playerlist = new ArrayList<Player>();
    private Scene scene;
    private Stage ikkuna3;
    private Hero hero;
    @Override
    public void start(Stage ikkuna) {
        ArrayList<Player> playerlist2 = playerlist;
        ikkuna3 = ikkuna;
        scene = new Scene(mainMenuPane());
        ikkuna.getIcons().add(new Image("file:icon.png"));
        ikkuna.setTitle("HS Drinking Game");
        ikkuna.setScene(scene);
        ikkuna.show();
    }
    
    public BorderPane mainMenuPane() {
        Image image = new Image("file:background.jpg");
        BackgroundSize backgroundSize = new BackgroundSize(1000, 1000, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        BorderPane mainMenuPane = new BorderPane();
        mainMenuPane.setPrefSize(1080,720);
        
        VBox valikko = new VBox(); // valikko missä on Start ja Options napit
        valikko.setPrefWidth(500);
        valikko.setPrefHeight(500);
        valikko.setSpacing(10);
        Button start = new Button("Start");
        start.setMaxWidth(valikko.getPrefWidth()); // muuttaa napin leveyttä
        start.setMaxHeight(valikko.getPrefHeight()); // ei toimi jostain syystä toi maxheight
        Button options = new Button("Options");
        options.setMaxWidth(valikko.getPrefWidth());
        options.setMaxHeight(valikko.getPrefHeight());
        Button exit = new Button("Exit");
        exit.setMaxWidth(valikko.getPrefWidth());
        exit.setMaxHeight(valikko.getPrefHeight());        
        valikko.getChildren().addAll(start, options, exit);
        mainMenuPane.setCenter(valikko);
        valikko.setAlignment(Pos.CENTER);
        mainMenuPane.setBackground(new Background(backgroundImage));
        
        options.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
                  scene.setRoot(OptionsPane());
            }
        });
        exit.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
                  System.exit(0);
            }
       });
        start.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
                  scene.setRoot(StartOfGamePane());
            }
        });
        
        return mainMenuPane;
    }
    
    public BorderPane OptionsPane() {
    Image image = new Image("file:background.jpg");
        BackgroundSize backgroundSize = new BackgroundSize(1000, 1000, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
            BorderPane OptionsPane = new BorderPane();
        OptionsPane.setPrefSize(1080,720);

        VBox OptionsValikko = new VBox();
        OptionsValikko.setPrefWidth(500);
        OptionsValikko.setPrefHeight(500);
        OptionsValikko.setSpacing(10);
        Label label = new Label("Fullscreen Mode");
        ToggleGroup fullscreen = new ToggleGroup();
        RadioButton button1 = new RadioButton("On");
        button1.setToggleGroup(fullscreen);
        RadioButton button2 = new RadioButton("Off");
        button2.setToggleGroup(fullscreen);
        button2.setSelected(true);
        OptionsValikko.getChildren().addAll(label, button1, button2);
        Button back = new Button("Back");
        OptionsPane.setCenter(OptionsValikko);
        OptionsPane.setBottom(back);
        OptionsValikko.setAlignment(Pos.CENTER);
        OptionsPane.setBackground(new Background(backgroundImage));
        
        button1.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
                  ikkuna3.setFullScreen(true);
            }
        });
        button2.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
                  ikkuna3.setFullScreen(false);
            }
        });
        back.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
                  scene.setRoot(mainMenuPane());
            }
        });
        
        return OptionsPane;
    }
    
    public BorderPane StartOfGamePane() {
        Image image = new Image("file:background.jpg");
        BackgroundSize backgroundSize = new BackgroundSize(1000, 1000, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        BorderPane StartOfGamePane = new BorderPane();
        
        StartOfGamePane.setBackground(new Background(backgroundImage));
        Button next = new Button("Next");
        StartOfGamePane.setTop(next);
        next.setAlignment(Pos.TOP_RIGHT);
        Button back2 = new Button("Back");
        StartOfGamePane.setBottom(back2);
        VBox HowManyPlayers = new VBox();
        Label label2 = new Label("How many players? (2 minimum)");
        TextField playerAmount = new TextField();
        playerAmount.setMaxWidth(200);
        HowManyPlayers.getChildren().addAll(label2, playerAmount);
        HowManyPlayers.setAlignment(Pos.CENTER);
        StartOfGamePane.setCenter(HowManyPlayers);
        
        back2.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
                  scene.setRoot(mainMenuPane());
            }
        });
        next.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
                  if (playerAmount.getText().matches("\\d+")) { // katsoo onko tekstikentässä numeroita
                      int numberInput = Integer.parseInt(playerAmount.getText());
                      if (numberInput >= 2) {
                      players = Integer.parseInt(playerAmount.getText());
                      index = 1;
                      scene.setRoot(PlayersPane());
                    } // tähän vois kehittää error pop-upin jossain vaiheessa
                  }
                  
            }
        });        
        
        return StartOfGamePane;
    }
    
    public BorderPane PlayersPane() {
        Image image = new Image("file:background.jpg");
        BackgroundSize backgroundSize = new BackgroundSize(1000, 1000, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        BorderPane PlayersPane = new BorderPane();
        PlayersPane.setBackground(new Background(backgroundImage));
        VBox playernamebox = new VBox();
        Label label3 = new Label("Player name: (" + index + "/" + players + ")"); // textproperty ei toimi
        TextField playerName = new TextField();
        Label label4 = new Label("Class: ");
        ToggleButton druid = new ToggleButton("Druid");
        ToggleButton hunter = new ToggleButton("Hunter");
        ToggleButton mage = new ToggleButton("Mage");
        ToggleButton paladin = new ToggleButton("Paladin");
        ToggleButton priest = new ToggleButton("Priest");
        ToggleButton rogue = new ToggleButton("Rogue");
        ToggleButton shaman = new ToggleButton("Shaman");
        ToggleButton warrior = new ToggleButton("Warrior");
        ToggleButton warlock = new ToggleButton("Warlock");

        ToggleGroup heroes = new ToggleGroup(); // vaan kolme heroa atm, lisään kyl kaikki
        heroes.selectToggle(warrior);
        druid.setToggleGroup(heroes);
        hunter.setToggleGroup(heroes);
        mage.setToggleGroup(heroes);
        paladin.setToggleGroup(heroes);
        priest.setToggleGroup(heroes);
        rogue.setToggleGroup(heroes);
        shaman.setToggleGroup(heroes);
        warlock.setToggleGroup(heroes);
        warrior.setToggleGroup(heroes);
        
        playernamebox.getChildren().addAll(label3, playerName, label4, druid, hunter, mage, paladin, priest, rogue, shaman, warrior, warlock);
        playernamebox.setAlignment(Pos.CENTER);
        PlayersPane.setCenter(playernamebox);
        Button next = new Button("Next");
        PlayersPane.setTop(next);
        next.setAlignment(Pos.TOP_RIGHT);
        Button back = new Button("Back");
        PlayersPane.setBottom(back);
        final Token token = new Token("test"); // placeholder kunnes jaksan lisää tokenit oikeasti
        
        warrior.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
                  hero = Hero.Warrior;
            }
        });
        paladin.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
                  hero = Hero.Paladin;
            }
        });
        shaman.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
                  hero = Hero.Shaman;
            }
        });
        druid.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
                  hero = Hero.Druid;
            }
        });
        mage.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
                  hero = Hero.Mage;
            }
        });
        priest.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
                  hero = Hero.Priest;
            }
        });
        warlock.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
                  hero = Hero.Warlock;
            }
        });
        hunter.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
                  hero = Hero.Hunter;
            }
        });
        rogue.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
                  hero = Hero.Rogue;
            }
        });
        back.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
                if (index == 1) {
                  scene.setRoot(StartOfGamePane());
                };
                if (index > 1) {
                    index--;
                    playerlist.remove(index-1);
                    scene.setRoot(PlayersPane());
                }
            }   
        });
        next.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
                  if (!(playerName.getText().isEmpty())) { // katsoo onko tekstikentässä numeroita
                      
                      if (index == players) {
                          scene.setRoot(mainMenuPane());
                      } else {
                        index++;
                        Player player = new Player(playerName.getText(), token, hero);
                        playerlist.add(player);
                        scene.setRoot(PlayersPane());
                    } // tähän vois kehittää error pop-upin jossain vaiheessa
                  }
                  
            }
        });   
        return PlayersPane;
    };
    public static void main(String[] args) {
        launch(HSDrinkingGame.class);
    }
    }
