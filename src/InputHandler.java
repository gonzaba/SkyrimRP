import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputHandler implements KeyListener {

	private ScreenManager screen;

	public InputHandler(ScreenManager screen){
		this.screen = screen;
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
			System.out.println(0);
			System.exit(0);
		}
		if(e.getKeyCode() == KeyEvent.VK_ENTER){
			screen.nextScreen();
			System.out.println(1);
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
