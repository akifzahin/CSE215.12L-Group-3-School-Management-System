package com.Project.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Color;

public class StudentFormUI extends JFrame {

	private JPanel JPanel;
	private JTextField name;
	private JTextField email;
	private JTextField address;
	private JTextField birthdate;
	private JTextField age;
	private JTextField gender;
	private JTextField phnNumber;
	private JTextField standard;
	private JTextField guardianname;
	private JTextField guardianphn;
	private JTextField id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentFormUI frame = new StudentFormUI();
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
	public StudentFormUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 674);
		JPanel = new JPanel();
		JPanel.setBackground(new Color(255, 255, 153));
		JPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(JPanel);
		JPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT  REGISTRATION");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(82, 22, 345, 27);
		JPanel.add(lblNewLabel);
		
		name = new JTextField();
		name.setBounds(183, 79, 228, 27);
		JPanel.add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("User Name :");
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(28, 73, 102, 34);
		JPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Birthdate :");
		lblNewLabel_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblNewLabel_2.setBounds(28, 207, 102, 27);
		JPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Address :");
		lblNewLabel_3.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 15));
		lblNewLabel_3.setBounds(28, 159, 87, 26);
		JPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_6 = new JLabel("Email :");
		lblNewLabel_6.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblNewLabel_6.setBounds(28, 118, 102, 27);
		JPanel.add(lblNewLabel_6);
		JComboBox comboBoxAuthorGender = new JComboBox();
		comboBoxAuthorGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gender.setText(comboBoxAuthorGender.getSelectedItem().toString());
			}
		});
		
		comboBoxAuthorGender.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		comboBoxAuthorGender.setFont(new Font("Tahoma", Font.HANGING_BASELINE, 16));
		comboBoxAuthorGender.setForeground(Color.BLACK);
		comboBoxAuthorGender.setBackground(Color.WHITE);
		comboBoxAuthorGender.setBounds(327, 295, 68, 21);
		JPanel.add(comboBoxAuthorGender);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(309, 594, 118, 23);
		JPanel.add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("I accept all  terms and Conditions");
		rdbtnNewRadioButton_2.setBackground(new Color(255, 255, 153));
		rdbtnNewRadioButton_2.setSelected(false);
		rdbtnNewRadioButton_2.setBounds(66, 595, 228, 21);
		JPanel.add(rdbtnNewRadioButton_2);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(183, 120, 228, 27);
		JPanel.add(email);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(183, 161, 228, 27);
		JPanel.add(address);
		
		birthdate = new JTextField();
		birthdate.setColumns(10);
		birthdate.setBounds(183, 209, 112, 27);
		JPanel.add(birthdate);
		
		JLabel lblNewLabel_1_1 = new JLabel("Age :");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(28, 245, 102, 34);
		JPanel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Gender :");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(28, 287, 102, 34);
		JPanel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Phone Number :");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(28, 332, 135, 34);
		JPanel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Standard :");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_4.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblNewLabel_1_4.setBounds(28, 377, 102, 34);
		JPanel.add(lblNewLabel_1_4);
		
		age = new JTextField();
		age.setColumns(10);
		age.setBounds(183, 247, 112, 27);
		JPanel.add(age);
		
		gender = new JTextField();
		gender.setColumns(10);
		gender.setBounds(183, 295, 112, 23);
		JPanel.add(gender);
		
		phnNumber = new JTextField();
		phnNumber.setColumns(10);
		phnNumber.setBounds(183, 338, 228, 27);
		JPanel.add(phnNumber);
		
		standard = new JTextField();
		standard.setColumns(10);
		standard.setBounds(183, 383, 112, 27);
		JPanel.add(standard);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ID :");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(28, 422, 102, 34);
		JPanel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Guardian Name :");
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblNewLabel_1_3_1.setBounds(28, 467, 135, 34);
		JPanel.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Guradian Number :");
		lblNewLabel_1_3_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblNewLabel_1_3_2.setBounds(28, 512, 145, 34);
		JPanel.add(lblNewLabel_1_3_2);
		
		guardianname = new JTextField();
		guardianname.setColumns(10);
		guardianname.setBounds(183, 476, 228, 27);
		JPanel.add(guardianname);
		
		guardianphn = new JTextField();
		guardianphn.setColumns(10);
		guardianphn.setBounds(183, 512, 228, 27);
		JPanel.add(guardianphn);
		
		id = new JTextField();
		id.setColumns(10);
		id.setBounds(183, 431, 112, 27);
		JPanel.add(id);
	}
}
