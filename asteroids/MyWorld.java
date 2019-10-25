import greenfoot.*;
public class MyWorld extends World
{
    private Ship player;
    public MyWorld()
    {
        super(800, 800, 1);
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
        if(player.getAlive() == true){
            int side = Greenfoot.getRandomNumber(200);
            if(side == 0){addObject(new Asteroid(Greenfoot.getRandomNumber(4)+1), Greenfoot.getRandomNumber(getWidth()), 0);}
            if(side == 1){addObject(new Asteroid(Greenfoot.getRandomNumber(4)+1), Greenfoot.getRandomNumber(getWidth()), getHeight());}
            if(side == 2){addObject(new Asteroid(Greenfoot.getRandomNumber(4)+1), 0, Greenfoot.getRandomNumber(getHeight()));}
            if(side == 3){addObject(new Asteroid(Greenfoot.getRandomNumber(4)+1), getWidth(), Greenfoot.getRandomNumber(getHeight()));}
        }
    }
}
