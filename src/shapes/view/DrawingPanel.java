package shapes.view;

import java.awt.*;
import java.awt.event.*;
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
//	private JButton drawButton;
//	private ArrayList <Square> squareList;
	private ArrayList <Rectangle> rectangleList;
//	private ArrayList <Circle> circleList;
//	private ArrayList <Triangle> triangleList;
//	private ArrayList <> List;
	
	
	public DrawingPanel(DrawingController baseController)
	{
		drawSquareButton = new JButton("Square");
		drawRectangleButton = new JButton("Rectangle");
		drawCircleButton = new JButton("Circle");
		drawTriangleButton = new JButton("Triangle");
		drawEllipseButton = new JButton("Ellipse");
//		drawButton = new JButton("");
//		squareList = new ArrayList<Square>();
		rectangleList = new ArrayList<Rectangle>();
//		circleList = new ArrayList<Circle>();
//		triangleList = new ArrayList<Triangle>();
//		List = new ArrayList<>();
		
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
		//this.add(drawButton);
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
				
			}
		});	
		
		drawRectangleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				int xPosition = (int)(Math.random() * 800);
				int yPosition = (int)(Math.random() * 800);
				int width = (int)(Math.random() * 100);
				int height = (int)(Math.random() * 150);
				
				rectangleList.add(new Rectangle(xPosition, yPosition, width, height));
				repaint();
			}
		});	
		
		drawCircleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});	
		
		drawTriangleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});	
		
		drawEllipseButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});	
		
//		drawButton.addActionListener(new ActionListener()
//		{
//			public void actionPerformed(ActionEvent click)
//			{
//				
//			}
//		});	
	}
	
	@Override
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		Graphics2D mainGraphics = (Graphics2D)currentGraphics;
		mainGraphics.setColor(Color.WHITE);
		mainGraphics.setStroke(new BasicStroke(5));
		mainGraphics.draw(new Rectangle(110,90,100,120));
		
		for (Rectangle current : rectangleList)
		{
			int randomStroke = (int)(Math.random() * 7);
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			mainGraphics.setColor(new Color(red, green, blue));
			mainGraphics.setStroke(new BasicStroke(randomStroke));
			
			mainGraphics.fill(current);
		}
	}
}
