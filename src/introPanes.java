
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.TextArea;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class introPanes {

	public static JPanel menuPane() {
		GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
		gridBagConstraints1.insets = new Insets(0, 0, 0, 0);
		gridBagConstraints1.gridy = 1;
		gridBagConstraints1.anchor = GridBagConstraints.WEST;
		gridBagConstraints1.weightx = 1.0D;
		gridBagConstraints1.gridx = 5;
		GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
		gridBagConstraints2.insets = new Insets(0, 0, 0, 0);
		gridBagConstraints2.gridy = 1;
		gridBagConstraints2.anchor = GridBagConstraints.WEST;
		gridBagConstraints2.weightx = 1.0D;
		gridBagConstraints2.gridx = 3;
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		JLabel text1 = new JLabel("Press ENTER to Continue");
		JLabel img = new JLabel(new ImageIcon("Assets/SkyrimLogo.png"));
		panel.add(text1, gridBagConstraints1 );
		panel.add(img, gridBagConstraints2);
		return panel;
	}

	public static JPanel factionPane(){
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JTextArea intro = new JTextArea("The Dragonborn completed the prophecy "
				+ "and defeated Alduin, "
				+ "the World Eater. Instead of continuing his\n\radventure, "
				+ "choosing a side in the war and becoming the leader of all "
				+ "factions in Skyrim, he picked neutrality. \n\rAs he sought comfort "
				+ "in High Hrothgar and joined the Greybeards in meditation, others"
				+ " rose to fill those empty roles. \n\rWho will you become? An"
				+ " honorable warrior that fights for Honor and Glory? A"
				+ " cunning thief that no treasure is \n\rsafe from? Or an Assassin "
				+ "that thrives on blood? Choose wisely.");
		JFrame frame = new JFrame();
		intro.setBackground(frame.getBackground());

		JLabel text2 = new JLabel("Press ENTER to Continue");


		panel.add(intro, BorderLayout.EAST);
		panel.add(text2, BorderLayout.PAGE_END);

		return panel;


	}

	public static JPanel factionChoosePane() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JTextArea intro = new JTextArea("Your past is non-important as well "
				+ "as how you managed to arrive in Skyrim. You have a critical "
				+ "role to fill. \n\rThere are three factions, but you can only be "
				+ "the leader of one. \n\r\n\rChoose the faction that will write your path."

				+"\n\r\n\r\n\rA.The Companions"

				+"\n\r\n\r\n\rB.Dark Brotherhood"

				+"\n\r\n\r\n\rC.Thieves Guild"
				+"\n\r\n\r\n\r I want to learn more about... (A, B or C)");
		JFrame frame = new JFrame();
		intro.setBackground(frame.getBackground());
		panel.add(intro, BorderLayout.WEST);

		return panel;

	}
}
