import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Point;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;

/**
 * Lesson 4: Activity - Using Classes and Objects
 * 
 * Uses the MiniFig class to draw a custom avatar.
 * 
 * @author CS121 instructors
 * @author <you>
 */
@SuppressWarnings("serial")
public class MyAvatar extends JPanel
{
	public final int INITIAL_WIDTH = 800;
	public final int INITIAL_HEIGHT = 600;
	
	/**
	 * Draws the picture in the panel. This is where all of your
	 * code will go.
	 * @param canvas The drawing area of the window.
	 */
	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);

		/* Store the height and width of the panel at the time
		 * the paintComponent() method is called.
		 */
		// Unit Defintion
		final int UNIT = Math.min(getWidth(), getHeight()) / 20;
		int currentHeight = getHeight();
		int currentWidth = getWidth(); // @keyterm Attribute, currentWidth
		
		/* This is the anchor point for the MiniFig (x,y) -> (mid,top) */
		int mid = currentWidth / 2;
		int top = 50;
		
		/* This is the scaler that is used to calculate the dimensions (height / width) 
		 * of each of the MiniFig components. It uses the Math.min() function to select
		 * the smaller of currentWidth/INITIAL_WIDTH and currentHeight/INITIAL_HEIGHT.
		 * This way all the components are scaled to fit within the smaller of the two 
		 * panel dimensions.
		 */
		double scaleFactor = Math.min(currentWidth/(double)INITIAL_WIDTH,currentHeight/(double)INITIAL_HEIGHT );

		// TODO: 1. Instantiate a new Point object called "anchor". Use "mid" as your x value and
		//       "top" as your y value.
		Point anchor = new Point(mid, top); // @keyterm Constructor, new Point
		// TODO: 2. Instantiate a new MiniFig object and give the reference variable a name of a person, 
		//       such as "bob". Use the MiniFig constructor with the following
		//       parameters: MiniFig(g, scaleFactor, anchor)
		MiniFig Ignatius = new MiniFig(g, scaleFactor, anchor); // @keyterm instantiate an object, Minifig Ignatius
		// TODO: 3. Create a new custom Color object. An example is shown below.
		Color lightPurple = new Color (168, 134, 255);
		// TODO: 4. Invoke the setTorsoColor(Color color) method on your MiniFig instance.
		//       Use your color object as a parameter to change the shirt color.
		//       This lets you change the color of "bob's" shirt. :)
		Ignatius.setTorsoColor(lightPurple); // @keyterm method, setTorsoColor
		// TODO: 5. Invoke the draw() method on your MiniFig instance. This is where "bob" is displayed on the screen.
		Ignatius.draw();
		// TODO: 6. Adjust the size of your Avatar's window. Notice how the avatar does not stay grounded
		//       on the grass. To fix this, use the getBaseMidPoint() method to find the the base mid point of your
		//       MiniFig. This method returns a Point object that represents the x,y coordinates at the
		//       base of the MiniFig, right between its feet. 
		//       Replace the hard-coded value of grassYOffset with the y value 
		//       of the returned point.
		int grassYOffset = Ignatius.getBaseMidPoint().y;
		
		Color grassGreen = new Color (60,80,38);
		g.setColor(grassGreen);
		g.fillRect(0, grassYOffset, currentWidth, currentHeight - grassYOffset);

		// TODO: 7. Create an Alias of for your MiniFig object and change the torso color of the alias.
		//       If in step 2 you used the variable name "bob", you can create an alias named "robert"
		//       using the following:
		//       MiniFig robert = bob;
		//       robert.setTorsoColor(Color.RED);
		MiniFig Gabriel = Ignatius; // @keyterm reference variable, Gabriel
		Gabriel.setTorsoColor(Color.RED);
		
	        // TODO: 8. Comment out the draw statement under TODO item 5 and then draw the original MiniFig 
		//       below. If you used the variable name "bob" is would simply be the following:
		//       bob.draw();
		//       What color is Bob's Shirt?  Why?
		Ignatius.draw();
		// Background Scenery
		Point sunCenter = new Point(getWidth() - (2 * UNIT), getHeight() - (18 * UNIT)); // @keyterm Coordinates
		g.setColor(Color.YELLOW);
		g.drawOval(sunCenter.x, sunCenter.y, 4 * UNIT, 4 * UNIT);
		g.fillOval(sunCenter.x, sunCenter.y, 4 * UNIT, 4 * UNIT);

		Point cloudCorner = new Point(getWidth()- (4 * UNIT), getHeight() - (17 * UNIT));
		g.setColor(Color.GRAY);
		g.drawRect(cloudCorner.x, cloudCorner.y, 4 * UNIT, 2 * UNIT);
		g.fillRect(cloudCorner.x, cloudCorner.y, 4 * UNIT, 2 * UNIT);

		// Ignatius' Hat
		g.setColor(Color.BLUE);
		Point capPoint = Ignatius.getCapPoint(); // @keyterm Anchor Point
		int faceHeight = Ignatius.getFaceHeight();
		int faceWidth = Ignatius.getFaceWidth();
		int hatX = capPoint.x - faceWidth / 2;
		int hatY = capPoint.y - faceHeight / 2;
		g.fillArc(hatX, hatY, faceWidth, faceHeight, 0, 180);

		// Ignatius' Sword
		Point rightHand = Ignatius.getRightHandCenterPoint();
		g.setColor(Color.BLACK);
		Point swordHilt = new Point(rightHand.x - UNIT / 2, rightHand.y);
		Point swordTip = new Point (swordHilt.x - UNIT / 4, swordHilt.y + (2 * UNIT));
		g.fillRect(swordHilt.x, swordHilt.y, UNIT / 2, 2 * UNIT);
		g.setColor(Color.GRAY);
		g.fillRect(swordTip.x, swordTip.y, UNIT, 4 * UNIT);


	}


	private int UNIT(int i) {
		return 0;
	}


	/**
	 * Constructor (panel initialization)
	 */
	public MyAvatar()
	{
		Color duskSky = new Color (84, 107, 171); // @keyterm RGB
		setBackground(duskSky);
		setPreferredSize(new Dimension(INITIAL_WIDTH, INITIAL_HEIGHT));
	}

	/**
	 * Sets up a JFrame and the MiniFigDriver panel.
	 * @param args unused
	 */
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("MyAvatar");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new MyAvatar());
		frame.pack();
		frame.setVisible(true);
	}
}
