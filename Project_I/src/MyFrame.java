import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyFrame extends JFrame{
	JButton royalRain;
	JButton naRain;
	JTextField filePath;
	JButton open;
	JTextField inputP;
	
	public MyFrame() {
		//ButtonArea btArea = new ButtonArea();
		PanelArea PArea = new PanelArea();
		setSize(1200,800);
		setLocationRelativeTo(null);
		setTitle("PM2.5");
		setLayout(new BorderLayout());
		PArea.setPreferredSize(new Dimension(750,800));
		
		//add(btArea,BorderLayout.WEST);
		
		JPanel P_PreS= new JPanel(new BorderLayout());
		P_PreS.setBackground(new Color(165, 165, 165 ));
		P_PreS.setPreferredSize(new Dimension(250,800));
		
		ImageIcon img = new ImageIcon(getClass().getResource("img2.jpg"));
		JLabel dispay = new JLabel(img);
		
		//ImageIcon img2 = new ImageIcon(getClass().getResource("pl.png"));
		//JLabel dispay2 = new JLabel(img2);
		
		myData detail = new myData();
		
//		JPanel Panel_data = new JPanel();
//		TextArea Tdata = new TextArea();
		
		JPanel east=new JPanel();
		east.setPreferredSize(new DimensionUIResource(0, 0));
		
		JPanel data =new JPanel(new BorderLayout());
	    data.add(dispay,BorderLayout.NORTH);
		data.add(detail,BorderLayout.CENTER);
		data.setBackground(new Color(165, 165, 165 ));
		P_PreS.add(data,BorderLayout.NORTH);
		
		
	
		
		JPanel textR=new JPanel(new BorderLayout());
		JPanel buttonP=new JPanel(new FlowLayout(FlowLayout.CENTER,12,5));
		buttonP.setBackground(new Color(165, 165, 165 ));
	    royalRain=new JButton("Artificial Rain");
		naRain=new JButton("Natural rain");
		buttonP.add(royalRain);
		buttonP.add(naRain);
		textR.add(buttonP,BorderLayout.NORTH);
		
		JPanel openFile=new JPanel(new FlowLayout(FlowLayout.CENTER,12,5));
		openFile.setBackground(new Color(165, 165, 165 ));
		filePath=new JTextField("--  File paht   --");
		open=new JButton("Open file");
		openFile.add(filePath);
		openFile.add(open);
		
		inputP=new JTextField("--ใส่จำนวนประชากร--");
		JButton submit=new JButton("submit");
		openFile.add(inputP);
		openFile.add(submit);
		textR.add(openFile,BorderLayout.CENTER);
		JPanel BGS=new JPanel();
		BGS.setBackground(new Color(165, 165, 165 ));
		BGS.setPreferredSize(new Dimension(250, 150));
		P_PreS.add(textR,BorderLayout.CENTER);
		P_PreS.add(BGS,BorderLayout.SOUTH);
		
		
		JButton BTM=new JButton("Back To Menu");
		BTM=PArea.Button();
		BTM.addActionListener(new ActionListener() 
	     {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
			    setVisible(false);
				Menu m=new Menu();
			}
	     });
         open.addActionListener(new  ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser =new JFileChooser();
				
				fileChooser.showOpenDialog(null);
				
			}
		});
		
		add(P_PreS,BorderLayout.EAST);
		add(PArea,BorderLayout.CENTER);
	}
}

