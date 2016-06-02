import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class ScreenManager {


	JPanel[] introScreens = {introPanes.menuPane(), introPanes.factionPane(), introPanes.factionChoosePane()};
	JPanel[] factionInfoScreens = {FactionInfoPanes.companionsInfoPane(), FactionInfoPanes.darkBrotherhoodInfoPane(), FactionInfoPanes.thievesInfoPane()};


	private JFrame screen;

	private GameLogic logic;


	public ScreenManager(MainScreen screen, GameLogic logic){
		this.screen = screen;
		this.logic = logic;
		screen.setContentPane(introScreens[logic.getCount()]);
	}




	public void nextScreen(KeyEvent key){

		if(logic.isAtIntro()){
			logic.setCount(logic.getCount()+1);
			screen.remove(introScreens[logic.getCount()-1]);
			screen.setContentPane(introScreens[logic.getCount()]);
			screen.setVisible(true);
			if(!(logic.getCount() < 2)){
				logic.setAtIntro(false);
				logic.setAtFactionInfo(true);
				logic.setCount(0);
				return;
			}

		}
		if(logic.isAtFactionInfo()){
			if(key.getKeyCode() == KeyEvent.VK_A){
				screen.remove(introPanes.factionChoosePane());
				screen.setContentPane(factionInfoScreens[0]);
				screen.setVisible(true);
				logic.setAtFactionInfo(false);
				logic.setReadingFaction(true);

			}
			if(key.getKeyCode() == KeyEvent.VK_B){
				screen.remove(introPanes.factionChoosePane());
				screen.setContentPane(factionInfoScreens[1]);
				screen.setVisible(true);
				logic.setAtFactionInfo(false);
				logic.setReadingFaction(true);


			}
			if(key.getKeyCode() == KeyEvent.VK_C){
				screen.remove(introPanes.factionChoosePane());
				screen.setContentPane(factionInfoScreens[2]);
				screen.setVisible(true);
				logic.setAtFactionInfo(false);
				logic.setReadingFaction(true);


			}
		}
		if(logic.isReadingFaction()){
			if(key.getKeyCode() == KeyEvent.VK_1){
				System.out.println("JUMPING TO STORYLINE.. ENDING PROGRAM UNTIL NEXT PATCH...");
				System.exit(0);
			}
			if(key.getKeyCode() == KeyEvent.VK_2){
				System.out.println(5);
				screen.remove(screen.getContentPane());
				logic.setReadingFaction(false);
				logic.setAtFactionInfo(true);
				screen.setContentPane(introScreens[2]);
				screen.setVisible(true);
			}
		}

	}
}
