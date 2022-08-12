import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Font;
public class Menu 
{
    //JLabel B;
	Menu(){
	Screen f = new Screen("m2.jpg");
    JPanel buttonPanel =new JPanel(new FlowLayout(FlowLayout.CENTER,100,0));
    
	//Font
     Font font=new Font("Pixeloid Sans",Font.BOLD,20);
		
     
     //Button
     JButton start=new JButton("<START>");
     JButton exit=new JButton("<EXIT>");
     JButton credit=new JButton("<CREDIT>");
     setButton(start,font);  
     setButton(exit,font);
     setButton(credit,font);
	 	
     //Button add to panel
     buttonPanel.setBackground(new Color(222,184,135));
     buttonPanel.add(start);
     buttonPanel.add(credit);
     buttonPanel.add(exit);
     
     //add To Frame
    
     f.add(buttonPanel,BorderLayout.SOUTH);
     
     
     //setAction
     start.addActionListener(new ActionListener() 
     {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			f.setVisible(false);
			MyFrame myFreme=new MyFrame();
			myFreme.setVisible(true);
		}
     });
     
     credit.addActionListener(new ActionListener() 
     {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			f.setVisible(false);
			Credit c=new Credit();
		}
     });
     exit.addActionListener(new ActionListener() 
     {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			System.exit(0);
		}
     });

     f.setVisible(true);
	 	
	 	
		
	}
	void setButton(JButton b,Font f)
	{
		 b.setBackground(new Color(222,184,135));
	     b.setBorderPainted(false);
	     b.setFont(f);	
	     b.setForeground(new Color(169,83,0));
	     b.setPreferredSize(new Dimension(200,50));
	   
	}

	

}