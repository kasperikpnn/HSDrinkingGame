package hsdrinkinggame;

public class Player {
    private String name;
    private Token token;
    private Hero hero;
    private int location;
    private int drinkCount;
    
    public Player(String name, Token token, Hero hero) {
        this.name = name;
        this.token = token;
        this.hero = hero;
        this.location = 0;
        this.drinkCount = 0;
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
    
    public int getLocation() {
        return this.location;
    }
    
    public int getDrinkCount() {
        return this.drinkCount;
    }
    
    public Token getToken() {
        return this.token;
    }
}
