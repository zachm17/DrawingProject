package drawing.view;

import java.awt.Graphics;
import javax.swing.JPanel;

public class GraphPanel extends JPanel
{
	private int[] graphSource;
	
	public GraphPanel()
	{
		//Initializes graphSource here
	}
	
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		for(int index = 0; index < graphSource.length; index++)
		{
			//Draw a rectangle for each value in array.
		}
	}
}
