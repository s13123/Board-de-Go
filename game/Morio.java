import greenfoot.*;

/**
 * Write a description of class Morio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Morio extends Actor
{
    /**
     * Act - do whatever the Morio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(1);
    }

    }    
}