package shapes.view;

import java.awt.Color;
import javax.swing.JPanel;
import shapes.controller.DrawingController;

public class DrawingPanel extends JPanel
{
	private DrawingController drawController;
	
	public DrawingPanel()
	{
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.BLUE);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
