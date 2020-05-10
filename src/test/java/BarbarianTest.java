import Interfaces.IWeapon;
import Players.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {
    Barbarian barbarian;
    IWeapon axe;

    @Before
    public void before(){
        barbarian = new Barbarian("Sid", 90);
        }
    @Test
    public void hasName(){
        assertEquals("Sid", barbarian.getName());
    }
    @Test
    public void  hasHealthScore(){
        assertEquals(90, barbarian.getHealthScore());
    }
   
    }


}
