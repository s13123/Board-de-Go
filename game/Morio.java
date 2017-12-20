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
    int jpmax = 30, jp = 0, high = 0;
    public void act() 
    {

        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(1);
    }

       if( Greenfoot.isKeyDown( "left" ) ){
        setRotation(0);
        move(-1);
    } // Add your action code here.
    
        if( Greenfoot.isKeyDown( "up" ) ){
        if(jp == 0 && high == 0){
            jp = jpmax;
        }
    }
        if(jp > 0){
        jp--;
        high++;
        setRotation(270);
        move(3);
    }
        if(jp == 0 && high > 0){
        high--;
        setRotation(90);
        move(3);
    }
    
   }
}
