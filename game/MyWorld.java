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
        showText( "rtime =" + rtime, 250, 12 );
        if(rtime == 0){
            showText( "time up", 250, 12 );
            Greenfoot.stop();
        }
    }
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(320, 240, 1);
        
        //主人公設置
        addObject( new Morio(), 8, 192 );
        //固定足場設定
        addObject( new grand(), 8, 216 );
        addObject( new grand(), 8, 232 );
        addObject( new grand(), 24, 216 );
        addObject( new grand(), 24, 232 );
        addObject( new grand(), 56, 216 );
        addObject( new grand(), 56, 232 );
        addObject( new grand(), 72, 216 );
        addObject( new grand(), 72, 232 );
        addObject( new grand(), 104, 200 );
        addObject( new grand(), 104, 216 );
        addObject( new grand(), 104, 232 );
        addObject( new grand(), 120, 200 );
        addObject( new grand(), 120, 216 );
        addObject( new grand(), 120, 232 );
        //移動足場設定
        addObject( new grand2(), 152, 200 );
        addObject( new grand2(), 168, 200 );
        addObject( new grand2(), 184, 200 );
        //固定足場設定
        addObject( new grand(), 280, 216 );
        addObject( new grand(), 280, 232 );
        addObject( new grand(), 296, 216 );
        addObject( new grand(), 296, 232 );
        addObject( new grand(), 312, 216 );
        addObject( new grand(), 312, 232 );
        //旗設置
        addObject( new flag(), 312, 168 );
        //落下判別
        addObject( new out(), 160, 242 );
 
        rtime=1000;
    }
   
    
}
