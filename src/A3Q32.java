
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
public class A3Q32 {

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

        Robot karel = new Robot(kw, 1, 1, Direction.EAST);
        
        while(true){
            while(karel.canPickThing()){
                karel.pickThing();
            }
            if(karel.frontIsClear()){
                karel.move();
            }
            if(!karel.frontIsClear() && karel.getAvenue()==4){
                while(karel.getDirection()!=Direction.SOUTH){
                karel.turnLeft();
                }
                if(karel.getAvenue()==4 && karel.getStreet()==3){
                    karel.pickThing();
                        break;
                    }
                karel.move();
                
                while(karel.getDirection()!=Direction.WEST){
                    karel.turnLeft();
                }
            
            }
            if(!karel.frontIsClear() && karel.getAvenue()==1){
                while(karel.getDirection()!=Direction.SOUTH){
                karel.turnLeft();
                }
                karel.move();
                
                while(karel.getDirection()!=Direction.EAST){
                    karel.turnLeft();
                }
            
            }
        }

    }
}
