package drawing.view;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.JPanel;

public class ShapePanel extends JPanel
{

	
	private ArrayList<Rectangle> rectangleList;
	//more arraylists here!
	
	
	public ShapePanel()
	{
		//Random info here
		rectangleList = new ArrayList<Rectangle>();
	}
	
	public void addRectangle()
	{
		rectangleList.add(new Rectangle(10,20,50,10));
	}
	
	protected void painComponent(Graphics currentGraphics)
	{
		//Draw in here fam!!
	}
}
