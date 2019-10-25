import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ant extends Actor
{
    /**
     * Act - do whatever the Ant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //move the object one pixel
        move(3);
        //check if the object is at edge, if yes then bounce
        if(isAtEdge()){
            turn(Greenfoot.getRandomNumber(181));
            clone(Ant);
        }
    }    
}
