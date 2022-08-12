import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PanelArea extends JPanel{
    JButton backtoMenu=new JButton("Black to menu");;
	public PanelArea() {
		setLayout(new BorderLayout());
		ButtonArea bt = new ButtonArea();
		add(bt,BorderLayout.CENTER);
		
		JPanel P_WEST = new JPanel();
		JPanel P_EAST = new JPanel();
		JPanel P_SOUTH = new JPanel();
		JPanel P_NORTH = new JPanel();
	
		setPanel(P_WEST,50,0);
		setPanel(P_EAST,50,0);
		setPanel(P_SOUTH,0,50);
		setPanel(P_NORTH,0,50);
		P_SOUTH.add(backtoMenu);
//	    P_WEST.setBackground(new Color(222,184,135));
//		P_WEST.setPreferredSize(new Dimension(50,0));
//		P_EAST.setPreferredSize(new Dimension(50,0));
//		P_SOUTH.setPreferredSize(new Dimension(0,50));
//		P_NORTH.setPreferredSize(new Dimension(0,50));
		
		add(P_WEST,BorderLayout.WEST);
		add(P_EAST,BorderLayout.EAST);
		add(P_SOUTH,BorderLayout.SOUTH);
		add(P_NORTH,BorderLayout.NORTH);
		
	               
		                          
	}
	void setPanel(JPanel P,int w,int h)
	{
		    P.setBackground(new Color(222,184,135));
			P.setPreferredSize(new Dimension(w,h));
			
	}
	JButton Button()
	{
	  return backtoMenu;
	}
}
