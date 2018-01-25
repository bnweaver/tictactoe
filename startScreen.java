package TicTacToe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class startScreen extends JFrame implements ActionListener {
	
	static JFrame start;
	
	public String[] choices = {"", "x", "o"};
	
	JPanel players = new JPanel(new GridLayout(2, 2, 2, 2));
	JPanel starter = new JPanel(new BorderLayout());
	
	JLabel playerone = new JLabel("Player One", SwingConstants.CENTER);
	JLabel playertwo = new JLabel("Player Two", SwingConstants.CENTER);
	
	static String firstPlayer;
	static String secondPlayer;
	
	JComboBox one = new JComboBox(choices);
	JComboBox two = new JComboBox(choices);
	DefaultComboBoxModel xModel = new DefaultComboBoxModel(new String[] {"x"});
	DefaultComboBoxModel oModel = new DefaultComboBoxModel(new String[] {"o"});
	
	JButton startBut = new JButton("Start Game");
	
	Font newfont = new Font("Arial", Font.BOLD, 60);
	
	public startScreen() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(starter);
		starter.add(players, BorderLayout.CENTER);
		players.add(playerone);
		players.add(playertwo);
		players.add(one);
		players.add(two);
		starter.add(startBut, BorderLayout.SOUTH);
		
		playerone.setFont(newfont);
		playerone.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		playertwo.setFont(newfont);
		playertwo.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		one.setFont(newfont);
		one.setRenderer(new DefaultListCellRenderer() {
			public void paint(Graphics g) {
				setForeground(Color.BLACK);
				setBackground(Color.WHITE);
				super.paint(g);
			}
		});
		two.setFont(newfont);
		two.setRenderer(new DefaultListCellRenderer() {
			public void paint(Graphics g) {
				setForeground(Color.BLACK);
				setBackground(Color.WHITE);
				super.paint(g);
			}
		});
		startBut.setFont(newfont);
		
		setSize(750,750);
		setVisible(true);
		
		one.addActionListener(this);
		two.addActionListener(this);
		startBut.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent a) {
		Object source = a.getSource();
		if ("x".equals(one.getSelectedItem())) {
			one.setEnabled(false);
			two.setModel(oModel);
			firstPlayer = "x";
			secondPlayer = "o";
		}
		if ("o".equals(one.getSelectedItem())) {
			one.setEnabled(false);
			two.setModel(xModel);
			firstPlayer = "o";
			secondPlayer = "x";
		}
		if ("x".equals(two.getSelectedItem())) {
			two.setEnabled(false);
			one.setModel(oModel);
			secondPlayer = "x";
			firstPlayer = "o";
		}
		if ("o".equals(two.getSelectedItem())) {
			two.setEnabled(false);
			one.setModel(xModel);
			secondPlayer = "o";
			firstPlayer = "x";
		}
		
		if (source == startBut) {
			tictactoe.count = 8;
			tictactoe.board = new tictactoe();
		}
	}
}
