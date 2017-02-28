
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
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();

        //create the walls
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);

        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);

        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);

        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);

        //create things
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 4);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 4);

        //create a Robot
        Robot karel = new Robot(kw, 1, 1, Direction.EAST);

        while (true) {

            //pick up all things karel encounters
            while (karel.canPickThing()) {
                karel.pickThing();
            }

            //move forward until karel encounters a wall
            if (karel.frontIsClear()) {
                karel.move();
            }

            //If karel is facing a wall on Avenue 4, move 1 space South
            if (!karel.frontIsClear() && karel.getAvenue() == 4) {
                while (karel.getDirection() != Direction.SOUTH) {
                    karel.turnLeft();
                }

                //if karel is at 3, 4, pick up thing before breaking the loop
                if (karel.getAvenue() == 4 && karel.getStreet() == 3) {
                    karel.pickThing();
                    break;
                }

                karel.move();

                //face West then repeat the process
                while (karel.getDirection() != Direction.WEST) {
                    karel.turnLeft();
                }

            } //if karel is facing a wall on Avenue 1, move one space south
            else if (!karel.frontIsClear() && karel.getAvenue() == 1) {
                while (karel.getDirection() != Direction.SOUTH) {
                    karel.turnLeft();
                }

                //if karel is at 3, 4, pick up thing before breaking the loop
                if (karel.getAvenue() == 4 && karel.getStreet() == 3) {
                    karel.pickThing();
                    break;
                }

                karel.move();

                //face East then repeat the process
                while (karel.getDirection() != Direction.EAST) {
                    karel.turnLeft();
                }

            }
        }

        //return to 1, 1
        while (true) {

            //face North
            while (karel.getDirection() != Direction.NORTH) {
                karel.turnLeft();
            }

            //move until karel is on Street 1
            while (karel.getStreet() != 1) {
                karel.move();
            }

            //face West
            while (karel.getDirection() != Direction.WEST) {
                karel.turnLeft();
            }

            //move until karel is on Avenue 1
            while (karel.getAvenue() != 1) {
                karel.move();
            }
            //Once karel reaches 1, 1, face East and break the loop
            if (karel.getAvenue() == 1 && karel.getStreet() == 1) {
                karel.turnLeft();
                karel.turnLeft();
                break;
            }
        }

    }
}
