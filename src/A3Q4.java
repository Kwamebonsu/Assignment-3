
import becker.robots.City;
import becker.robots.Direction;
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
        
        //create walls
        new Wall(kw, 0, 0, Direction.NORTH);
        new Wall(kw, 0, 1, Direction.NORTH);
        new Wall(kw, 0, 2, Direction.NORTH);
        new Wall(kw, 0, 3, Direction.NORTH);
        
        new Wall(kw, 0, 0, Direction.WEST);
        new Wall(kw, 1, 0, Direction.WEST);
        new Wall(kw, 2, 0, Direction.WEST);
        new Wall(kw, 3, 0, Direction.WEST);
        
    }
}
