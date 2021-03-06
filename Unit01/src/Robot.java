//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );
      

      //call head method
      head(window);
      //call other methods
      upperBody(window);
      
      lowerBody(window);
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 100);

      
		//add more code here
      window.setColor(Color.GREEN);
      window.fillOval(350,120,20,20);
      window.fillOval(430,120,20,20);
      
      window.setColor(Color.BLACK);
      window.fillOval(385, 150, 25, 10);
      
      window.drawArc(350, 160, 100, 30, 180, 180);
   }

   public void upperBody( Graphics window )
   {
	   window.setColor(Color.BLUE);
	   window.fillRect(340, 220, 120, 80);
	   
	   window.setColor(Color.YELLOW);
	   window.drawRect(340, 220, 120, 80);

	   window.setColor(Color.BLACK);
	   window.drawLine(340, 220, 250, 180);
	   window.drawLine(460, 220, 550, 180);
   }

   public void lowerBody( Graphics window )
   {
	   
		window.setColor(Color.GRAY);
		window.fillRect(340, 320, 120, 80);
		window.setColor(Color.YELLOW);
		window.drawRect(340, 320, 120, 80);
		
		window.setColor(Color.BLACK);
		window.drawLine(340, 400, 260, 480);
		window.drawLine(460, 400, 540, 480);

   }
}