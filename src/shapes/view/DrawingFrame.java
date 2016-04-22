package shapes.view;

import javax.swing.JFrame;
import shapes.controller.DrawingController;

public class DrawingFrame extends JFrame
{
	private DrawingController baseController;
	private ShapePanel shapePanel;
	private DrawingPanel drawPanel;
	
	public DrawingFrame(DrawingController baseController)
	{
		this.baseController = baseController;
		shapePanel = new ShapePanel(baseController);
		drawPanel = new DrawingPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(drawPanel);
		this.setSize(800, 800);
		this.setTitle("- Drawing Shapes with Duke in Java -");
		this.setResizable(false);
		this.setVisible(true);
	}
}
