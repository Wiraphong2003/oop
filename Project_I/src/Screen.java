import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Screen extends JFrame 
{
  Screen(String image1)
  {
	  
	     
	     setSize(1200, 800);
	     setLayout(new BorderLayout());
		 setLocationRelativeTo(null);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setTitle("PM2.5 SIMULATION");
		 setBackground(new Color(222,184,135));
	     //Panel
	    

	     //Image Add
	     try 
	     {
	    	 JLabel text=new JLabel();
	    	 text.setText("PM2.5");
	    	 ImageIcon image=new ImageIcon(getClass().getResource(image1));
	        JLabel B=new JLabel(image);
	        add(B,BorderLayout.CENTER);
	     
	     }
	     catch (Exception e) {System.out.println("Not Found");}
		
  }

}
