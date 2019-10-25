import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class MyWorld extends World
{
    public MyWorld()
    {    
        super(600, 400, 1);
        Plane plane1 = new Plane();
        addObject(plane1, 0, 0);
        
    }
}
