
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
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city
        City kw = new City();
        
        //create a thing
        new Thing(kw, 1, 6);
        
        //create a wall
        new Wall(kw, 1, 5, Direction.EAST);
        
        //create a Robot
        Robot karel = new Robot(kw, 1, 1, Direction.EAST);
        
        for(int counter=4; counter>0; counter--){
            karel.move();
        }
        
    }
}
