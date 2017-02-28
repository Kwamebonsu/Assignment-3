
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bonsk5852
 */
public class A3Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();

        //create square one
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);

        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);

        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);

        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.EAST);

        //create square two
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.NORTH);

        new Wall(kw, 1, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.WEST);

        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.SOUTH);

        new Wall(kw, 1, 5, Direction.EAST);
        new Wall(kw, 2, 5, Direction.EAST);

        //create square three
        new Wall(kw, 4, 1, Direction.NORTH);
        new Wall(kw, 4, 2, Direction.NORTH);

        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 5, 1, Direction.WEST);

        new Wall(kw, 5, 1, Direction.SOUTH);
        new Wall(kw, 5, 2, Direction.SOUTH);

        new Wall(kw, 5, 2, Direction.EAST);
        new Wall(kw, 4, 2, Direction.EAST);

        //create square four
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 5, Direction.NORTH);

        new Wall(kw, 4, 4, Direction.WEST);
        new Wall(kw, 5, 4, Direction.WEST);

        new Wall(kw, 5, 4, Direction.SOUTH);
        new Wall(kw, 5, 5, Direction.SOUTH);

        new Wall(kw, 5, 5, Direction.EAST);
        new Wall(kw, 4, 5, Direction.EAST);

        //create a robot
        Robot karel = new Robot(kw, 3, 3, Direction.SOUTH);

        karel.move();

        //repeat this 11 times
        for (int counter = 0; counter < 11; counter++) {
            if (true) {
                //turn left and check if karel can move
                karel.turnLeft();

                //if yes, karel moves one space
                if (karel.frontIsClear()) {
                    karel.move();
                } //if not, karel turns back right then moves one space
                else if (!karel.frontIsClear()) {
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.move();
                }
            }
        }
        karel.move();

        //repeat this 11 times
        for (int counter = 0; counter < 11; counter++) {
            if (true) {
                //turn left and check if karel can move
                karel.turnLeft();

                //if yes, karel moves one space
                if (karel.frontIsClear()) {
                    karel.move();
                } //if not, karel turns back right then moves one space
                else if (!karel.frontIsClear()) {
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.move();
                }
            }
        }
        karel.move();

        //repeat this 11 times
        for (int counter = 0; counter < 11; counter++) {
            if (true) {
                //turn left and check if karel can move
                karel.turnLeft();

                //if yes, karel moves one space
                if (karel.frontIsClear()) {
                    karel.move();
                } //if not, karel turns back right then moves one space
                else if (!karel.frontIsClear()) {
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.move();
                }
            }
        }
        karel.move();

        //repeat this 11 times
        for (int counter = 0; counter < 11; counter++) {
            if (true) {
                //turn left and check if karel can move
                karel.turnLeft();

                //if yes, karel moves one space
                if (karel.frontIsClear()) {
                    karel.move();
                } //if not, karel turns back right then moves one space
                else if (!karel.frontIsClear()) {
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.move();
                }
            }
        }
    }
}
