//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Powerup extends MovingThing
{
	private int speed;
	private String type;
	
	/**
	 * Instantiates a new powerup.
	 */
	public Powerup()
	{
		this(0,0,1);
	}

	/**
	 * Instantiates a new powerup specifying location.
	 *
	 * @param x X position of powerup
	 * @param y Y position of powerup
	 */
	public Powerup(int x, int y)
	{
		this(x,y,1);
	}

	
	/**
	 * Instantiates a new powerup specifying location and speed, and 
	 * generates random type, changing the color and effect based on
	 * the type.
	 *
	 * @param x X position of powerup
	 * @param y Y position of powerup
	 * @param s Speed of powerup
	 * 
	 * Attack speed halves the delay between shots
	 * Stun stops alien movement for 5 seconds
	 * Trishot allows shots in 3 directions
	 * Pierce increases the number of aliens each shot can hit
	 * 
	 * Effects are coded in the OuterSpace class
	 */
	public Powerup(int x, int y, int s)
	{
		
		
		super(x, y);
		speed=s;
		double random = Math.random() * 5.0;
		if(random < 1.5){
			type = "ATTACKSPEED";
		}
		else if(random < 3.0){
			type = "STUN";
		} else if(random < 4.5){
			type = "TRISHOT";
		}  else if(random < 5.0){
			type = "PIERCE";
		}
		System.out.println("rnd powerup = " + random);
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public String getType(){
		return type;
	}
	public void draw( Graphics window )
	{
		if(type == "ATTACKSPEED"){
			window.setColor(Color.ORANGE);
		} 
		if(type == "STUN"){
			window.setColor(Color.BLUE);
		}
		if(type == "TRISHOT"){
			window.setColor(Color.darkGray);
		}
		if(type == "PIERCE"){
			window.setColor(Color.RED);
		}
		window.fillRect(getX(), getY(), 20,20);
	}

	public void move(String direction) {
		if (direction.equals("DOWN")) {
			setY(getY() + speed);
		}
	}
	
	

	public String toString()
	{
		return "";
	}
}
