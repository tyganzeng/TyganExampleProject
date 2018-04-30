//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private double size;
	private int hp;
	private Image image;

	public Alien()
	{
		this(100,100,1,1,1.0);
	}

	public Alien(int x, int y)
	{
		this(x,y,0,1,1.0);
	}

	
	public Alien(int x, int y, int s, int h, double si)
	{
		super(x, y);
		speed=s;
		hp = h;
		size = si;
		try
		{
			image = ImageIO.read(new File("C:\\Users\\zengt9949\\Desktop\\APCSA-Tygan\\Unit17\\src\\alien.jpg"));
		}
		catch(Exception e)
		{
			System.out.println("alien not found");
		}
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}
	
	
	public int getHp(){
		return hp;
	}
	

	public void loseHp(){
		hp = hp - 1;
	}

	public void move(String direction){
		super.move(direction);
	}
	
	public double getSize(){
		return size;
	}
	
	public void draw( Graphics window )
	{
		window.drawImage(image, getX(), getY(), (int) Math.floor(40*size), (int) Math.floor(40*size), null);
	}

	public String toString()
	{
		return super.toString() + " Speed is " + getSpeed();
	}
	
	
}
