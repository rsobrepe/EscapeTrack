package com.perplexity.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;

public class MainView extends JFrame {

	private JPanel contentMain;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView frame = new MainView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainView() {
		setTitle("Escape Tracker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 862, 569);
		contentMain = new JPanel();
		contentMain.setBackground(Color.WHITE);
		contentMain.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentMain);

		JLabel lblTitle = new JLabel("Escape Tracker");
		lblTitle.setFont(new Font("Arial", Font.BOLD, 24));
		GroupLayout gl_contentMain = new GroupLayout(contentMain);
		gl_contentMain.setHorizontalGroup(gl_contentMain.createParallelGroup(Alignment.LEADING).addGroup(gl_contentMain
				.createSequentialGroup().addGap(317).addComponent(lblTitle).addContainerGap(344, Short.MAX_VALUE)));
		gl_contentMain.setVerticalGroup(
				gl_contentMain.createParallelGroup(Alignment.LEADING).addGroup(gl_contentMain.createSequentialGroup()
						.addContainerGap().addComponent(lblTitle).addContainerGap(480, Short.MAX_VALUE)));
		contentMain.setLayout(gl_contentMain);
	}
}
