package drawing.view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import drawing.controller.DrawingController;





public class DrawingPanel extends JPanel
{
	
	private DrawingController baseController;
	private SpringLayout baseLayout;
	private ShapePanel shapePanel;
	private JButton drawButton;
	private JButton clearButton;
	private JButton circleButton;
	private JButton triangleButton;
	private JButton squareButton;
	private JButton polygonButton;
	private JButton ellipseButton;
	private ArrayList<Rectangle> rectangleList;
	
	
	
	public DrawingPanel(DrawingController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		drawButton = new JButton("Draw the rectangle");
		circleButton = new JButton("Draw the circle");
		triangleButton = new JButton("Draw the triangle");
		polygonButton = new JButton("Draw the polygon");
		ellipseButton = new JButton("Draw the ellipse");
		squareButton = new JButton("Draw the sqaure");
		clearButton = new JButton("Clear");
		shapePanel = new ShapePanel();
		rectangleList = new ArrayList<Rectangle>();
		
		
		
		
		
		
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}

	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GRAY);
		this.add(drawButton);
		this.setPreferredSize(new Dimension(525, 540));
		this.add(shapePanel);
		this.add(clearButton);
		this.add(ellipseButton);
		this.add(squareButton);
		this.add(polygonButton);
		this.add(triangleButton);
		this.add(circleButton);
		
		
		
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.EAST, drawButton, -38, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, drawButton, -33, SpringLayout.NORTH, shapePanel);
		baseLayout.putConstraint(SpringLayout.NORTH, shapePanel, 273, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, shapePanel, 46, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, shapePanel, -27, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, shapePanel, -54, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, circleButton, 0, SpringLayout.EAST, ellipseButton);
		baseLayout.putConstraint(SpringLayout.WEST, ellipseButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, squareButton, 0, SpringLayout.NORTH, ellipseButton);
		baseLayout.putConstraint(SpringLayout.WEST, squareButton, 4, SpringLayout.EAST, ellipseButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, circleButton, -17, SpringLayout.NORTH, triangleButton);
		baseLayout.putConstraint(SpringLayout.NORTH, triangleButton, 0, SpringLayout.NORTH, polygonButton);
		baseLayout.putConstraint(SpringLayout.EAST, triangleButton, -40, SpringLayout.WEST, polygonButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, polygonButton, -45, SpringLayout.NORTH, drawButton);
		baseLayout.putConstraint(SpringLayout.EAST, polygonButton, 0, SpringLayout.EAST, shapePanel);
		baseLayout.putConstraint(SpringLayout.SOUTH, ellipseButton, -47, SpringLayout.NORTH, shapePanel);
		baseLayout.putConstraint(SpringLayout.NORTH, clearButton, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, clearButton, 0, SpringLayout.EAST, triangleButton);
		
		
	}
	
	private void setupListeners()
	{
		drawButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addRectangle();
				repaint();
			}
		});
	
	
	triangleButton.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent click)
		{
			shapePanel.addTriangle();
			repaint();
		}
	});
	
	circleButton.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent click)
		{
			shapePanel.addCircle();
			repaint();
		}
	});
	
	squareButton.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent click)
		{
			shapePanel.addSquare();
			repaint();
		}
	});
	
	ellipseButton.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent click)
		{
			shapePanel.addEllipse();
			repaint();
		}
	});
	
	polygonButton.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent click)
		{
			shapePanel.addPolygon();
			repaint();
		}
	});
	
	clearButton.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent click)
		{
			shapePanel.clear();
			
		}
	});
	
	
	}
		
		
	
	

	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		Graphics2D mainGraphics = (Graphics2D)currentGraphics;
		mainGraphics.setColor(Color.GREEN);
		mainGraphics.setStroke(new BasicStroke(15));
		mainGraphics.draw(new Rectangle(90,10,20,40));
		
		for (Rectangle current : rectangleList)
		{
			int randomStroke = (int)(Math.random() * 7);
			int red = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			mainGraphics.setColor(new Color(red, green, blue));
			mainGraphics.setStroke(new BasicStroke(randomStroke));
			
			mainGraphics.fill(current);
		
			
		}
	}
}
	
	

