/**
 * Assignment 2 - Drones
 * @author Jean LaFrance
 * @date 02/13/2024
 * Drone class for use in Asgn2 project
 */

import java.awt.Color;
import java.awt.Dimension;
import wheels.users.*;

public class Drone {
	
	//Wing offset to relative coordinates
	private static final int WING_Y_OFFSET = 5;			
	private static final int WING_X_OFFSET = 18;
	private static final int WING_ROTATION = 10;
	
	//Bubble offset to relative coordinates
	private static final int BUBBLE_OFFSET = 90;
	private static final Dimension BUBBLE_DIM = new Dimension(120, 75);
	
	//Variable declaration
	private int x;									//x coordinate
	private int y;									//y coordinate
	private Color color;							//Drone color
	private Body body;								//Drone body
	private Wing frontWing, rearWing;				//Drone wings
	private ConversationBubble bubble;				//Bubble allowing drones to speak
	
	//Default constructor
	public Drone() {
		//Initialize default values
		this.x = 100;
		this.y = 100;
		this.color = java.awt.Color.white;
		this.rearWing = new Wing();
		this.body = new Body();
		this.frontWing = new Wing();
		this.bubble = new ConversationBubble("Hello");
	}
	
	//Parameterized constructor with color
	public Drone(int x, int y, Color c) {
		//Initialize
		this.x = x;
		this.y = y;
		this.color = c;
		this.rearWing = new Wing(x + WING_X_OFFSET, y - WING_Y_OFFSET, 45 + WING_ROTATION, color);
		this.body = new Body(x, y, color);
		this.frontWing = new Wing(x + WING_X_OFFSET, y + WING_Y_OFFSET + 5, 45 - WING_ROTATION, color);
		this.bubble = new ConversationBubble("Hello");
		
		//Conversation bubble size/location
		this.bubble.setLocation(x - BUBBLE_OFFSET, y - BUBBLE_OFFSET);
		this.bubble.setSize(BUBBLE_DIM);
		this.bubble.hide();
	}
	
	//Parameterized constructor with color and chat message
	public Drone(int x, int y, Color c, String chat) {
		//Initialize
		this.x = x;
		this.y = y;
		this.color = c;
		this.rearWing = new Wing(x + WING_X_OFFSET, y - WING_Y_OFFSET, 45 + WING_ROTATION, color);
		this.body = new Body(x, y, color);
		this.frontWing = new Wing(x + WING_X_OFFSET, y + WING_Y_OFFSET + 5, 45 - WING_ROTATION, color);
		this.bubble = new ConversationBubble(chat);
		
		//Conversation bubble size/location
		this.bubble.setLocation(x - BUBBLE_OFFSET, y - BUBBLE_OFFSET);
		this.bubble.setSize(BUBBLE_DIM);
		this.bubble.hide();
	}
	
	//Set drone location
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
		
		this.rearWing.setLocation(x + WING_X_OFFSET, y - WING_Y_OFFSET);
		this.body.setLocation(x, y);
		this.frontWing.setLocation(x + WING_X_OFFSET, y + WING_Y_OFFSET + 5);
		this.bubble.setLocation(x - BUBBLE_OFFSET, y - BUBBLE_OFFSET);
	}
	
	//Set drone body color
	public void setColor(Color c) {
		this.color = c;
		
		this.rearWing.setColor(color);
		this.body.setColor(color);
		this.frontWing.setColor(color);
	}
	
	//Set drone conversation bubble message
	public void setMessage(String chat) {
		this.bubble.setText(chat);
	}
	
	//Show conversation bubble
	public void showChat() {
		this.bubble.show();
	}
	
	//Hide conversation bubble
	public void hideChat() {
		this.bubble.hide();
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
