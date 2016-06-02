import javax.swing.JFrame;

public class Main {


	public static void main(String[] args){


		GameLogic logic = new GameLogic();
		MainScreen SkyrimRP = new MainScreen();
		ScreenManager screenManager = new ScreenManager(SkyrimRP, logic);
		SkyrimRP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		InputHandler handler = new InputHandler(screenManager, logic);
		SkyrimRP.addKeyListener(handler);
		SkyrimRP.setVisible(true);
	}
}
