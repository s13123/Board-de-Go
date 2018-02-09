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
    int jpmax = 20, jp = 0, high = 0, jpvoid=0;
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
        if(jp == 0 && high == 0 && jpvoid==0){
            jp = jpmax;
        }
    }
    
        if(jp > 0){
            jp--;
            high++;
            setRotation(270);
            move(3);
    }
        else{
            Actor grand1 = getOneObjectAtOffset( 0, 16, grand.class );
            Actor grand2 = getOneObjectAtOffset( 0, 16, grand2.class );
            if( grand1 != null || grand2 != null){
                high=0;
                setRotation(0);
        }    
            else{
                high--;
                setRotation(90);
                move(3);
                //ジャンプ後硬直用
                if(high<1){
                    jpvoid=5;
                }
        }
    }
        //落下判定
        Actor drop = getOneObjectAtOffset( 0, 0, out.class );
        if( drop != null ){
                getWorld().showText( "Game Over...", 160, 120 );
                Greenfoot.stop();
        }
        //ゴール判定
        Actor goal = getOneObjectAtOffset( 0, 0, flag.class );
        if( goal != null ){
                getWorld().showText( "STAGE CLEAR!!!", 160, 120 );
        }
        //敵接触判定
        Actor ene5 = getOneObjectAtOffset( 0, 0, enemy5.class );
        if( ene5 != null ){
            getWorld().removeObject( ene5 );
            getWorld().showText( "Game Over...", 160, 120 );
            Greenfoot.stop();
        }
        //ジャンプ後硬直用
        if(jpvoid>0){
            jpvoid--;
        }
   } 
}
