import greenfoot.*;
public class Seal extends Actor
{
    private int xDestination;
    private int yDestination;
    private int speed;
    public Seal(int speed, int x, int y){
        this.xDestination = x;
        this.yDestination = y;
        this.speed = speed;
    }
    //Math.pow(var, power);
    public double calcTripDistance(){
        return Math.pow((Math.pow(this.yDestination-getY(), 2)+Math.pow(this.xDestination-getX(), 2)), 0.5);
    }
    public double calcTripTravelTime(){
        return calcTripDistance()/this.speed;
    }
    public void act() 
    {
        move(this.speed);
        if(isAtEdge()){
            turn(70);
        }
        getWorld().showText("Distance from Destination: "+calcTripDistance()+" km. \n Travel Time to Destination: "+calcTripTravelTime()+"hr.", getWorld().getWidth() / 2 , getWorld().getHeight() / 2);
    }    
    
}
