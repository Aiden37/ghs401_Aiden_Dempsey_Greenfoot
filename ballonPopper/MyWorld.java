import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld()
    {    
        super(600, 400, 1);
        addObject(new Plane(), getWidth()/2, getHeight()/5);
        for(int i=0;i<10;i++){
            addObject(new Balloon(Greenfoot.getRandomNumber(8)+1), Greenfoot.getRandomNumber(getWidth()), getHeight());
        }
    }
}
