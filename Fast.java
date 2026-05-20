import java.awt.Color;
import java.awt.Graphics;
/**
 * Write a description of class Fast here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fast extends Enemy
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Fast
     */
    public Fast(int x, int y, int width, int height, int speed) {
        super(x, y, width, height, speed); // Call superclass constructor
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    @Override
    public void update() {
        // Enemies fall from the top, update y-coordinate using inherited setter
        setY(getY() + getSpeed() + 3);

        // Deactivate if off-screen (below the bottom of the screen)
        if (getY() > GamePanel.SCREEN_HEIGHT) {
            setActive(false); // Use inherited setter to deactivate
        }
    }
    
    @Override
    public void draw(Graphics g) {
        g.setColor(Color.WHITE); // Enemy is red
        // Use inherited getters for drawing position and dimensions
        g.fillOval(getX(), getY(), getWidth(), getHeight()); // Draw as a circle/oval
    }
}
