import greenfoot.*;
public class Balloon extends Actor
{
    private int speed;
    private int flightTime;
    public Balloon(int s){
        this.speed = s;
        this.flightTime = 0;
        setRotation(-90);
    }
    public void resetPosition(){
        setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()), getWorld().getHeight());
    }
    public int getFlightTime(){
        return this.flightTime;
    }
    public void act() 
    {
        flightTime++;
        move(speed);
        if(getY() <= 10){
            resetPosition();
        }
    }    
}
