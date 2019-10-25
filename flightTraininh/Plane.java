import greenfoot.*;
public class Plane extends Actor
{
    private boolean isMissionAccomplished;
    public Plane(){
        this.isMissionAccomplished = false;
    }
    public void act() 
    {
        move(1);
        System.out.println("X: "+getX()+" Y: "+getY());
        if(getX()==getWorld().getWidth()-1 && getY()==getWorld().getHeight()-1){
            setLocation((int)(getWorld().getWidth()/2), (int)(getWorld().getHeight()/2));
            this.isMissionAccomplished = true;
            getWorld().showText("Mission Complete", (int)(getWorld().getWidth()/2), (int)(getWorld().getHeight()/2));
            Greenfoot.stop();
        }
        if(getX()==getWorld().getWidth()-1){
            turn(90);
            move(1);
            turn(90);
        }
        if(getX()==0){
            turn(-90);
            move(1);
            turn(-90);
        }
        
    }    
}
