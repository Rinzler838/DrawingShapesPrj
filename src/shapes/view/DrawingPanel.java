package shapes.view;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import shapes.controller.DrawingController;

public class DrawingPanel extends JPanel
{
	private DrawingController baseController;
	private SpringLayout baseLayout;
	private JButton drawSquareButton;
	private JButton drawRectangleButton;
	private JButton drawCircleButton;
	private JButton drawTriangleButton;
	private JButton drawEllipseButton;
	private JButton drawPolygonButton;
	private JButton clearButton;
	private ShapePanel shapePanel;
	
	public DrawingPanel(DrawingController baseController)
	{
		baseLayout = new SpringLayout();
		drawSquareButton = new JButton("Add Square");
		
		drawRectangleButton = new JButton("Add Rectangle");
		
		drawCircleButton = new JButton("Add Circle");
		drawTriangleButton = new JButton("Add Triangle");
		drawEllipseButton = new JButton("Add Ellipse");
		drawPolygonButton = new JButton("Add Polygon");
		clearButton = new JButton("Clear");
		shapePanel = new ShapePanel();
		baseLayout.putConstraint(SpringLayout.NORTH, shapePanel, 35, SpringLayout.NORTH, this);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.WHITE);
		this.add(drawSquareButton);
		this.add(drawRectangleButton);
		this.add(drawCircleButton);
		this.add(drawTriangleButton);
		this.add(drawEllipseButton);
		this.add(drawPolygonButton);
		this.add(clearButton);
		this.add(shapePanel);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, drawSquareButton, 0, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, drawSquareButton, 0, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, drawRectangleButton, 0, SpringLayout.NORTH, drawSquareButton);
		baseLayout.putConstraint(SpringLayout.EAST, drawRectangleButton, -6, SpringLayout.WEST, drawSquareButton);
		baseLayout.putConstraint(SpringLayout.NORTH, drawCircleButton, 0, SpringLayout.NORTH, drawSquareButton);
		baseLayout.putConstraint(SpringLayout.EAST, drawCircleButton, -6, SpringLayout.WEST, drawRectangleButton);
		baseLayout.putConstraint(SpringLayout.NORTH, drawTriangleButton, 0, SpringLayout.NORTH, drawSquareButton);
		baseLayout.putConstraint(SpringLayout.EAST, drawTriangleButton, -6, SpringLayout.WEST, drawCircleButton);
		baseLayout.putConstraint(SpringLayout.NORTH, drawEllipseButton, 0, SpringLayout.NORTH, drawSquareButton);
		baseLayout.putConstraint(SpringLayout.EAST, drawEllipseButton, -6, SpringLayout.WEST, drawTriangleButton);
		baseLayout.putConstraint(SpringLayout.NORTH, drawPolygonButton, 0, SpringLayout.NORTH, drawSquareButton);
		baseLayout.putConstraint(SpringLayout.WEST, drawPolygonButton, 6, SpringLayout.EAST, clearButton);
		baseLayout.putConstraint(SpringLayout.WEST, shapePanel, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, shapePanel, 0, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, shapePanel, 0, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		drawSquareButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addSquare();
				repaint();
			}
		});	
		
		drawRectangleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addRectangle();
				repaint();
			}
		});	
		
		drawCircleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addCircle();
				repaint();
			}
		});	
		
		drawTriangleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addTriangle();
				repaint();
			}
		});	
		
		drawEllipseButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addEllipse();
				repaint();
			}
		});	
		
		drawPolygonButton.addActionListener(new ActionListener()
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
	
	@Override
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		Graphics2D mainGraphics = (Graphics2D)currentGraphics;
//		mainGraphics.setColor(Color.WHITE);
//		mainGraphics.setStroke(new BasicStroke(5));
//		mainGraphics.draw(new Rectangle(110,90,100,120));
		
		
	}
	
	
}
