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
		} else if ("E".equals(direction)) {
			x++;
		} else if ("W".equals(direction)) {
			x--;
		} else if ("U".equals(direction)) {
			z++;
		} else if ("D".equals(direction)) {
			z--;
		}
	}
	
	public void moveBackward() {
		if ("N".equals(direction)) {
			y--;
		} else if ("S".equals(direction)) {
			y++;
		} else if ("E".equals(direction)) {
			x--;
		} else if ("W".equals(direction)) {
			x++;
		} else if ("U".equals(direction)) {
			z--;
		} else if ("D".equals(direction)) {
			z++;
		}
	}
	
	public void turnLeft() {
		if ("N".equals(direction)) {
			direction = "W";
		} else if ("S".equals(direction)) {
			direction = "E";
		} else if ("E".equals(direction)) {
			direction = "N";
		} else if ("W".equals(direction)) {
			direction = "S";
		} else if ("U".equals(direction) || "D".equals(direction)) {
			// No change in horizontal direction
		}
	}
	
	public void turnRight() {
		if ("N".equals(direction)) {
			direction = "E";
		} else if ("S".equals(direction)) {
			direction = "W";
		} else if ("E".equals(direction)) {
			direction = "S";
		} else if ("W".equals(direction)) {
			direction = "N";
		} else if ("U".equals(direction) || "D".equals(direction)) {
			// No change in horizontal direction
		}
	}
	
	public void turnU() {
		if ("N".equals(direction) || "S".equals(direction)) {
			direction = "U";
		} else if ("U".equals(direction) || "D".equals(direction)) {
			// No change in vertical direction
		}
	}
	
	public void turnD() {
		if ("N".equals(direction) || "S".equals(direction)) {
			direction = "D";
		} else if ("U".equals(direction) || "D".equals(direction)) {
			// No change in vertical direction
		}
	}
}
