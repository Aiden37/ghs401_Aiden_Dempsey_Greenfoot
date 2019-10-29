import greenfoot.*;
import java.util.List;
public class Asteroid extends Actor
{
    private int size;
    private List<Ship> shipList;
    public Asteroid(int size){
       this.size = size;
       GreenfootImage image = getImage(); 
       image.scale(25*size, 25*size);
       setImage(image);
    }
    public void act() 
    {
        shipList=getWorld().getObjects(Ship.class);
        if(shipList.size() != 0){
            turnTowards(shipList.get(0).getX(), shipList.get(0).getY());
            move(1);
            if(isTouching(Pellet.class)){
                removeTouching(Pellet.class);
                if(this.size==1){
                    getWorld().removeObject(this);
                    shipList.get(0).score++;
                }
                else{
                    this.size--;
                    GreenfootImage image = getImage(); 
                    image.scale(25*size, 25*size);
                    setImage(image);
                }
            }
        }
    }    
}
