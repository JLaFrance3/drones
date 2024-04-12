/**
 * Assignment 2 - Drones
 * @author Jean LaFrance
 * @date 02/13/2024
 * Body class used to construct Drone
 */

import java.awt.Color;
import java.awt.Dimension;
import wheels.users.Ellipse;
import wheels.users.RoundedRectangle;

public class Body {
	
	private static final int TAIL_OFFSET = 36;			//Offset between tail and fuselage
	private static final int TAIL_ROTATION = 50;		//Tail rotation
	
	//Fuselage and tail dimensions
	private static final Dimension FUSELAGE_DIM = new Dimension(50, 20);
	private static final Dimension TAIL_DIM = new Dimension(12, 12);
	
	//Variable declaration
	private int x;								//x coordinate
	private int y;								//y coordinate
	private Color color;						//Drone body color
	private RoundedRectangle tail;				//Drone tail
	private Ellipse fuselage;					//Drone fuselage
	
	//Default constructor
	public Body() {
		//Initialize default values
		this.x = 100;
		this.y = 100;
		this.color = java.awt.Color.white;
		this.tail = new RoundedRectangle(x + TAIL_OFFSET, y);
		this.fuselage = new Ellipse(x, y);
		
		//Set color
		this.tail.setColor(color);
		this.fuselage.setColor(color);
		
		//Set size
		this.tail.setSize(TAIL_DIM);
		this.fuselage.setSize(FUSELAGE_DIM);
		
		//Set rotation
		this.tail.setRotation(TAIL_ROTATION);
	}
	
	//Parameterized constructor
	public Body(int x, int y, Color c) {
		//Initialize values
		this.x = x;
		this.y = y;
		this.color = c;
		this.tail = new RoundedRectangle(x + TAIL_OFFSET, y);
		this.fuselage = new Ellipse(x, y);
		
		//Set color
		this.tail.setColor(color);
		this.fuselage.setColor(color);
		
		//Set size
		this.tail.setSize(TAIL_DIM);
		this.fuselage.setSize(FUSELAGE_DIM);
		
		//Set rotation
		this.tail.setRotation(TAIL_ROTATION);
	}
	
	//set drone body location
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
		
		this.tail.setLocation(x + TAIL_OFFSET, y);
		this.fuselage.setLocation(x, y);
	}
	
	//Set drone body color
	public void setColor(Color c) {
		this.color = c;
		
		this.tail.setColor(color);
		this.fuselage.setColor(color);
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
