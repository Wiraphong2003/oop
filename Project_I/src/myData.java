import java.awt.Dimension;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
public class myData extends JPanel{
	myData(){
		setPreferredSize(new Dimension(300,200));
		setBackground(new Color(165, 165, 165 ));
		setLayout(null);
		
		JLabel text1 = new JLabel("Detail");
		Font F1 = new Font("Comic sans MS",Font.BOLD,25);
		text1.setFont(F1);
		text1.setBounds(100,-100,250,250);
		text1.setForeground(new Color(255,255,255));
		add(text1);
		JLabel Line = new JLabel("_________________________________");
		Line.setBounds(12,-80,250,250);
		Line.setForeground(new Color(255,255,255));
		add(Line);
		
		
		JLabel text2 = new JLabel("Populace: "+5000);
		text2.setBounds(10,-60,250,250);
		text2.setForeground(new Color(255,255,255));
		add(text2);
		
		JLabel text3 = new JLabel("Dust amount : "+135);
		text3.setBounds(10,-40,250,250);
		text3.setForeground(new Color(255,255,255));
		add(text3);
		
		JLabel text4 = new JLabel("Good Populace : "+1300);
		text4.setBounds(10,-20,250,250);
		text4.setForeground(new Color(255,255,255));
		add(text4);
		JLabel text5 = new JLabel("Not Good Populace : "+3700);
		text5.setBounds(10,0,250,250);
		text5.setForeground(new Color(255,255,255));
		add(text5);
		JLabel text6 = new JLabel("Not Good Populace : "+26+"%");
		text6.setBounds(10,20,250,250);
		text6.setForeground(new Color(255,255,255));
		add(text6);
		
	}
	
}
