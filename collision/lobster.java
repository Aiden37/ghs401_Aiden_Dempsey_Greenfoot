import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class lobster extends Actor
{
    private int collisionCount;
    private int speed;
    private int turnAmount;
    private String name;
    public lobster(){
        this.collisionCount = 0;
        this.speed = 2;
        this.turnAmount = -1;
        this.name = null;
    }
    public lobster(int speed, int turnAmount, String name){
        this.collisionCount = 0;
        this.speed = speed;
        this.turnAmount = turnAmount;
        this.name = name;
    }
    public void act() 
    {
        move(this.speed);
        turn(this.turnAmount);
        if(isAtEdge()){
            turn(180);
        }
        if(isTouching(blueCar.class)){
            this.collisionCount++;
            System.out.println("Collision! collisions: "+this.collisionCount);
        }
        getWorld().showText(toString(),getWorld().getWidth()/2, getWorld().getHeight()/2 + 50);
        
    }
    public String toString(){
        return "Name: "+this.name+"\n"+"X: "+getX()+" Y: "+getY();
    }
}
