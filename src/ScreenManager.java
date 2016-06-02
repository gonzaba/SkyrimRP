import javax.swing.JFrame;
import javax.swing.JPanel;

public class ScreenManager {
	private int count= 0;
	
	JPanel[] introScreens = {introPanes.menuPane(), introPanes.factionPane()};

	private JFrame screen;


	public ScreenManager(MainScreen screen){
		this.screen = screen;
		screen.setContentPane(introScreens[count]);
	}
	
	public void nextScreen(){
		
		count++;
		screen.remove(introScreens[count-1]);
		screen.setContentPane(introScreens[count]);
		screen.setVisible(true);

		
		

		
	}
}
