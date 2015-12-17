

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class conducts 2 tests of the scan method
 * 
 * @author (jtisaac) 
 * @version (16 December 2015)
 */
public class RadarTest
{
    
    @Test 
    public void checkMonster1()
    {
       //Making a new Radar 
        Radar jhuang = new Radar( 100, 100 );
       //Setting the monster location
       jhuang.setMonsterLocation(10,10);
       //This is the max amount of scans. At the end of all the scans, the number of times that the monster showed up should be equivalent to the maxscans.
       int maxscans = 20;
       //starting variable for the scans
       int phem = 0;
       while (phem < maxscans)
       {
           jhuang.scan(); // conducting several scans
           phem += 1;
       }
       for (int i = 0; i < 100; i++)
        {
            for (int j = 0; j < 100; j++)
            {
                int scans = jhuang.getAccumulatedDetection(i,j);
                if (scans == maxscans)
                {
                    int detectedRow = i; //setting the detected row
                    int detectedCol = j; //setting the detected column
                    assertEquals(10, detectedRow); //the row test
                    assertEquals(10, detectedCol); //the column test
                }
            }
        }
    }
    @Test 
    public void checkMonster2()
    {
       //Making a new Radar
       Radar jzhu = new Radar( 100, 100 );
       //Setting the monster location
       jzhu.setMonsterLocation(99,99);
       //This is the max amount of scans. At the end of all the scans, the number of times that the monster showed up should be equivalent to the maxscans.
       int maxscans = 20;
       //starting variable for the scans       
       int phem = 0;
       while (phem < maxscans)
       {
           jzhu.scan(); // conducting several scans
           phem += 1;
       }
       for (int i = 0; i < 100; i++)
        {
            for (int j = 0; j < 100; j++)
            {
                int scans = jzhu.getAccumulatedDetection(i,j);
                if (scans == maxscans)
                {
                    int detectedRow = i; //setting the detected row
                    int detectedCol = j; //setting the detected column
                    assertEquals(99, detectedRow); //the row test
                    assertEquals(99, detectedCol); //the column test
                }
            }
        }
    }
}
