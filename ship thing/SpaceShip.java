import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class SpaceShip extends Actor
{
    private int speed;
    private String name;
    
    public SpaceShip(){
        this.speed = 1;
        this.name = null;
    }
    public SpaceShip(int speed, String name){
        this.speed = speed;
        this.name = name;
    }
    public void act() 
    {
        move(this.speed);
        if(isAtEdge()){
            turn(Greenfoot.getRandomNumber(90));
        }
        getWorld().showText(this.toString(), getWorld().getWidth() / 2 , getWorld().getHeight() / 2);
    }
    public String toString(){
        return "Name: " + this.name + ", Speed: " + this.speed + ", X: " + getX() + ", Y: " + getY();
    }
    
}
