import java.awt.Color;
import java.awt.Graphics;
/**
 * Write a description of class PowerUp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class PowerUp extends GameObject
{
    // instance variables - replace the example below with your own
    private int speed;

    /**
     * Constructor for objects of class PowerUp
     */
    public PowerUp(int x, int y, int width, int height, int speed) {
        super(x, y, width, height); // Call superclass constructor
        this.speed = speed;
    }
    
    @Override
    public void update() {
        // Powerups fall from the top, update y-coordinate using inherited setter
        setY(getY() + speed);

        // Deactivate if off-screen (below the bottom of the screen)
        if (getY() > GamePanel.SCREEN_HEIGHT) {
            setActive(false); // Use inherited setter to deactivate
        }
    }
    
    
    @Override
    public void draw(Graphics g) {
        g.setColor(Color.MAGENTA); // Powerups are green
        // Use inherited getters for drawing position and dimensions
        g.fillRect(getX(), getY(), getWidth(), getHeight()); // Draw as a rectangle
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public abstract void applyEffect(Player player);
}
