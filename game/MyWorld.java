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
    private int etime, emax=100;
    
    public void act()
    {   
        rtime--;
        showText( "rtime =" + rtime, 250, 12 );
        if(rtime == 0){
            showText( "time up", 250, 12 );
            Greenfoot.stop();
        }
        if(etime == emax){
            addObject( new enemy5(), 248, 56 );
        }
        etime--;
        if(etime == 0){
            etime=emax;
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
        //落下判別用床設定
        addObject( new out(), 160, 242 );
        //敵設置
        addObject( new enemy4(), 248, 48 );
 
        etime=emax;
        rtime=1000;
    }
   
    
}
