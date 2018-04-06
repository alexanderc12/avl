package views;

import javax.swing.JFrame;

public class MainWindow extends JFrame{

	public MainWindow() {
		setTitle("Ventana Principal");
		setVisible(false);
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}