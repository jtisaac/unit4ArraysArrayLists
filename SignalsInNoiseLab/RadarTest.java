

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    {
        // initialise instance variables
        x = 0;
    }
    @Test
    public void checkMonster()
    {
       Radar jhuang = new Radar( 100, 100 );
       jhuang.setMonsterLocation(10,10);
       int phem = 0;
       while (phem < 20)
       {
           jhuang.scan();
       }
    }
    
}
