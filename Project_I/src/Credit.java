import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Credit 
{
  Credit()
  {
	Screen f=new Screen("300.jpg");
	JPanel bigPanel=new JPanel();
	JPanel inWest=new JPanel();
	JPanel bigWest=new JPanel();
	JPanel bigEast=new JPanel();
	JPanel bigNort=new JPanel();
	
	
	bigWest.setBackground(new Color(222,184,135));
	bigEast.setBackground(new Color(222,184,135));
	bigNort.setBackground(new Color(222,184,135));
    bigPanel.setBackground(new Color(222,184,135));
    inWest.setBackground(new Color(222,184,135));
    
	bigWest.setPreferredSize(new Dimension(120,0));
	bigEast.setPreferredSize(new Dimension(200,0));
	
	Font font=new Font("Pixeloid Sans",Font.BOLD,20);
	JButton BTM=new JButton("<--Black to Menu");
	BTM.setFont(font);
	BTM.setForeground(new Color(169,83,0));
	BTM.setBackground(new Color(222,184,135));
	inWest.add(BTM,BorderLayout.WEST);
	bigPanel.add(inWest);
	
	f.add(bigPanel,BorderLayout.SOUTH);
	f.add(bigNort,BorderLayout.NORTH);
	f.add(bigEast,BorderLayout.EAST);
	f.add(bigWest,BorderLayout.WEST);
	
    //setAction
    BTM.addActionListener(new ActionListener() 
    {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			f.setVisible(false);
			Menu m = new Menu();
		}
    });
	f.setVisible(true);
	 
  }
}