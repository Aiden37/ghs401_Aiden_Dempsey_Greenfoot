import greenfoot.*;
public class MyWorld extends World
{

    private int height = 100;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(2000, 900, 1);
        
        for(int i=0; i<getWidth(); i+=100){
            for(int j=50; j<getHeight(); j+=150){
                addObject(new Bee(), i, j);
            }
        }
    }
}
