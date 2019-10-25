import greenfoot.*;
public class MyWorld extends World
{
    
    
    private Ship player;
    
    public MyWorld()
    {
        super(800, 800, 1);
        player = new Ship();
        addObject(player, getWidth()/2, getHeight()/2);
    }
}
