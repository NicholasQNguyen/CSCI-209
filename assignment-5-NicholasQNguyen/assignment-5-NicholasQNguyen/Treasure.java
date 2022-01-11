/**
 * Represents a Gem in the Game
 *
 * @author Nicholas Nguyen
 */

import java.awt.*;
import java.util.Random;

class Treasure extends GamePiece
{
    static Random rand = new Random();
    /**
     * Constructor method
     * @param x the initial x position in the game
     * @param y the initial y position in the game
     * @param g the gif used to represent it
     */
    public Treasure(int x, int y, Graphics g)
    {
        super(x, y, g);
        img = Toolkit.getDefaultToolkit().getImage( imgDir + "gem.gif");
		img_width = 32;
		char_width = 32;
    }

    @Override
    public void move(Game game)
    {
        //generate random coordinates and set the coordinates to it
        xcoord = rand.nextInt(800);
        //add this 20 so it doesn't appear under the top bar
        ycoord = rand.nextInt(580) + 20;
    }
}