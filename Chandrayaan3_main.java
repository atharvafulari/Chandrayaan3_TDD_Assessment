package com.incubyte.Chandrayaan3_tdd;

/**
 * Hello world!
 *
 */
public class Chandrayaan3_main 
{
	private int x;
	private int y;
	private int z;
	private String direction;

//	parametirsed constructor
	public Chandrayaan3_main(int x, int y, int z, String direction) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.direction = direction;
	}
	
//	returning position of spacecraft
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

	public String getDirection() {
		return direction;
	}

	public void moveForward() {
		if ("N".equals(direction)) {
			y++;
		} else if ("S".equals(direction)) {
			y--;
		} 
	}
}
