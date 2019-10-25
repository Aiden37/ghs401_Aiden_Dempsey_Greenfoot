import greenfoot.*;
public class MyWorld extends World
{
    public MyWorld()
    {    
        super(600, 400, 1); 
        blueCar car1 = new blueCar();
        blueCar car2 = new blueCar("McQueen", 3, 3);
        lobster lob1 = new lobster();
        lobster lob2 = new lobster(6, 5, "Butters");
        
        addObject(car1, 30, 200);
        addObject(car2, 300, 70);
        addObject(lob1, 100, 200);
        addObject(lob2, 300, 100);
    }
}
