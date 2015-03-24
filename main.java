//This is a project by John Zachariadis for creating random stuff for DnD like towns and adventures.
import java.util.*;
import java.io.*;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;

public class main{
	
	
	public static void main (String args[]){
	  //System.out.println("Hello World");
	  JPanel emptyLabel = new JPanel();
	  JFrame frame = new JFrame("DnDRNGesus");
	  JLabel intro = new JLabel("Welcome. How may I assist you today.", SwingConstants.CENTER);
	  JButton adventure = new JButton("Adventure");
	  JButton town = new JButton("Town");
	  
	  adventure.setPreferredSize(new Dimension(160, 100));
	  town.setPreferredSize(new Dimension(160, 100));
	  
	  emptyLabel.setMaximumSize(new Dimension(900, 400));
	  emptyLabel.setPreferredSize(new Dimension(900, 400));
	  emptyLabel.setMaximumSize(new Dimension(900, 400));
	  emptyLabel.add(adventure, BorderLayout.SOUTH);
	  emptyLabel.add(town);
	  
	  intro.setMaximumSize(new Dimension(450, 20));
	  intro.setPreferredSize(new Dimension(450, 20));
	  intro.setMaximumSize(new Dimension(450, 20));
	  
  	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  	frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
  	frame.getContentPane().add(intro, BorderLayout.NORTH);
  	frame.pack();
  	frame.setVisible(true);
	}
}
