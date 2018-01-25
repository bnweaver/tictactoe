package TicTacToe;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import TicTacToe.gameOver;
import TicTacToe.catGame;

@SuppressWarnings("serial")
public class tictactoe extends JFrame implements ActionListener {

	public String[] choices = { "", "x", "o" };
	
	static JFrame board;
	
	JPanel panel = new JPanel();
	JPanel buttons = new JPanel(new GridLayout(3,3,2,2));
	
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	JButton b5 = new JButton();
	JButton b6 = new JButton();
	JButton b7 = new JButton();
	JButton b8 = new JButton();
	JButton b9 = new JButton();
	
	JPanel players = new JPanel(new FlowLayout());
	JLabel play = new JLabel("Player One Goes First");
	
	String oneplayer;
	String twoplayer;
	
	Font newfont = new Font("Arial", Font.BOLD, 60);
	static int count = 0;
	
	
	public tictactoe() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(panel);
		panel.setLayout(new BorderLayout());
		
		panel.add(buttons, BorderLayout.CENTER);
		buttons.add(b1);
		buttons.add(b2);
		buttons.add(b3);
		buttons.add(b4);
		buttons.add(b5);
		buttons.add(b6);
		buttons.add(b7);
		buttons.add(b8);
		buttons.add(b9);
		
		panel.add(players, BorderLayout.SOUTH);
		players.add(play);
		
		play.setFont(newfont);
		
		b1.setFont(newfont);
		b2.setFont(newfont);
		b3.setFont(newfont);
		b4.setFont(newfont);
		b5.setFont(newfont);
		b6.setFont(newfont);
		b7.setFont(newfont);
		b8.setFont(newfont);
		b9.setFont(newfont);	
		
		setSize(750,800);
		setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);

	}

	public void actionPerformed(ActionEvent a) {
		Object source = a.getSource();
		String player = play.getText();
		
		if (source == b1) {
			if (player.contains("One")) {
				b1.setText(startScreen.firstPlayer);
				play.setText("Player Two: Your Turn");
			}
			if (player.contains("Two")) {
				b1.setText(startScreen.secondPlayer);
				play.setText("Player One: Your Turn");
			}
			checkBoard();
		}
		if (source == b2) {
			if (player.contains("One")) {
				b2.setText(startScreen.firstPlayer);
				play.setText("Player Two: Your Turn");
			}
			if (player.contains("Two")) {
				b2.setText(startScreen.secondPlayer);
				play.setText("Player One: Your Turn");
			}
			checkBoard();
		}
		if (source == b3) {
			if (player.contains("One")) {
				b3.setText(startScreen.firstPlayer);
				play.setText("Player Two: Your Turn");
			}
			if (player.contains("Two")) {
				b3.setText(startScreen.secondPlayer);
				play.setText("Player One: Your Turn");
			}
			checkBoard();
		}
		if (source == b4) {
			if (player.contains("One")) {
				b4.setText(startScreen.firstPlayer);
				play.setText("Player Two: Your Turn");
			}
			if (player.contains("Two")) {
				b4.setText(startScreen.secondPlayer);
				play.setText("Player One: Your Turn");
			}
			checkBoard();
		}
		if (source == b5) {
			if (player.contains("One")) {
				b5.setText(startScreen.firstPlayer);
				play.setText("Player Two: Your Turn");
			}
			if (player.contains("Two")) {
				b5.setText(startScreen.secondPlayer);
				play.setText("Player One: Your Turn");
			}
			checkBoard();
		}
		if (source == b6) {
			if (player.contains("One")) {
				b6.setText(startScreen.firstPlayer);
				play.setText("Player Two: Your Turn");
			}
			if (player.contains("Two")) {
				b6.setText(startScreen.secondPlayer);
				play.setText("Player One: Your Turn");
			}
			checkBoard();
		}
		if (source == b7) {
			if (player.contains("One")) {
				b7.setText(startScreen.firstPlayer);
				play.setText("Player Two: Your Turn");
			}
			if (player.contains("Two")) {
				b7.setText(startScreen.secondPlayer);
				play.setText("Player One: Your Turn");
			}
			checkBoard();
		}
		if (source == b8) {
			if (player.contains("One")) {
				b8.setText(startScreen.firstPlayer);
				play.setText("Player Two: Your Turn");
			}
			if (player.contains("Two")) {
				b8.setText(startScreen.secondPlayer);
				play.setText("Player One: Your Turn");
			}
			checkBoard();
		}
		if (source == b9) {
			if (player.contains("One")) {
				b9.setText(startScreen.firstPlayer);
				play.setText("Player Two: Your Turn");
			}
			if (player.contains("Two")) {
				b9.setText(startScreen.secondPlayer);
				play.setText("Player One: Your Turn");
			}
			checkBoard();
		}
	}
		
		public void checkBoard() {
		String one = b1.getText();
		String two = b2.getText();
		String three = b3.getText();
		String four = b4.getText();
		String five = b5.getText();
		String six = b6.getText();
		String seven = b7.getText();
		String eight = b8.getText();
		String nine = b9.getText();
		
		if (one.equals(two) && two.equals(three) && three.equals(one)) {
			if (one != "" || two != "" || three != "") {
				if (one.equals("x")) {
					gameOver.win = "x";
				}
				if (one.equals("o")) {
					gameOver.win = "o";
				}
				gameOver.winner = new gameOver();
			}
		}
		else if (four.equals(five) && five.equals(six) && six.equals(four)) {
			if (four != "" || five != "" || six != "") {
				if (four.equals("x")) {
					gameOver.win = "x";
				}
				if (four.equals("o")) {
					gameOver.win = "o";
				}
				gameOver.winner = new gameOver();
			}
		}
		else if (seven.equals(eight) && eight.equals(nine) && nine.equals(seven)) {
			if (seven != "" || eight != "" || nine != "") {
				if (seven.equals("x")) {
					gameOver.win = "x";
				}
				if (seven.equals("o")) {
					gameOver.win = "o";
				}
				gameOver.winner = new gameOver();
			}
		}
		else if (one.equals(four) && four.equals(seven) && seven.equals(one)) {
			if (one != "" || four != "" || seven != "") {
				if (one.equals("x")) {
					gameOver.win = "x";
				}
				if (one.equals("o")) {
					gameOver.win = "o";
				}
				gameOver.winner = new gameOver();
			}
		}
		else if (two.equals(five) && five.equals(eight) && eight.equals(two)) {
			if (two != "" || five != "" || eight != "") {
				if (two.equals("x")) {
					gameOver.win = "x";
				}
				if (two.equals("o")) {
					gameOver.win = "o";
				}
				gameOver.winner = new gameOver();
			}
		}
		else if (three.equals(six) && six.equals(nine) && nine.equals(three)) {
			if (three != "" || six != "" || nine != "") {
				if (three.equals("x")) {
					gameOver.win = "x";
				}
				if (three.equals("o")) {
					gameOver.win = "o";
				}
				gameOver.winner = new gameOver();
			}
		}
		else if (one.equals(five) && five.equals(nine) && nine.equals(one)) {
			if (one != "" || five != "" || nine != "") {
				if (one.equals("x")) {
					gameOver.win = "x";
				}
				if (one.equals("o")) {
					gameOver.win = "o";
				}
				gameOver.winner = new gameOver();
			}
		}
		else if (three.equals(five) && five.equals(seven) && seven.equals(three)) {
			if (three != "" || five != "" || seven != "") {
				if (three.equals("x")) {
					gameOver.win = "x";
				}
				if (three.equals("o")) {
					gameOver.win = "o";
				}
				gameOver.winner = new gameOver();
			}
		}
		else if (!one.equals("") && !two.equals("") && !three.equals("") && !four.equals("") && !five.equals("") &&
				!six.equals("") && !seven.equals("") && !eight.equals("") && !nine.equals("")) {
			catGame.cat = new catGame();
		}
	}	
}
