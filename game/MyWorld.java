import greenfoot.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MyWorld extends World
{
    private int rtime;
    
    
    public void act()
    {    
        
        rtime--;
        showText( "rtime =" + rtime, 500, 50 );
        if(rtime == 0){
            showText( "time up", 500, 50 );
             Greenfoot.stop();
        }
    }
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
       // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        rtime=1000;
        addObject( new Morio(), 50, 200 );
    }
   
    
}
