package TicTacToe;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class catGame extends JFrame implements ActionListener{
	
	static JFrame cat;
	
	JLabel endGame = new JLabel("Cat Game!", SwingConstants.CENTER);
	JButton restart = new JButton("Restart");
	
	JPanel over = new JPanel();
	
	Font newfont = new Font("Arial", Font.BOLD, 60);

	public catGame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(over);
		over.setLayout(new BorderLayout());
		
		over.add(endGame, BorderLayout.CENTER);
		over.add(restart, BorderLayout.SOUTH);
		
		endGame.setFont(newfont);
		restart.setFont(newfont);
		
		setSize(750,750);
		setVisible(true);
	
		restart.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent a) {
		Object source = a.getSource();
		if (source == restart) {
			startScreen.start = new startScreen();
		}
	}
}
