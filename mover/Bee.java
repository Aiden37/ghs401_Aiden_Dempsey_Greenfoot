import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Bee extends Actor
{
    private int speed;
    public Bee(){
        this.speed=5;
    }
    public void act() 
    {
        move(this.speed);
        if (Greenfoot.isKeyDown("d")){
            turn(5);
        }
        if (Greenfoot.isKeyDown("a")){
            turn(-5);
        }
        if (Greenfoot.isKeyDown("w")){
            if(speed<20){
                speed++;
            }
        }
        if (Greenfoot.isKeyDown("s")){
            if(speed>0){
                speed--;
            }
        }
        if (isTouching(Bee.class)){
            turn(180);
        }
        if(isAtEdge()){
            turn(180);
        }
    }    
}
