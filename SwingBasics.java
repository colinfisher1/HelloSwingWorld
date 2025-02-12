import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.*;

/**
   A "Hello, World" program for Java Swing run as a Java application,
   modified to have the class implement the Runnable interface rather
   than creating the Runnable as an anonymous class.

   @author Jim Teresco
   @version Spring 2020
*/

public class SwingBasics implements Runnable {

    /**
       The run method to set up the graphical user interface

    */
    @Override
    public void run() {
	
	// set up the GUI "look and feel" which should match
	// the OS on which we are running
	JFrame.setDefaultLookAndFeelDecorated(false);
	
	// create a JFrame in which we will build our very
	// tiny GUI, and give the window a name
	JFrame frame = new JFrame("SwingBasics");
    frame.setPreferredSize(new Dimension(500,500));

	// tell the JFrame that when someone closes the
	// window, the application should terminate
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	// create a JLabel containing our message, and add
	// it to our JFrame
	JLabel label = new JLabel("Swing is Fun");
    label.setForeground(Color.blue);
	frame.add(label);

    JLabel label2 = new JLabel("Second label!!!");
    label2.setForeground(Color.red);

    JLabel label3 = new JLabel("Third label!!!");
    label3.setForeground(Color.green);

	
	// display the window we've created
	frame.pack();
	frame.setVisible(true);

    //create a JPanel and add it to our JFrame
    JPanel panel = new JPanel();
    frame.add(panel);
    panel.add(label);
    panel.add(label2);
    panel.add(label3);

    }
    
    public static void main(String args[]) {

	// The main method is responsible for creating a thread (more
	// about those later) that will construct and show the graphical
	// user interface.
	javax.swing.SwingUtilities.invokeLater(new SwingBasics());

    }
}
   
