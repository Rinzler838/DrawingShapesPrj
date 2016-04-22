package shapes.view;

import javax.swing.JFrame;

import shapes.controller.DrawingController;

public class DrawingFrame extends JFrame
{
	private DrawingController drawController;
	private ShapePanel shapePanel;
	private DrawingPanel drawPanel;
	
	public DrawingFrame()
	{
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(drawPanel);
		this.setSize(800, 800);
		this.setTitle("");
		this.setResizable(false);
		this.setVisible(true);
	}
}
