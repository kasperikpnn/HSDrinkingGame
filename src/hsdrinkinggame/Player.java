package hsdrinkinggame;

public class Player {
    private String name;
    private Token token;
    private Hero hero;
    private int location;
    private int drinkCount;
    private int giveCount;
    private int armor;
    private boolean isKing;
    private boolean challenger;
    private int skippedTurns;
    
    public Player(String name, Token token, Hero hero) {
        this.name = name;
        this.token = token;
        this.hero = hero;
        this.location = 0;
        this.drinkCount = 0;
        this.giveCount = 0;
        this.armor = 0;
        this.isKing = false;
        this.challenger = false;
        this.skippedTurns = 0;
    }
    
    public void advance(int number) {
        this.location += number;
    }
    
    public void goBack(int number) {
        this.location -= number;
    }
    
    public void changeLocation(int number) {
        this.location = number;
    }
    
    public void giveDrink(int number) {
        this.giveCount += number;
    }
    
    public void drink(int number) {
        this.drinkCount += number;
    }
    
    public int getLocation() {
        return this.location;
    }
    
    public int getDrinkCount() {
        return this.drinkCount;
    }
    
    public int getGiveCount() {
        return this.giveCount;
    }
    
    public Token getToken() {
        return this.token;
    }
}
