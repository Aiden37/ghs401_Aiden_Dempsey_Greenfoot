import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class blueCar extends Actor
{
    private String name;
    private int speed;
    private int turnAmount;
    public blueCar(){
        this.name = null;
        this.speed = 0;
        this.turnAmount = 0;
    }
    public blueCar(String name, int speed, int turnAmount){
        this.name = name;
        this.speed = speed;
        this.turnAmount = turnAmount;
    }
    public void act() 
    {
        move(this.speed);
        turn(this.turnAmount);
        if(isAtEdge()){
            turn(180);
        }
        getWorld().showText(toString(),getWorld().getWidth()/2, getWorld().getHeight()/2);
    }    
    public String toString(){
        return "Name: "+this.name+", Speed: "+this.speed+" Km/hr, TurnAmount: "+this.turnAmount+" degrees \n"+"X: "+getX()+" Y: "+getY();
    }
}
