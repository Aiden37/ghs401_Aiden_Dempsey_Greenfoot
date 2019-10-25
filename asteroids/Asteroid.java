import greenfoot.*;
public class Asteroid extends Actor
{
    private int size;
    private ArrayList shipList;
    public Asteroid(int size){
       this.size = size;
       GreenfootImage image = getImage(); 
       image.scale(25*size, 25*size);
       setImage(image);
    }
    public void act() 
    {
        shipList=getWorld().getObjects(Ship.class);
        
        turnTowards(shipList.get(i).getX(), shipList.get(i).getY());
        move(1);
        
    }    
}
