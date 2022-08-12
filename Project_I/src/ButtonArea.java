import java.util.Random;
import java.util.Scanner;
import java.awt.Color;
import java.io.File;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.io.IOException;
import java.io.FileNotFoundException;
public class ButtonArea  extends JPanel{
	JButton button[][] = new JButton[10][20];
	public ButtonArea() {
		JPanel buttonPanel=new JPanel(new GridLayout(10,20));
		//color set
		Color red = new Color(247,56,34);
		Color green = new Color(51,255,141);
		Color yenllow = new Color(249,246,16);
		Color oreng = new Color(254,171,5);
		Color WHITE  = new Color(255,255,255);
		setLayout(new BorderLayout());
		
		//file reader
		ReadFile RF = new ReadFile();
		int[][]checkPM=RF.getData();
		
		
		//button
		int i,j;
		for ( i = 0; i < 10; i++) {
			for( j=0;j<20;j++)
			{
			Color n = null;
			if (checkPM[i][j]<0 ) {
				n = WHITE;
			}
			else if(checkPM[i][j]<=50)
			{
				n = green;
			}
			else if(checkPM[i][j]<=100)
			{
				n = yenllow;
			}
			else if (checkPM[i][j]<=150)
			{
				n = oreng;
			}
			else if (checkPM[i][j]<=250)
			{
				n = red;
			}
			else {
				n = WHITE;
			}
				
			button[i][j] = new JButton();
			button[i][j].setBackground(n);
			//button[i][j].setBorderPainted(false);
			buttonPanel.add(button[i][j]);
			button[i][j].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
			}
		
		}
		
		
		JPanel P_WEST = new JPanel();
		JPanel P_EAST = new JPanel();
		JPanel P_SOUTH = new JPanel();
		JPanel P_NORTH = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
		
		JLabel name=new JLabel("PM2.5 SIMULATION");
		name.setForeground(new Color(222,184,55));
		P_WEST.setBackground(new Color(187, 118, 64 ));
		P_EAST.setBackground(new Color(187, 118, 64));
		P_SOUTH.setBackground(new Color(187, 118, 64));
		P_NORTH .setBackground(new Color(187, 118, 64));
		buttonPanel.setBackground(new Color(187, 118, 64));
		P_NORTH.add(name);
		
		add(buttonPanel,BorderLayout.CENTER);
		add(P_NORTH,BorderLayout.NORTH);
		add(P_SOUTH,BorderLayout.SOUTH);
		add(P_WEST,BorderLayout.WEST);
		add(P_EAST,BorderLayout.EAST);
		
	}

}
