
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bonsk5852
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new city
        City kw = new City();

        //create walls
        new Wall(kw, 2, 2, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.NORTH);

        new Wall(kw, 2, 2, Direction.WEST);
        new Wall(kw, 3, 2, Direction.WEST);

        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);

        new Wall(kw, 3, 3, Direction.EAST);
        new Wall(kw, 2, 3, Direction.EAST);

        //create a robot
        Robot karel = new Robot(kw, 1, 3, Direction.WEST);

        //repeat 24 times
        for (int counter = 0; counter < 24; counter++) {
            
            //check to see if left side is clear
            karel.turnLeft();
            
            //if it is, karel moves one space
            if (karel.frontIsClear()) {
                karel.move();
                
            } //if not, karel turns back right and moves one space
            else if (!karel.frontIsClear()) {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
            }

        }
    }
}
