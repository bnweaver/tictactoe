package TicTacToe;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import TicTacToe.tictactoe;

public class gameOver extends JFrame implements ActionListener{
	
	static JFrame winner;
	static String win = "";
	
	JLabel playerWin = new JLabel(win + "'s: You Won!", SwingConstants.CENTER);
	JButton restart = new JButton("Restart");
	
	JPanel over = new JPanel();
	
	Font newfont = new Font("Arial", Font.BOLD, 60);

	public gameOver() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(over);
		over.setLayout(new BorderLayout());
		
		over.add(playerWin, BorderLayout.CENTER);
		over.add(restart, BorderLayout.SOUTH);
		
		playerWin.setFont(newfont);
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
