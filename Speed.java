import java.awt.Color;
import java.awt.Graphics;
/**
 * Write a description of class Speed here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Speed extends PowerUp
{

    /**
     * Constructor for objects of class Speed
     */
    public Speed(int x, int y, int width, int height, int speed) {
        super(x, y, width, height, speed); // Call superclass constructor
    }

    @Override
    public void update() {
        // Powerups fall from the top, update y-coordinate using inherited setter
        setY(getY() + getSpeed());

        // Deactivate if off-screen (below the bottom of the screen)
        if (getY() > GamePanel.SCREEN_HEIGHT) {
            setActive(false); // Use inherited setter to deactivate
        }
    }
    
    public void applyEffect (Player player){
        player.startSpeedBoost(10, 600);
    }
    
    
    @Override
    public void draw(Graphics g) {
        g.setColor(Color.MAGENTA); // Powerups are green
        // Use inherited getters for drawing position and dimensions
        g.fillRect(getX(), getY(), getWidth(), getHeight()); // Draw as a rectangle
    }
    
    
    
    
    
    
    
    
    
    
    
}
