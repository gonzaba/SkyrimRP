import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainScreen extends JFrame {

	private final String TITLE = "Skyrim RP";
	private final int WIDTH = 640;
	private final int HEIGHT = 480;



	public MainScreen(){
		super();
		init();

	}

	private void init(){
		this.setSize(WIDTH, HEIGHT);
		this.setTitle(TITLE);
		this.setResizable(false);

	}







}
