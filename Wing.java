/**
 * Assignment 2 - Drones
 * @author Jean LaFrance
 * @date 02/13/2024
 * Wing class used to construct drone
 */

import java.awt.Color;
import java.awt.Dimension;
import wheels.users.Rectangle;

public class Wing {
	
	//Wing dimensions
	private static final Dimension WING_DIM = new Dimension(15, 15);
	
	//Variable declaration
	private int x;							//x coordinate
	private int y;							//y coordinate
	private int rotation;					//Wing rotation
	private Color color;					//Drone wing color
	private Rectangle wing;					//Drone wing
	
	//Default constructor
	public Wing() {
		//Initialize default values
		this.x = 95;
		this.y = 105;
		this.rotation = 45;
		this.color = java.awt.Color.white;
		this.wing = new Rectangle(x, y);
		
		//Set color
		this.wing.setColor(color);
		
		//Set size
		this.wing.setSize(WING_DIM);
		
		//Set rotation
		this.wing.setRotation(rotation);
	}
	
	//Parameterized constructor
	public Wing(int x, int y, int rotation, Color c) {
		//Initialize values
		this.x = x;
		this.y = y;
		this.rotation = rotation;
		this.color = c;
		this.wing = new Rectangle(x, y);
		
		//Set color
		this.wing.setColor(color);
		
		//Set size
		this.wing.setSize(WING_DIM);
		
		//Set rotation
		this.wing.setRotation(rotation);
	}
	
	//set drone wing location
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
		
		this.wing.setLocation(x, y);
	}
	
	//Set drone body color
	public void setColor(Color c) {
		this.color = c;
		
		this.wing.setColor(color);
	}
	
	//Get x coordinate
	public int getX() {
		return this.x;
	}
	
	//Get y coordinate
	public int getY() {
		return this.y;
	}
	
	//Get color
	public Color getColor() {
		return this.color;
	}
}
