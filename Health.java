import java.awt.Color;
import java.awt.Graphics;
/**
 * Write a description of class Health here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Health extends PowerUp
{

    /**
     * Constructor for objects of class Health
     */
    public Health(int x, int y, int width, int height, int speed) {
        super(x, y, width, height, speed); // Call superclass constructor
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void applyEffect (Player player){
        player.addHealth(1);
    }
    
    @Override
    public void draw(Graphics g) {
        g.setColor(Color.GREEN); // Powerups are green
        // Use inherited getters for drawing position and dimensions
        g.fillRect(getX(), getY(), getWidth(), getHeight()); // Draw as a rectangle
    }
}
