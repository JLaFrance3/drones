/**
 * Assignment 2 - Drones
 * @author Jean LaFrance
 * @date 02/13/2024
 * Create two drone instances that converse. Program
 * created with the intent to practice classes and methods.
 */

import wheels.users.*;

public class Asgn2 extends wheels.users.Frame{

	private Drone drone1, drone2;		//Drones
	private Rectangle ground;			//Ground used in background
	private Ellipse sun;				//Sun used in background
	
	public Asgn2() {
		//Initialization
		sun = new Ellipse(java.awt.Color.yellow);
		ground = new Rectangle(java.awt.Color.green);
		drone1 = new Drone(600, 350, java.awt.Color.red, "Hello!");
		drone2 = new Drone(500, 200, java.awt.Color.blue, "What's up!");
		
		//Location
		ground.setLocation(0, 400);
		sun.setLocation(500, 10);
		
		//Size
		ground.setSize(800, 800);
		sun.setSize(100, 100);
		
		//Drone flight loop until drone2 leaves frame
		while(drone2.getX() + 50 > 0) {
			
			//Sleep 500 milliseconds
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println("Unexpected error");
			}
			
			//Update drone location
			drone1.setLocation(drone1.getX() - 50, drone1.getY());
			drone2.setLocation(drone2.getX() - 30, drone2.getY());
			
			//Drone1 message
			if(drone1.getX() > drone2.getX() + 10) {
				drone1.showChat();
			}
			else {
				drone1.hideChat();
			}
			
			//Drone2 message
			if(drone2.getX() > drone1.getX()) {
				drone2.showChat();
			}
			else {
				drone2.hideChat();
			}
		}
	}
	
	//Main method
	public static void main(String[] args) {
		new Asgn2();
		
	}

}
