import greenfoot.*;
public class Ship extends Actor
{
    private int points;
    private int speed;
    private int rotation;
    private boolean canShoot;
    private boolean alive;
    public int score;
    public Ship(){
        this.speed = 0;
        this.points = 0;
        this.canShoot = true;
        this.alive = true;
        GreenfootImage image = getImage(); 
        image.scale(50, 50);
        setImage(image);
    }
    public int getScore(){
        return score;
    }
    public void kill(){
        this.canShoot = false;
        this.alive = false;
        removeTouching(Asteroid.class);
        getWorld().removeObject(this);
        Greenfoot.stop();
    }
    public boolean getAlive(){
        return this.alive;
    }
    public void act() 
    {
        move(speed);
        rotation=getRotation();
        if(Greenfoot.isKeyDown("w")){
            if(speed<5){speed++;}
        }
        if(Greenfoot.isKeyDown("a")){
            turn(-5);
        }
        if(Greenfoot.isKeyDown("s")){
            if(speed>0){
                speed--;
            }
        }
        if(Greenfoot.isKeyDown("d")){
            turn(5);
        }
        if(Greenfoot.isKeyDown(" ") && canShoot == true){
            getWorld().addObject(new Pellet(this.rotation), getX(), getY());
            canShoot = false;
        }
        if(!Greenfoot.isKeyDown(" ")){
            canShoot = true;
        }
        if(isTouching(Asteroid.class)){
            kill();
        }
        
    }    
}
