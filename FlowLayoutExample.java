
/*
 * A Java swing FlowLayout example 
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class FlowLayoutExample {

	
	public static void main(String[] args) 
	{
		
		GridLayout experimentLayout = new GridLayout(0,7);
		
		// Create and set up a frame window
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Layout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Define new buttons 
		JButton jb1 = new JButton("Button 1");		
		JButton jb2 = new JButton("Button 2");
		JButton jb3 = new JButton("Button 3");
		JButton jb4 = new JButton("Button 4");			
		
		// Define the panel to hold the buttons	
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(jb1);
		panel.add(jb2);
		panel.add(jb3);
		panel1.setLayout(new FlowLayout());
		panel1.add(jb4);
		
		
		// Set the window to be visible as the default to be false
		frame.add(panel);
		frame.add(panel1);
		frame.pack();
		frame.setVisible(true);		
	}

}