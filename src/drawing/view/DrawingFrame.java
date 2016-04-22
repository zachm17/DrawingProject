package drawing.view;

import javax.swing.JFrame;

import drawing.controller.DrawingController;
import drawing.view.DrawingPanel;



public class DrawingFrame extends JFrame
	{
		private DrawingController baseController;
		private DrawingPanel basePanel;
		
	public DrawingFrame(DrawingController baseController)
		{
			this.baseController = baseController;
			basePanel = new DrawingPanel(baseController);
			setupFrame();
		}
		
		private void setupFrame()
		{
			this.setContentPane(basePanel); //Must be first line of setupFrame! - Installs the panel in the frame.
			this.setSize(800,800);		//Find a good size for the app.	
			this.setTitle("DRAW");
			this.setResizable(false);	//Advisable not required.
			this.setVisible(true);		//Must be last line of setupFrame!
		}
		
		public DrawingController getBaseController()
		{
			return baseController;
		}
	}


