import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class MyWorld extends World
{
    private int x;
    private int y;
    public MyWorld()
    {    
        super(600, 400, 1); 
        x=100;
        y=200;
        Seal seal = new Seal(5,x,y);
        Destination stop = new Destination();
        addObject(seal, 100, 100);
        addObject(stop, x, y);
    }
}
