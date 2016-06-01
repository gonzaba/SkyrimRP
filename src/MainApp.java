import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainApp extends JFrame {

	private final String TITLE = "Skyrim RP";
	private final int WIDTH = 640;
	private final int HEIGHT = 480;


	public MainApp(){
		super();
		init();
	}

	private void init(){
		this.setSize(WIDTH, HEIGHT);
		this.setTitle(TITLE);
		this.setResizable(false);
		this.setContentPane(introPane());
	}

	private JPanel introPane() {
		JPanel introPanel = new JPanel();
		introPanel.setLayout(new BorderLayout());
		JLabel text1 = new JLabel("Press ENTER to Continue");
		JLabel img = new JLabel(new ImageIcon("Assets/SkyrimLogo.png"));
		
		introPanel.add(text1, BorderLayout.EAST );
		introPanel.add(img, BorderLayout.WEST);
		return introPanel;
	}


}
