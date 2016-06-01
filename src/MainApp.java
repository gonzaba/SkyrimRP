import javax.swing.JFrame;

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
	}


}
