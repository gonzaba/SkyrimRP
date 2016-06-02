import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class FactionInfoPanes {
	public static JPanel companionsInfoPane(){
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JTextArea intro = new JTextArea("The Companions. An order of warriors. They are brothers and sisters "
				+ "in honor. And show up to solve problems \n\r"
				+"if the coin is good enough. Their inner circle "
				+ "holds a wolfish secret. If you join, you will hold the title of Harbinger."
				+"\n\r\n\r\n\rIs this the faction you wish to choose?"
				+"\n\r\n\r\n\r1.Yes (Got to The Companions Storyline)"

				+"\n\r\n\r\n\r2.No");
		JFrame frame = new JFrame();
		intro.setBackground(frame.getBackground());
		panel.add(intro, BorderLayout.WEST);

		return panel;


	}
	public static JPanel darkBrotherhoodInfoPane(){
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JTextArea intro = new JTextArea("Dark Brotherhood. An order of highly trained Assasins. "
				+ "Once a contract is accepted, in they go and death is brought. "
				+ "\n\rNo amount of gold can save a person if there is an assassination contract on their head. "
				+ "Everyone knows of their \n\rties with Sithis. If you join, you will hold the title of Listener."
				+ "\n\r\n\r\n\rIs this the faction you wish to choose?"
				+ "\n\r\n\r\n\r1.Yes (Got to Dark Brotherhood Storyline)"
				+ "\n\r\n\r\n\r2.No");
		JFrame frame = new JFrame();
		intro.setBackground(frame.getBackground());
		panel.add(intro, BorderLayout.WEST);

		return panel;


	}
	public static JPanel thievesInfoPane(){
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JTextArea intro = new JTextArea("Thieves Guild. An order of professional thieves. "
				+ "Shadows are their home, and no treasure is impossible \n\rfor them to steal. "
				+ "They have three rules: No stealing from a fellow thief, No killing on the job, "
				+ "No robbing from poor. \n\rTheir inner circle protects the luck of the guild.If you join, "
				+ "you will hold the title of Guild Master."
				+ "\n\r\n\r\n\rIs this the faction you wish to choose?"
				+ "\n\r\n\r\n\r1.Yes (Got to Thieves Guild Storyline)"
				+ "\n\r\n\r\n\r2.No");
		JFrame frame = new JFrame();
		intro.setBackground(frame.getBackground());
		panel.add(intro, BorderLayout.WEST);

		return panel;


	}
}
