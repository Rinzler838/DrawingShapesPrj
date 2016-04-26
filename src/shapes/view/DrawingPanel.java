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
	private ShapePanel shapePanel;
	
	public DrawingPanel(DrawingController baseController)
	{
		drawSquareButton = new JButton("Add Square");
		drawRectangleButton = new JButton("Add Rectangle");
		drawCircleButton = new JButton("Add Circle");
		drawTriangleButton = new JButton("Add Triangle");
		drawEllipseButton = new JButton("Add Ellipse");
		drawPolygonButton = new JButton("Add Polygon");
		shapePanel = new ShapePanel();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.BLACK);
		this.add(drawSquareButton);
		this.add(drawRectangleButton);
		this.add(drawCircleButton);
		this.add(drawTriangleButton);
		this.add(drawEllipseButton);
		this.add(drawPolygonButton);
	}
	
	private void setupLayout()
	{
		
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
