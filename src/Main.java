import javax.swing.JFrame;

public class Main {

	public static void main(String[] args){
		MainApp SkyrimRP = new MainApp();
		SkyrimRP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		InputHandler handler = new InputHandler();
		SkyrimRP.addKeyListener(handler);
		SkyrimRP.setVisible(true);
	}
}
