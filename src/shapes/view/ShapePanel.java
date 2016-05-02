package shapes.view;

import java.awt.*;
import java.awt.geom.*;
import java.awt.geom.Rectangle2D.Double;
import java.util.ArrayList;

import javax.swing.JPanel;

public class ShapePanel extends JPanel
{
	private ArrayList<Rectangle> squareList;
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
		int widthHeight = (int)(Math.random() * 100);
		int xPosition = (int)(Math.random() * 800);
		int yPosition = (int)(Math.random() * 800);
		
		Rectangle square = new Rectangle(xPosition, yPosition, widthHeight, widthHeight);
		squareList.add(square);
	}
	
	public void addRectangle()
	{
		int width = (int)(Math.random() * 100);
		int height = (int)(Math.random() * 100);
		int xPosition = (int)(Math.random() * 800);
		int yPosition = (int)(Math.random() * 800);
		
		Rectangle rectangle = new Rectangle(xPosition, yPosition, width, height);
		rectangleList.add(rectangle);
	}
	
	public void addCircle()
	{
		int xPosition = (int)(Math.random() * 1000);
		int yPosition = (int)(Math.random() * 1000);
		int diameter = (int)(Math.random() * 100);
		
		Ellipse2D circle = new Ellipse2D.Double(xPosition, yPosition, diameter, diameter);
		circleList.add(circle);
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
	}
	
	public void addEllipse()
	{
		int xPoint = (int)(Math.random() * 1000);
		int yPoint = (int)(Math.random() * 1000);
		int width = (int)(Math.random() * 100);
		int height = (int)(Math.random() * 100);
		
		Ellipse2D ellipse = new Ellipse2D.Double(xPoint, yPoint, width, height);
		ellipseList.add(ellipse);
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
	}
	
	
	@Override
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		Graphics2D mainGraphics = (Graphics2D) currentGraphics;
		
		drawShapes(mainGraphics, squareList);
		drawShapes(mainGraphics, rectangleList);
		drawShapes(mainGraphics, circleList);
		drawShapes(mainGraphics, triangleList);
		drawShapes(mainGraphics, ellipseList);
		drawShapes(mainGraphics, polygonList);
	}
		
	private void drawShapes(Graphics2D mainGraphics, ArrayList shapeList)
	{
		for (Object currentShape : shapeList)
		{
			currentShape = (Shape) currentShape;
			int randomStroke = (int)(Math.random() * 15);
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			
			mainGraphics.setColor(new Color(red, green, blue));
			mainGraphics.setStroke(new BasicStroke(randomStroke));
			if (currentShape instanceof Polygon)
			{
				mainGraphics.draw((Shape) currentShape);
			}
			else
			{
				mainGraphics.fill((Shape) currentShape);
			}
		}
	}
	
	public void clear()
	{
		squareList.clear();
		rectangleList.clear();
		circleList.clear();
		ellipseList.clear();
		triangleList.clear();
		polygonList.clear();
		repaint();
	}
}
