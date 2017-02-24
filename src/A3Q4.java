
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bonsk5852
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // New City

        City kw = new City();

        //create North walls

        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);

        //create West walls

        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.WEST);

        //create South walls

        new Wall(kw, 4, 1, Direction.SOUTH);
        new Wall(kw, 4, 2, Direction.SOUTH);
        new Wall(kw, 4, 3, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.SOUTH);

        //create East walls

        new Wall(kw, 4, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        //create a gap instead of a wall at 2, 4
        new Wall(kw, 1, 4, Direction.EAST);

        //create a robot

        RobotSE karel = new RobotSE(kw, 4, 1, Direction.EAST);

        while (true) {

            //break the loop once karel reaches avenue 5

            if (karel.getAvenue() == 5) {

                break;

            }

            //karel checks his right side to see if there is a wall

            //if there is a wall, karel turns left and moves

            //if there is no wall, karel moves

            karel.turnRight();

            if (karel.frontIsClear()) {

                karel.move();

            }

            if (!karel.frontIsClear()) {

                karel.turnLeft();

                if (karel.frontIsClear()) {

                    karel.move();

                    if (!karel.frontIsClear()) {

                        karel.turnLeft();
                    }
                }
            }
        }
    }
}
