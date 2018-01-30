import greenfoot.*;

/**
 * Write a description of class grand2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class grand2 extends Actor
{
    int timemax = 120;
    int time1 = timemax;
    int sp = 1;
    public void act() 
    {
        if(time1 > timemax / 2){
            setRotation(0);
            move(sp);
        }
        else{
            setRotation(0);
            move(sp*-1);
        }
        time1--;
        if(time1 == 0){
            time1 = timemax;
        }
    }    
}
