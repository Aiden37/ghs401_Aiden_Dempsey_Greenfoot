import greenfoot.*;
public class Pellet extends Actor
{
    private int speed;
    private int rotation;
    public Pellet(int rot){
        this.speed = 8;
        this.rotation = rot;
        GreenfootImage image = getImage(); 
        image.scale(20, 20);
        setImage(image);
    }
    public void act() 
    {
        move(this.speed);
        setRotation(this.rotation);
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }    
}
