package hsdrinkinggame;

import javafx.application.Application;
import java.util.ArrayList;
import java.util.Collections;
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
import javafx.scene.control.ComboBox;
import javafx.beans.value.ChangeListener;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ToggleButton;
import java.awt.*;
import java.awt.event.*;
import static javafx.application.Application.launch;
import javafx.collections.ObservableList;
import javafx.stage.Popup;
import javafx.scene.image.ImageView;
import javafx.beans.binding.Bindings;
public class HSDrinkingGame extends Application {
    private int players;
    private int index;
    private ArrayList<Player> playerlist = new ArrayList<Player>();
    private ArrayList<Space> board = new ArrayList<Space>();
    private Scene scene;
    private Stage ikkuna3;
    private Stage ikkuna4;
    private Hero hero;
    private Token token;
    private Token tokenData;
    private Token redTokenP = new Token(new Image("file:redtoken.png"));
    private Token blueTokenP = new Token(new Image("file:bluetoken.png"));
    private Token greenTokenP = new Token(new Image("file:greentoken.png"));
    private Token yellowTokenP = new Token(new Image("file:yellowtoken.png"));
    @Override
    public void start(Stage ikkuna) {
        ArrayList<Player> playerlist2 = playerlist;
        
        Space space1 = new Space("Test", "Test");
        Space space2 = new Space("Test", "Test");
        Space space3 = new Space("Test", "Test");
        Space space4 = new Space("Test", "Test");
        Space space5 = new Space("Test", "Test");
        Space space6 = new Space("Test", "Test");
        Space space7 = new Space("Test", "Test");
        Space space8 = new Space("Test", "Test");
        Space space9 = new Space("Test", "Test");
        Space space10 = new Space("Test", "Test");
        Space space11 = new Space("Test", "Test");
        Space space12 = new Space("Test", "Test");
        Space space13 = new Space("Test", "Test");
        Space space14 = new Space("Test", "Test");
        Space space15 = new Space("Test", "Test");
        Space space16 = new Space("Test", "Test");
        Space space17 = new Space("Test", "Test");
        Space space18 = new Space("Test", "Test");
        Space space19 = new Space("Test", "Test");
        Space space20 = new Space("Test", "Test");
        Space space21 = new Space("Test", "Test");
        Space space22 = new Space("Test", "Test");
        Space space23 = new Space("Test", "Test");
        Space space24 = new Space("Test", "Test");
        Space space25 = new Space("Test", "Test");
        Space space26 = new Space("Test", "Test");
        Space space27 = new Space("Test", "Test");
        Space space28 = new Space("Test", "Test");
        Space space29 = new Space("Test", "Test");
        Space space30 = new Space("Test", "Test");
        Space space31 = new Space("Test", "Test");
        Space space32 = new Space("Test", "Test");
        Space space33 = new Space("Test", "Test");
        Space space34 = new Space("Test", "Test");
        Space space35 = new Space("Test", "Test");
        Space space36 = new Space("Test", "Test");
        Space space37 = new Space("Test", "Test");
        Space space38 = new Space("Test", "Test");
        Space space39 = new Space("Test", "Test");
        Space space40 = new Space("Test", "Test");
        Space space41 = new Space("Test", "Test");
        Space space42 = new Space("Test", "Test");
        Space space43 = new Space("Test", "Test");
        Space space44 = new Space("Test", "Test");
        Space space45 = new Space("Test", "Test");
        Space space46 = new Space("Test", "Test");
        Space space47 = new Space("Test", "Test");
        Space space48 = new Space("Test", "Test");
        Space space49 = new Space("Test", "Test");
        Space space50 = new Space("Test", "Test");
        Space space51 = new Space("Test", "Test");
        Space space52 = new Space("Test", "Test");
        Space space53 = new Space("Test", "Test");
        Space space54 = new Space("Test", "Test");
        Space space55 = new Space("Test", "Test");
        Space space56 = new Space("Test", "Test");
        Space space57 = new Space("Test", "Test");
        Space space58 = new Space("Test", "Test");
        Space space59 = new Space("Test", "Test");
        Space space60 = new Space("Test", "Test");
        Space space61 = new Space("Test", "Test");
        Space space62 = new Space("Test", "Test");
        Space space63 = new Space("Test", "Test");
        Space space64 = new Space("Test", "Test");
        Space space65 = new Space("Test", "Test");
        Space space66 = new Space("Test", "Test");
        Space space67 = new Space("Test", "Test");
        Space space68 = new Space("Test", "Test");
        Space space69 = new Space("Test", "Test");
        Space space70 = new Space("Test", "Test");
        Space space71 = new Space("Test", "Test");
        Space space72 = new Space("Test", "Test");
        Space space73 = new Space("Test", "Test");
        Space space74 = new Space("Test", "Test");
        Space space75 = new Space("Test", "Test");
        Space space76 = new Space("Test", "Test");
        Space space77 = new Space("Test", "Test");
        Space space78 = new Space("Test", "Test");
        Space space79  = new Space("Test", "Test");
        Space space80 = new Space("Test", "Test");
        Collections.addAll(board, space1, space2, space3, space4, space5, space6, space7, space8, space9, space10, space11, space12, space13, space14, space15, space16, space17, space18, space19, space20, space21, space22, space23, space24, space25, space26, space27, space28, space29, space30, space31, space32, space33, space34, space35, space36, space37, space38, space39, space40, space41, space42, space43, space44, space45, space46, space47, space48, space49, space50, space51, space52, space53, space54, space55, space56, space57, space58, space59, space60, space61, space62, space63, space64, space65, space66, space67, space68, space69, space70, space71, space72, space73, space74, space75, space76, space77, space78, space79, space80);
        
        
        ikkuna3 = ikkuna;
        scene = new Scene(mainMenuPane());
        ikkuna.getIcons().add(new Image("file:icon.png"));
        ikkuna.setTitle("HS Drinking Game");
        ikkuna.setScene(scene);
        ikkuna.show();
    }
    
    public Stage tokenSelectStage() {
        Scene scenne = new Scene(StartOfGamePane());
        Stage ikkuna = new Stage();
        ikkuna4 = ikkuna;
        ikkuna.setScene(scenne);
        scenne.setRoot(tokenSelect());
        ikkuna.show();
        return ikkuna;
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

        ToggleGroup heroes = new ToggleGroup();
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
        if (index == players) {
            next.setText("Start the game!");
        }
        PlayersPane.setTop(next);
        next.setAlignment(Pos.TOP_RIGHT);
        Button back = new Button("Back");
        PlayersPane.setBottom(back);
        Button tokenSelect = new Button("Select Your Token");
        tokenSelect.setAlignment(Pos.CENTER_RIGHT);
        PlayersPane.setRight(tokenSelect);
        
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
                  if (!(playerName.getText().isEmpty()) && hero != null && token != null) { // katsoo onko tekstikentässä numeroita
                      
                      if (index == players) {
                          scene.setRoot(PlayerRollPane());
                      } else {
                        index++;
                        Player player = new Player(playerName.getText(), token, hero);
                        playerlist.add(player);
                        hero = null;
                        token = null;
                        scene.setRoot(PlayersPane());
                    } // tähän vois kehittää error pop-upin jossain vaiheessa
                  }
                  
            }
        });
        tokenSelect.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t) {
                popup().show(tokenSelectStage());
            }
        });
        return PlayersPane;
    };
    public Popup popup() {
        Popup popup = new Popup();
        return popup;
    }
    public GridPane tokenSelect() {
        GridPane pane = new GridPane();
        pane.setPrefSize(500,500);
        ToggleGroup tokens = new ToggleGroup();
        ToggleButton red = new ToggleButton();
        final Image redToken = new Image("file:redtoken.png");
        final ImageView toggleImage = new ImageView();
        final ImageView toggleImage2 = new ImageView();
        final ImageView toggleImage3 = new ImageView();
        final ImageView toggleImage4 = new ImageView();
        red.setGraphic(toggleImage);
        toggleImage.imageProperty().bind(Bindings
           .when(red.selectedProperty())
                .then(redToken)
                .otherwise(redToken)
        );
        ToggleButton blue = new ToggleButton();
        final Image blueToken = new Image("file:bluetoken.png");
        blue.setGraphic(toggleImage2);
        toggleImage2.imageProperty().bind(Bindings
           .when(blue.selectedProperty())
                .then(blueToken)
                .otherwise(blueToken)
        );
        ToggleButton green = new ToggleButton();
        final Image greenToken = new Image("file:greentoken.png");
        green.setGraphic(toggleImage3);
        toggleImage3.imageProperty().bind(Bindings
           .when(green.selectedProperty())
                .then(greenToken)
                .otherwise(greenToken)
        );
        ToggleButton yellow = new ToggleButton();
        final Image yellowToken = new Image("file:yellowtoken.png");
        yellow.setGraphic(toggleImage4);
        toggleImage4.imageProperty().bind(Bindings
           .when(yellow.selectedProperty())
                .then(yellowToken)
                .otherwise(yellowToken)
        );
        red.setToggleGroup(tokens);
        blue.setToggleGroup(tokens);
        green.setToggleGroup(tokens);
        yellow.setToggleGroup(tokens);
        Button ok = new Button("OK");
        pane.add(ok, 0, 0);
        pane.add(red, 2, 0);
        pane.add(blue, 2, 1);
        pane.add(green, 3, 0);
        pane.add(yellow, 3, 1);
        red.setMaxWidth(100);
        red.setMaxHeight(100);
        blue.setMaxWidth(100);
        blue.setMaxHeight(100);
        green.setMaxWidth(100);
        green.setMaxHeight(100);
        yellow.setMaxWidth(100);
        yellow.setMaxHeight(100);
        red.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
                tokenData = redTokenP;
            }
        });
        blue.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
                tokenData = blueTokenP;
            }
        });
        green.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
                tokenData = greenTokenP;
            }
        });
        yellow.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
                tokenData = yellowTokenP;
            }
        });
        ok.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
                  if (tokenData != null) {
                      token = tokenData;
                      tokenData = null;
                      ikkuna4.close();
                  }
            }
        });
        return pane;
    }
    public BorderPane PlayerRollPane() { // kehitä tähän jossain vaiheessa vaihtoehto sille että pelaajat heittää noppaa ja suurimman luvun saanut aloittaa jne
        Image image = new Image("file:background.jpg");
        BackgroundSize backgroundSize = new BackgroundSize(1000, 1000, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        BorderPane PlayerRollPane = new BorderPane();
        PlayerRollPane.setBackground(new Background(backgroundImage));
        VBox valikko = new VBox();
        Label label = new Label("Randomized order or set order? (from first player to last player)");
        Button random = new Button("Randomized Order");
        Button set = new Button("Set Order");
        valikko.getChildren().addAll(label, random, set);
        valikko.setAlignment(Pos.CENTER);
        PlayerRollPane.setCenter(valikko);
        random.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
                Collections.shuffle(playerlist);
                scene.setRoot(GamePane());
            }
        });
        set.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
                scene.setRoot(GamePane());
            }
        });
        return PlayerRollPane;
    }

    public BorderPane GamePane() {
        Image image = new Image("file:background.jpg");
        BackgroundSize backgroundSize = new BackgroundSize(1000, 1000, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        BorderPane GamePane = new BorderPane();
        GamePane.setBackground(new Background(backgroundImage));
        return GamePane;
    }    
    public static void main(String[] args) {
        launch(HSDrinkingGame.class);
    }
    }
