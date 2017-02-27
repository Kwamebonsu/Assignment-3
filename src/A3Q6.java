
import becker.robots.City;
import becker.robots.Direction;
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
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city
        City kw = new City();

        //show the number of things
        kw.showThingCounts(true);
        //create things

        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 2, 1);
        new Thing(kw, 2, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);

        //create a robot
        Robot karel = new Robot(kw, 0, 1, Direction.SOUTH);
        karel.move();
        while (true) {
            //pick things up if karel is in avenue 1 and can pick things up
            while (karel.canPickThing() && karel.getAvenue() == 1) {
                karel.pickThing();
            }
            //turn left and put things down in a line once karel can't pick up anymore things
            karel.turnLeft();
            while (karel.countThingsInBackpack() > 0) {
                karel.putThing();
                karel.move();
                //return back to avenue one,face south and move down 1 once karel has put down all the things
                if (karel.countThingsInBackpack() == 0 && karel.getAvenue() > 1) {
                    karel.turnLeft();
                    karel.turnLeft();
                    while (karel.getAvenue() != 1) {
                        karel.move();
                    }
                }
            }
            //break the loop if karel is in avenue 1 and there are no things to pick up
            if (karel.getAvenue() == 1 && !karel.canPickThing()) {
                break;
            }
        }
    }
}
