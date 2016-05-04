package drawing.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JPanel;


public class GraphPanel extends JPanel
{
	private int[] graphSource;
	
	public GraphPanel()
	{
		graphSource = new int[] {162, 33, 213, 20, 88, 273};
		setupPanel();
		//Initializes graphSource here
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.LIGHT_GRAY);
	}
	
	@Override
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		
		Graphics2D mainGraphics = (Graphics2D) currentGraphics;
				
		for(int index = 0; index < graphSource.length; index++)
		{
			//Change these around to edit the look of the graph
			int height = this.getHeight()/graphSource.length;
			int width = graphSource[index];
			int xPosition = 0;
			int yPosition = height * index;
			
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int alpha = (int)(Math.random() * 255);
			
			mainGraphics.setColor(new Color(red, green, blue, alpha));
			
			mainGraphics.fill(new Rectangle(xPosition, yPosition, width, height));
		}
	}
}
