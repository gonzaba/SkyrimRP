import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputHandler implements KeyListener {

	private ScreenManager screen;
	private GameLogic logic;

	public InputHandler(ScreenManager screen, GameLogic logic){
		this.screen = screen;
		this.logic = logic;
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
			System.out.println(0);
			System.exit(0);
		}
		if(logic.isAtIntro() && e.getKeyCode() == KeyEvent.VK_ENTER ){
			screen.nextScreen(null);
			System.out.println(1);
		}
		if(logic.isAtFactionInfo()|| logic.isReadingFaction()){
			screen.nextScreen(e);
		}


	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
