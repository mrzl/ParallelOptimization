package ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class ImagePanel extends JPanel {
	private Image image;
		
	public ImagePanel() {
		super();
		setupImagePanel();
	}
	
	private void setupImagePanel() {
		//setSize(1200, 800);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, null);
	}
	
	public void setImage(Image image) {
		this.image = image;
		this.updateUI();
	}
	
	public void changeColor() {
		setBackground(Color.RED);
	}
}
