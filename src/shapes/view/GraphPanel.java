package shapes.view;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.JPanel;

public class GraphPanel extends JPanel
{
	private int [] graphSource;
	private ArrayList <Rectangle> rectangleList;
	
	public GraphPanel()
	{
		rectangleList = new ArrayList<Rectangle>();
		graphSource = new int[15];
		graphSource [0] = 52;
		graphSource [1] = 89;
		graphSource [2] = 12;
		graphSource [3] = 48;
		graphSource [4] = 86;
		graphSource [5] = 97;
		graphSource [6] = 35;
		graphSource [7] = 17;
		graphSource [8] = 26;
		graphSource [9] = 62;
		graphSource [10] = 91;
		graphSource [11] = 60;
		graphSource [12] = 30;
		graphSource [13] = 56;
		graphSource [14] = 14;
	}
	
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		Graphics2D mainGraphics = (Graphics2D) currentGraphics;
		
		for (int index = 0; index < graphSource.length; index++)
		{
			int width = graphSource[index] * 5;
			int height = 50;
			int xPosition = 5;
			int yPosition = index * 80;
			
			Rectangle rectangle = new Rectangle(xPosition, yPosition, width, height);
			rectangleList.add(rectangle);
			
			for (Rectangle currentShape : rectangleList)
			{
				currentShape = (Rectangle) currentShape;
				int red = (int)(Math.random() * 256);
				int blue = (int)(Math.random() * 256);
				int green = (int)(Math.random() * 256);
				
				mainGraphics.setColor(new Color(red, green, blue));
				if (currentShape instanceof Rectangle)
				{
					mainGraphics.fill((Shape) currentShape);
				}
			}
		}
		System.out.println("Array Displayed: 52, 89, 12, 48, 86, 97, 35, 17, 26, 62, 97, 60, 30, 56, 14");
	}
}
