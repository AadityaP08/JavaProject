package JAVA PROJECT.
// Java program to write a student
// information in JFrame and
// storing it in a file

import javax.swing.*;

import java.awt.event.*;
import java.io.*;

public class CreateContact {

	// Function to write a student
	// information in JFrame and
	// storing it in a file
	public static void StudentInfo()
	{

		// Creating a new frame using JFrame
		JFrame f
			= new JFrame(
				"Create Contact");

		// Creating the labels
		JLabel l1, l5;

		// Creating three text fields.
		// One for student name, one for
		// college mail ID and one
		// for Mobile No
		JTextField t1, t2;

		// Creating two JComboboxes
		// one for Branch and one
		// for Section
		

		// Creating two buttons
		JButton b1, b2;

		// Naming the labels and setting
		// the bounds for the labels
		l1 = new JLabel("Name:");
		l1.setBounds(50, 50, 100, 30);
		
		l5 = new JLabel("Mobile No:");
		l5.setBounds(50, 120, 70, 30);

		// Creating the textfields and
		// setting the bounds for textfields
		t1 = new JTextField();
		t1.setBounds(150, 50, 130, 30);
		t2 = new JTextField();
		t2.setBounds(150, 120, 130, 30);
		

		

		

		// Creating one button for Saving
		// and other button to close
		// and setting the bounds
		b1 = new JButton("Save");
		b1.setBounds(150, 300, 70, 30);
		b2 = new JButton("close");
		b2.setBounds(420, 300, 70, 30);

		// Adding action listener
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{

				// Getting the text from text fields
				// and JComboboxes
				// and copying it to a strings

				String s1 = t1.getText();
				String s2 = t2.getText();
				
				
				if (e.getSource() == b1) {
					try {

						// Creating a file and
						// writing the data
						// into a Textfile.
						FileWriter w
							= new FileWriter(
								"Information.txt", true);

						w.write(s1 + "\n");
						w.write(s2 + "\n");
						
						
						w.close();
					}
					catch (Exception ae) {
						System.out.println(ae);
					}
				}

				// Shows a Pop up Message when
				// save button is clicked
				JOptionPane
					.showMessageDialog(
						f,
						"Successfully Saved"
							+ " The Details");
			}
		});

		// Action listener to close the form
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				f.dispose();
			}
		});

		// Default method for closing the frame
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});

		// Adding the created objects
		// to the frame
		f.add(l1);
		f.add(t1);
		
		f.add(t2);
	
		
		
		
		f.add(l5);
		
		f.add(b1);
		f.add(b2);
		f.setLayout(null);
		f.setSize(700, 600);
		f.setVisible(true);
	}
	// Driver code
	public static void main(String args[])
	{
		StudentInfo();
	}
}
