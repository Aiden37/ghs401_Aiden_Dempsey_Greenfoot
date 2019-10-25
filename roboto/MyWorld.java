import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class MyWorld extends World
{
    public MyWorld()
    {    
        super(600, 400, 1); 
        Roboto rob = new Roboto(400, 4, 3);
        addObject(rob, 100, 100);
    }
}
