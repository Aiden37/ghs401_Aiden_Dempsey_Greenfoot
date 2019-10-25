import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Roboto extends Actor
{
    private int batteryLevel;
    private int speed;
    private int efficiancy;
    private int num = 0;
    public Roboto(int battery, int speed, int efficiancy){
        this.batteryLevel = battery;
        this.speed = speed;
        this.efficiancy = efficiancy;
    }
    public String getBatteryLevel(){
        return "Battery: " + this.batteryLevel;
    }
    public void act() 
    {
        if(this.batteryLevel>0){
            move(this.speed);
            num++;
            if((num%3) == 0){
                this.batteryLevel--;
            }
            if(getX()>= (getWorld().getWidth() - 100) || getX()<100){
                move(-this.speed);    
                turn(90);
            }
            if(getY()>= (getWorld().getHeight() - 100) || getY()<100){
                move(-this.speed);    
                turn(90);
            }
        }
        getWorld().showText(getBatteryLevel(), getWorld().getWidth() / 2 , getWorld().getHeight() / 2);
    }
    public String toString(){
        return "Speed: "+ this.speed + " Battery Level: " + this.batteryLevel + "\n Efficiancy: "+ this.efficiancy;
    }
}
