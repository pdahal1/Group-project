package splash;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
public class splash extends JFrame {
	
	


	JProgressBar current;
	  int num = 0;
	public splash() {
	  super("bookFlight");
	  
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  JPanel pane = new JPanel();
	  pane.setLayout(new FlowLayout());
	  ImageIcon img = new ImageIcon(getClass().getResource("s.jpg"));
	  JLabel l1 = new JLabel(img);
	  
	  current = new JProgressBar(0, 1000);
 	  current.setValue(0);
	  current.setStringPainted(true);
	  BorderLayout b = new BorderLayout();
	  pane.add(l1, BorderLayout.CENTER);
	  pane.add(current,b.PAGE_END);
	 
	  
	  setContentPane(pane);
	  }

	public void iterate() {
	  while (num < 1000) {
	  current.setValue(num);
	  try {
	  Thread.sleep(1000);
	  } catch (InterruptedException e) { 
	    }
	  num += 175;
	  }
	  current.setVisible(false);
	  }
	public static void main(String[] arguments) {
	  splash frame = new splash();
	  frame.pack();
	  frame.setVisible(true);
	  frame.iterate();
	  
	  }
	  }




