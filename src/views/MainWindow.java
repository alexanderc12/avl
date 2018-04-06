package views;

import java.awt.Color;

import javax.swing.JFrame;

public class MainWindow extends JFrame{

	public MainWindow() {
		setTitle("Ventana Principal");
		setVisible(false);
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.getContentPane().setBackground(Color.DARK_GRAY);
		
		setVisible(true);
		
	}
	
}