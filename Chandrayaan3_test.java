package com.incubyte.Chandrayaan3_tdd;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class Chandrayaan3_test 
{
   
    @Test
    public void constructor_test()
    {
    	Chandrayaan3_main obj=new Chandrayaan3_main(0,0,0, "N");
        
    }
    
    @Test
    public void testInitialPositionAndDirection() {
    	Chandrayaan3_main spacecraft = new Chandrayaan3_main(0, 0, 0, "N");
        assertEquals(0, spacecraft.getX());
        assertEquals(0, spacecraft.getY());
        assertEquals(0, spacecraft.getZ());
        assertEquals("N", spacecraft.getDirection());
    }
}
