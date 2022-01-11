/**
 * Represents a Goblin in the Game
 * 
 * @author Nicholas Nguyen
 */

import java.awt.*;

class Goblin extends GamePiece {

    //movement speed in pixels
    private static final int goblinSpeed = 4;
    
    /**
     * Constructor method
     * @param x the x position in the game
     * @param y the y position in the game
     * @param g the gif used to represent it
     */
    public Goblin(int x, int y, Graphics g)
    {
        super(x, y, g);
        img = Toolkit.getDefaultToolkit().getImage( imgDir + "head1.gif");
		img_width = 63;
		char_width = 63;
    }

    @Override
    public void move(Game game)
    {

        {
            //Get the professor's x and y positions
            int profX = game.getHuman().getXPos();
            int profY = game.getHuman().getYPos();
            int goblinX = this.getXPos();
            int goblinY = this.getYPos();
            
            if(goblinX == profX - 4)
            {
                //do nothing if within 4 of the professor
            }
            else if (goblinX == profX +4)
            {
                //do nothing
            }
            else
            {
                //Move the goblin left and right based on the professor's position
                if (profX > goblinX)
                {
                    xcoord += goblinSpeed;
                }
                else if (profX < goblinX)
                {
                    xcoord -= goblinSpeed;
                }
            }
            if (goblinY == profY - 4)
            {
                //do nothing if within 4 of the professor to prevent bouncing
            }
            else if (goblinY == profY +4)
            {
                //do nothing
            }
            else
            {
                //Move the goblin up and down based on the professor's position
                if (profY > goblinY)
                {
                    ycoord += goblinSpeed;
                }
                else if (profY < goblinY)
                {
                    ycoord -= goblinSpeed;
                }
            }
        }   

    }

}
