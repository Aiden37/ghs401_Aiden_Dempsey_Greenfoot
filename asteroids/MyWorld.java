import greenfoot.*;
import java.util.List;
public class MyWorld extends World
{
    private Ship player;
    private int timeSurvived;
    private List<Ship> shipList;
    public MyWorld()
    {
        super(800, 800, 1);
        timeSurvived = 0;
        player = new Ship();
        addObject(player, getWidth()/2, getHeight()/2);
    }
    public int getPlayerX(){
        return player.getX();
    }
    public int getPlayerY(){
        return player.getY();
    }
    public void act(){
        timeSurvived++;
        showText("Time Survived: "+(timeSurvived/60)+" seconds, Asteroids Destroyed: "+player.getScore()+", Total Score: "+((timeSurvived/60)+player.getScore()), getWidth()/2, getHeight()-10);
        if(player.getAlive() == true){
            int side = Greenfoot.getRandomNumber(500);
            if(side == 0){addObject(new Asteroid(Greenfoot.getRandomNumber(4)+1), Greenfoot.getRandomNumber(getWidth()), 0);}
            if(side == 1){addObject(new Asteroid(Greenfoot.getRandomNumber(4)+1), Greenfoot.getRandomNumber(getWidth()), getHeight());}
            if(side == 2){addObject(new Asteroid(Greenfoot.getRandomNumber(4)+1), 0, Greenfoot.getRandomNumber(getHeight()));}
            if(side == 3){addObject(new Asteroid(Greenfoot.getRandomNumber(4)+1), getWidth(), Greenfoot.getRandomNumber(getHeight()));}
        }
        
    }
}
