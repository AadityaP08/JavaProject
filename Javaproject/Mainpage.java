import javax.swing.*;
//import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class Mainpage {
    public static void mainPage(){
        JFrame f
			= new JFrame(
				"Main Page");

        JButton b1, b2;
        // Creating one button for Saving
		// and other button to close
		// and setting the bounds
		b1 = new JButton("Create Contact");
		b1.setBounds(150, 300, 70, 30);
		b2 = new JButton("Search Contact");
		b2.setBounds(420, 300, 70, 30);
    }
    
}
