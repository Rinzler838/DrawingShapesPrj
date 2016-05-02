package shapes.view;

import javax.swing.JFrame;
import shapes.controller.DrawingController;

public class DrawingFrame extends JFrame
{
	private DrawingController baseController;
	private ShapePanel shapePanel;
	private DrawingPanel drawPanel;
	private GraphPanel graphPanel;
	
	public DrawingFrame(DrawingController baseController)
	{
		this.baseController = baseController;
		shapePanel = new ShapePanel();
		drawPanel = new DrawingPanel(baseController);
		graphPanel = new GraphPanel();
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(graphPanel);
		this.setSize(800, 800);
		this.setTitle("- Drawing Shapes with Duke in Java -");
		this.setResizable(false);
		this.setVisible(true);
	}
}
