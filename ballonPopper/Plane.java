import greenfoot.*;
import java.util.List;
public class Plane extends Actor
{
    private int speed;
    private int totalBalloonFlightTime;
    private int balloonsPopped;
    private List<Balloon> balloonList;
    public Plane(){
        this.speed = 5;
        this.totalBalloonFlightTime = 0;
        this.balloonsPopped = 0;
        GreenfootImage image = getImage(); 
        image.scale(50, 50);
        setImage(image);
    }
    public int totalBalloonFlightTime(){
        for(Balloon a: balloonList){
            this.totalBalloonFlightTime += a.getFlightTime();
        }
        return this.totalBalloonFlightTime;
    }
    public void act() 
    {
        move(speed);
        this.balloonList = getWorld().getObjects(Balloon.class);
        getWorld().showText("Balloon flight time: "+totalBalloonFlightTime()+"\nBalloons popped: "+this.balloonsPopped, getWorld().getWidth() / 2 , getWorld().getHeight() / 2);
        if(Greenfoot.isKeyDown("a")){
            setRotation(180);
        }
        if(Greenfoot.isKeyDown("d")){
            setRotation(0);
        }
        if(isTouching(Balloon.class)){
            removeTouching(Balloon.class);
            this.balloonsPopped++;
        }
        if(this.balloonList.size() == 0){
            Greenfoot.stop();
        }
    }    
}
