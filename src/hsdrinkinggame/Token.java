package hsdrinkinggame;
import javafx.scene.image.Image;

public class Token {
    private Image image; // väliaikanen kunnes jaksan piirtää paintilla tokenit
    
    public Token(Image image) {
        this.image = image;
    }
    
    public Image getImage() {
        return this.image;
    }
}
