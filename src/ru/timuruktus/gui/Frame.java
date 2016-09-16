package ru.timuruktus.gui;


import java.awt.GridLayout;

import javax.swing.*;

public class Frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	public static void createGUI(){
		JFrame window = new JFrame("Tic-Tac-Toe");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setSize(400, 400);
		window.setVisible(true);
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,3));
		Buttons buttons = new Buttons();
		for (int i = 0; i < 9; i++){
			panel.add(buttons.returnBut(i));
		}
		
		
	}
	
	
}
