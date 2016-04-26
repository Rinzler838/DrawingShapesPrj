package shapes.view;

import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;
import javax.swing.JPanel;

public class ShapePanel extends JPanel
{
	private ArrayList <Rectangle> squareList;
	private ArrayList <Rectangle> rectangleList;
	private ArrayList <Ellipse2D> circleList;
	private ArrayList <Polygon> triangleList;
	private ArrayList <Ellipse2D> ellipseList;
	private ArrayList <Polygon> polygonList;
	
	public ShapePanel()
	{
		squareList = new ArrayList<Rectangle>();
		rectangleList = new ArrayList<Rectangle>();
		circleList = new ArrayList<Ellipse2D>();
		triangleList = new ArrayList<Polygon>();
		ellipseList = new ArrayList<Ellipse2D>();
		polygonList = new ArrayList<Polygon>();
	}
	
	public void addSquare()
	{
		repaint();
	}
	
	public void addRectangle()
	{
		repaint();
	}
	
	public void addCircle()
	{
		repaint();
	}
	
	public void addTriangle()
	{
		int [] xPoints = new int [3];
		int [] yPoints = new int [3];
		xPoints [0] = (int)(Math.random() * 800);
		xPoints = new int []{(int)(Math.random() * 800), (int)(Math.random() * 800), (int)(Math.random() * 800)};
		yPoints = new int []{(int)(Math.random() * 800), (int)(Math.random() * 800), (int)(Math.random() * 800)};
		
		Polygon triangle = new Polygon(xPoints, yPoints, 3);
		
		triangleList.add(triangle);
		repaint();
	}
	
	public void addEllipse()
	{
		repaint();
	}
	
	public void addPolygon()
	{
		int numberOfSides = (int)(Math.random() * 10) + 3;
		int [] xPoints = new int [numberOfSides];
		int [] yPoints = new int [numberOfSides];
		
		for (int sides = 0; sides < numberOfSides; sides++)
		{
			xPoints[sides] = (int)(Math.random() * 800);
			yPoints[sides] = (int)(Math.random() * 800);
		}
		
		Polygon polygon = new Polygon(xPoints, yPoints, numberOfSides);
		polygonList.add(polygon);
		repaint();
	}
	
	
	@Override
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		Graphics2D mainGraphics = (Graphics2D) currentGraphics;
		
		for (Rectangle current : squareList)
		{
			int randomStroke = (int)(Math.random() * 15);
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			mainGraphics.setColor(new Color(red, green, blue));
			mainGraphics.setStroke(new BasicStroke(randomStroke));
			mainGraphics.draw(current);
		}
		
		for (Rectangle current : rectangleList)
		{
			int randomStroke = (int)(Math.random() * 15);
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			mainGraphics.setColor(new Color(red, green, blue));
			mainGraphics.setStroke(new BasicStroke(randomStroke));
			mainGraphics.draw(current);
		}
		
		for (Ellipse2D current : circleList)
		{
			int randomStroke = (int)(Math.random() * 15);
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			mainGraphics.setColor(new Color(red, green, blue));
			mainGraphics.setStroke(new BasicStroke(randomStroke));
			mainGraphics.draw(current);
		}
		
		for (Ellipse2D current : ellipseList)
		{
			int randomStroke = (int)(Math.random() * 15);
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			mainGraphics.setColor(new Color(red, green, blue));
			mainGraphics.setStroke(new BasicStroke(randomStroke));
			mainGraphics.draw(current);
		}
		
		for (Polygon current : triangleList)
		{
			int randomStroke = (int)(Math.random() * 15);
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			mainGraphics.setColor(new Color(red, green, blue));
			mainGraphics.setStroke(new BasicStroke(randomStroke));
			mainGraphics.draw(current);
		}
		
		for ( Polygon current : polygonList)
		{
			int randomStroke = (int)(Math.random() * 15);
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			mainGraphics.setColor(new Color(red, green, blue));
			mainGraphics.setStroke(new BasicStroke(randomStroke));
			mainGraphics.draw(current);
		}
	}
}
