import javax.swing.JFrame;

public class Main {


	public static void main(String[] args){



		MainScreen SkyrimRP = new MainScreen();
		ScreenManager screenManager = new ScreenManager(SkyrimRP);
		SkyrimRP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		InputHandler handler = new InputHandler(screenManager);
		SkyrimRP.addKeyListener(handler);
		SkyrimRP.setVisible(true);
	}
}
