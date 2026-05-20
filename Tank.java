import java.awt.Color;
import java.awt.Graphics;
/**
 * Write a description of class Tank here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tank extends Enemy
{
    // instance variables - replace the example below with your own
    private int hp = 2;

    /**
     * Constructor for objects of class Tank
     */
    public Tank(int x, int y, int width, int height, int speed) {
        super(x, y, width, height, speed); // Call superclass constructor
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    @Override
    public void takeHit() {
        hp--; 
        
        if (hp <= 0) {
            this.setActive(false); 
        }
    }
    
    @Override
    public void draw(Graphics g) {
        g.setColor(Color.PINK); 
        g.fillRect(getX(), getY(), getWidth(), getHeight()); 
    }
}
