
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bonsk5852
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();

        //show the number of things
        kw.showThingCounts(true);

        //create things
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);

        //create a robot
        Robot karel = new Robot(kw, 1, 1, Direction.EAST);

        //repeat 10 times
        for (int counter = 0; counter < 10; counter++) {

            //pick up things in Avenue 1
            karel.pickThing();

            //move it to Avenue 2
            karel.move();
            karel.putThing();

            //return back to Avenue 1
            karel.turnLeft();
            karel.turnLeft();
            karel.move();

            //face East
            karel.turnLeft();
            karel.turnLeft();
        }

    }
}
