import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


/**
 * CS 121 Project 0: Traffic Animation
 *
 * Animates a maroon chevy impala driving through the desert on a night wth a full moon, while passing a bystander and cacti
 *
 * @author Bryce Younger
 */
@SuppressWarnings("serial")
public class TrafficAnimation extends JPanel
{
	// This is where you declare constants and variables that need to keep their
	// values between calls	to paintComponent(). Any other variables should be
	// declared locally, in the method where they are used.

	/**
	 * A constant to regulate the frequency of Timer events.
	 * Note: 100ms is 10 frames per second - you should not need
	 * a faster refresh rate than this
	 */
	private final int DELAY = 100; //milliseconds

	/**
	 * The anchor coordinate for drawing / animating. All of your vehicle's
	 * coordinates should be relative to this offset value.
	 */
	private int xOffset = 0;

	/**
	 * The number of pixels added to xOffset each time paintComponent() is called.
	 */
	private int stepSize = 10;

	
	private final Color NIGHT_SKY = new Color (0, 0, 30);
	Color nightDesert = new Color (54, 34, 12);
	Color maroon = new Color (110, 0, 0);
	Color carWindow = new Color (0, 37, 21);
	Color cactiGreen = new Color (51, 102, 0);
	Color moonYellow = new Color (254, 252, 215);
	Color tan = new Color (255, 235, 205);

	/* This method draws on the panel's Graphics context.
	 * This is where the majority of your work will be.
	 *
	 * (non-Javadoc)
	 * @see java.awt.Container#paint(java.awt.Graphics)
	 */
	public void paintComponent(Graphics g)
	{
		// Get the current width and height of the window.
		int width = getWidth(); // panel width
		int height = getHeight(); // panel height

		// Fill the graphics page with the background color.
		g.setColor(NIGHT_SKY);
		g.fillRect(0, 0, width, height);

		// Fills in the road
		g.setColor(Color.black);
		g.fillRect(0, (height / 4), width, (height / 2));

		// Fills in the road markers
		g.setColor(Color.yellow);
		g.fillRect((width / 18), ((height / 5) * 2), (width / 9), (height / 20));
		g.fillRect((width / 3), ((height / 5) * 2), (width / 9), (height / 20));
		g.fillRect(((width / 18) * 11), ((height / 5) * 2), (width / 9), (height / 20));
		g.fillRect(((width / 9) * 8), ((height / 5) * 2), (width / 9), (height / 20));

		// Fills in desert floor
		g.setColor(nightDesert);
		g.fillRect(0, ((height / 4) * 3), width, (height / 4));

		// Calculate the new xOffset position of the moving object.
		xOffset  = (xOffset + stepSize) % width;

		// This draws a maroon chevy Impala circa. 2008
		int tailLightW = height/20;
		int tailLightH = tailLightW; 
		int tailLightX = xOffset;
		int tailLightY = height/2 - tailLightW/2;
		
		Polygon tailLight = new Polygon();
		tailLight.addPoint(tailLightX, tailLightY);
		tailLight.addPoint(tailLightX, (tailLightY + tailLightH));
		tailLight.addPoint((tailLightX + tailLightW), (tailLightY + tailLightH));

		// Draws the tail light
		g.setColor(Color.red);
		g.fillPolygon(tailLight);

		g.setColor(Color.white);
		g.fillRect(tailLightX, (tailLightY + tailLightH), tailLightW, (height / 50));

		// Draws remainder of car rear
		g.setColor(maroon);
		g.fillArc((tailLightX - (tailLightW / 2)), ((tailLightY + tailLightH) + (height / 50)), tailLightW, (tailLightH * 2), 90, 180);
		g.fillRect(tailLightX, ((tailLightY + tailLightH) + (height / 50)), (tailLightW * 3), (tailLightH * 2));

		Polygon upperCarRear = new Polygon();
		upperCarRear.addPoint(tailLightX, tailLightY);
		upperCarRear.addPoint((tailLightX + tailLightW), (tailLightY + tailLightH));
		upperCarRear.addPoint((tailLightX + tailLightW), ((tailLightY + tailLightH) + (height / 50)));
		upperCarRear.addPoint((tailLightX + (tailLightW * 3)), ((tailLightY + tailLightH) + (height / 50)));
		upperCarRear.addPoint((tailLightX + (tailLightW * 3)), tailLightY);
		g.fillPolygon(upperCarRear);

		// Draws mid-section of car
		g.fillArc((tailLightX + (tailLightW * 3)), (tailLightY - tailLightH - (height / 50)), (tailLightW * 9), (tailLightH * 3), 0,180);

		g.fillRect((tailLightX + (tailLightW * 3)), tailLightY, (tailLightW * 12), ((tailLightH * 3) + (height / 50)));

		// Draws gray wheels of the car white white tires
		g.setColor(Color.black);
		g.fillArc((tailLightX + (tailLightW * 3)), ((tailLightY + (tailLightH * 2)) + (tailLightH / 50)), (tailLightW * 3), (tailLightH * 3), 0, 180);
		g.fillArc((tailLightX + (tailLightW * 12)), ((tailLightY + (tailLightH * 2)) + (tailLightH / 50)), (tailLightW * 3), (tailLightH * 3), 0, 180);

		g.setColor(Color.white);
		g.fillOval((tailLightX + (tailLightW * 3) + (tailLightW / 2)), ((tailLightY + (tailLightH * 2)) + (tailLightH / 20)), (tailLightW * 2), (tailLightH * 2));
		g.fillOval((tailLightX + (tailLightW * 12) + (tailLightW / 2)), ((tailLightY + (tailLightH * 2)) + (tailLightH / 20)), (tailLightW * 2), (tailLightH * 2));

		g.setColor(Color.gray);
		g.fillOval((tailLightX + (tailLightW * 3) + ((tailLightW / 5) * 4)), ((tailLightY + (tailLightH * 2)) + (tailLightH / 4)), ((tailLightW / 3) * 5), ((tailLightH / 3) * 5));
		g.fillOval((tailLightX + (tailLightW * 12) + ((tailLightW / 5) * 4)), ((tailLightY + (tailLightH * 2)) + (tailLightH / 4)), ((tailLightW / 3) * 5), ((tailLightH / 3) * 5));

		// Draws front end of car
		g.setColor(maroon);
		g.fillArc(tailLightX + (tailLightW * 14), (tailLightY - (tailLightH / 7)), (tailLightW * 3), tailLightH, 330, 210);
		g.fillRect(tailLightX + (tailLightW * 15), tailLightY, ((tailLightW / 2) * 3), ((tailLightH * 3) + (height / 50)));

		g.setColor(Color.white);
		g.fillRect(tailLightX + (tailLightW * 15), (tailLightY + (tailLightH / 2)), ((tailLightW / 2) * 3), tailLightH);

		g.setColor(Color.orange);
		g.fillRect(tailLightX + (tailLightW * 15) + (tailLightW / 8), (tailLightY + ((tailLightH / 3) * 2)), ((tailLightW / 6) * 9), ((tailLightH / 6) * 5));

		// Draws light from headlights
		Polygon headLight = new Polygon();
		headLight.addPoint(tailLightX + (tailLightW * 16), (tailLightY + (tailLightH / 2)));
		headLight.addPoint(tailLightX + (tailLightW * 24), (tailLightY - tailLightH));
		headLight.addPoint(tailLightX + (tailLightW * 24), (tailLightY + (tailLightH * 3)));
		headLight.addPoint(tailLightX + (tailLightW * 16), (tailLightY + ((tailLightH / 2) * 3)));
		g.fillPolygon(headLight);

		// Draws doors and windows
		g.setColor(carWindow);
		g.fillArc((tailLightX + (tailLightW * 4)), (tailLightY - tailLightH), (tailLightW * 7), (tailLightH * 2), 0,180);

		g.setColor(Color.black);
		g.drawArc(tailLightX + (tailLightW * 6), ((tailLightY + tailLightH) + (height / 50) - (tailLightH / 2)), tailLightW, (tailLightH / 2), 0, 180);
		g.drawLine(tailLightX + (tailLightW * 6), ((tailLightY + tailLightH) + (height / 50) - (tailLightH / 4)), tailLightX + (tailLightW * 7), ((tailLightY + tailLightH) + (height / 50) - (tailLightH / 4)));
		g.drawArc(tailLightX + (tailLightW * 8), ((tailLightY + tailLightH) + (height / 50) - (tailLightH / 2)), tailLightW, (tailLightH / 2), 0, 180);
		g.drawLine(tailLightX + (tailLightW * 8), ((tailLightY + tailLightH) + (height / 50) - (tailLightH / 4)), tailLightX + (tailLightW * 9), ((tailLightY + tailLightH) + (height / 50) - (tailLightH / 4)));

		g.drawLine(tailLightX + (tailLightW * 4), tailLightY, tailLightX + ((tailLightW / 2) * 13), tailLightY + (tailLightH * 3));
		g.drawLine(tailLightX + ((tailLightW / 2) * 13), tailLightY + (tailLightH * 3), tailLightX + (tailLightW * 10), tailLightY + (tailLightH * 3));
		g.drawLine(tailLightX + (tailLightW * 10), tailLightY + (tailLightH * 3), tailLightX + (tailLightW * 11), tailLightY);

		// Draws cacti
		g.setColor(cactiGreen);
		g.fillRect((width / 5), ((height / 16) * 11), (width / 20), ((height / 16) * 5));
		g.fillRect((width / 6), ((height / 16) * 13), (width / 20), (height / 16));
		g.fillRect((width / 4), ((height / 16) * 13), (width / 20), (height / 16));
		g.fillRect((width / 7), ((height / 16) * 11), (width / 30), ((height / 16) * 3));
		g.fillRect(((width / 7) * 2), ((height / 16) * 11), (width / 30), ((height / 16) * 3));
		
		g.fillRect(((width / 5) * 4), ((height / 16) * 11), (width / 20), ((height / 16) * 5));
		g.fillRect(((width / 6) * 5), ((height / 16) * 13), (width / 20), (height / 16));
		g.fillRect(((width / 4) * 3), ((height / 16) * 13), (width / 20), (height / 16));
		g.fillRect(((width / 8) * 7), ((height / 16) * 11), (width / 30), ((height / 16) * 3));
		g.fillRect(((width / 4) * 3), ((height / 16) * 11), (width / 30), ((height / 16) * 3));

		// Draws moon and stars
		g.setColor(moonYellow);
		g.fillOval((width / 6), (height / 30), (width / 10), (height / 8));

		g.setColor(Color.white);
		g.fillOval((width / 3), (height / 20), (width / 100), (height / 80));
		g.fillOval((width / 7), (height / 30), (width / 100), (height / 80));
		g.fillOval((width / 8), (height / 10), (width / 100), (height / 80));
		g.fillOval((width / 2), (height / 8), (width / 100), (height / 80));
		g.fillOval(((width / 4) * 3), (height / 9), (width / 100), (height / 80));
		g.fillOval(((width / 3) * 2), (height / 12), (width / 100), (height / 80));
		g.fillOval(((width / 6) * 5), (height / 6), (width / 100), (height / 80));
		g.fillOval(((width / 12) * 11), (height / 14), (width / 100), (height / 80));
		g.fillOval(((width / 5) * 2), (height / 5), (width / 100), (height / 80));
		g.fillOval((width / 15), (height / 5), (width / 100), (height / 80));

		// Creates bi-stander in between cacti
		g.setColor(tan);
		g.fillOval((width / 2), ((height / 5) * 4), (width / 20), (height / 16));
		
		g.setColor(maroon);
		g.drawLine(((width / 2) + (width / 40)), ((height / 8) * 7 + (height / 16)), ((width / 2) + (width / 40)), ((height / 48) * 43));
		g.setColor(Color.blue);
		g.drawLine(((width / 2) + (width / 40)), ((height / 8) * 7 + (height / 16)), ((width / 2) + (width / 20)), ((height / 100) * 99));
		g.drawLine(((width / 2) + (width / 40)), ((height / 8) * 7 + (height / 16)), (width / 2), ((height / 100) * 99));
		g.setColor(tan);
		g.drawLine(((width / 2) + (width / 40)), ((height / 8) * 7 + (height / 32)), ((width / 2) + (width / 17)), ((height / 25) * 22));
		g.drawLine(((width / 2) + (width / 40)), ((height / 8) * 7 + (height / 32)), ((width / 2) - (width / 100)), ((height / 25) * 22));

		// Draws Dostoevsky quote
		g.setColor(Color.white);
		g.drawString("\"The darker the night, the brighter the stars, the deeper the grief, the closer is God!\" - Fyodor Dostoevsky", (width / 7), (height / 3));

		// TODO: Use width, height, and xOffset to draw your scalable objects
		// at their new positions on the screen




		// Put your code above this line. This makes the drawing smoother.
		Toolkit.getDefaultToolkit().sync();
	}


	//==============================================================
	// You don't need to modify anything beyond this point.
	//==============================================================


	/**
	 * Starting point for this program. Your code will not go in the
	 * main method for this program. It will go in the paintComponent
	 * method above.
	 *
	 * DO NOT MODIFY this method!
	 *
	 * @param args unused
	 */
	public static void main (String[] args)
	{
		// DO NOT MODIFY THIS CODE.
		JFrame frame = new JFrame ("Traffic Animation");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new TrafficAnimation());
		frame.pack();
		frame.setVisible(true);
	}

	/**
	 * Constructor for the display panel initializes necessary variables.
	 * Only called once, when the program first begins. This method also
	 * sets up a Timer that will call paint() with frequency specified by
	 * the DELAY constant.
	 */
	public TrafficAnimation()
	{
		// Do not initialize larger than 800x600. I won't be able to
		// grade your project if you do.
		int initWidth = 600;
		int initHeight = 400;
		setPreferredSize(new Dimension(initWidth, initHeight));
		this.setDoubleBuffered(true);

		//Start the animation - DO NOT REMOVE
		startAnimation();
	}

	/**
	 * Create an animation thread that runs periodically.
	 * DO NOT MODIFY this method!
	 */
	private void startAnimation()
	{
		ActionListener timerListener = new TimerListener();
		Timer timer = new Timer(DELAY, timerListener);
		timer.start();
	}

	/**
	 * Repaints the graphics panel every time the timer fires.
	 * DO NOT MODIFY this class!
	 */
	private class TimerListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
	}
}
