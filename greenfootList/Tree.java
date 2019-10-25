import greenfoot.*;
import java.util.List;
public class Tree extends Actor
{
    private List<Bee> beeList;
    public void act() 
    {
        beeList = getWorld().getObjects(Bee.class);
        System.out.println(beeList.size());
    }    
}
