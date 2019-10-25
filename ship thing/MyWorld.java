import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public MyWorld()
    {    
        super(800, 600, 1);
        SpaceShip ship2 = new SpaceShip(20,"Garfield");
        SpaceShip ship1 = new SpaceShip();
        
        
        addObject(ship2, 200, 150);
        addObject(ship1, 400, 300);
        
    }
}
