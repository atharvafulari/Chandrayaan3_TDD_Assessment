package com.incubyte.Chandrayaan3_tdd;

import static org.junit.Assert.assertEquals;

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
    
    @Test
    public void testMoveForwarddirN() {
    	Chandrayaan3_main spacecraft = new Chandrayaan3_main(0, 0, 0, "N");
        spacecraft.moveForward();
        assertEquals(1, spacecraft.getY());
    }
    
    @Test
    public void testMoveForwarddirS() {
    	Chandrayaan3_main spacecraft = new Chandrayaan3_main(0, 0, 0, "S");
        spacecraft.moveForward();
        assertEquals(-1, spacecraft.getY());
    }
    
    
    @Test
    public void testMoveForwarddirE() {
    	Chandrayaan3_main spacecraft = new Chandrayaan3_main(0, 0, 0, "E");
        spacecraft.moveForward();
        assertEquals(1, spacecraft.getX());
    }
    
    @Test
    public void testMoveForwarddirW() {
    	Chandrayaan3_main spacecraft = new Chandrayaan3_main(0, 0, 0, "W");
        spacecraft.moveForward();
        assertEquals(-1, spacecraft.getX());
    }
    
    @Test
    public void testMoveForwarddirU() {
    	Chandrayaan3_main spacecraft = new Chandrayaan3_main(0, 0, 0, "U");
        spacecraft.moveForward();
        assertEquals(1, spacecraft.getZ());
    }
    
    @Test
    public void testMoveForwarddirD() {
    	Chandrayaan3_main spacecraft = new Chandrayaan3_main(0, 0, 0, "D");
        spacecraft.moveForward();
        assertEquals(-1, spacecraft.getZ());
    }
    
    @Test
    public void testMoveBackward() {
        Chandrayaan3_main spacecraft = new Chandrayaan3_main(0, 0, 0, "N");
        spacecraft.moveBackward();
        assertEquals(-1, spacecraft.getY());
    }
    
    @Test
    public void testTurnLeft() {
        Chandrayaan3_main spacecraft = new Chandrayaan3_main(0, 0, 0, "N");
        spacecraft.turnLeft();
        assertEquals("W", spacecraft.getDirection());
    }
    
    @Test
    public void testTurnRight() {
        Chandrayaan3_main spacecraft = new Chandrayaan3_main(0, 0, 0, "N");
        spacecraft.turnRight();
        assertEquals("E", spacecraft.getDirection());
    }
    
    @Test
    public void testTurnUp() {
        Chandrayaan3_main spacecraft = new Chandrayaan3_main(0, 0, 0, "N");
        spacecraft.turnU();
        assertEquals("U", spacecraft.getDirection());
    }
    
    @Test
    public void testTurnDown() {
        Chandrayaan3_main spacecraft = new Chandrayaan3_main(0, 0, 0, "N");
        spacecraft.turnD();
        assertEquals("D", spacecraft.getDirection());
    }
    
   
}
