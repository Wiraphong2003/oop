import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.FlowLayout;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Random;
import java.util.Scanner; // Import the Scanner class to read text files
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
public class Tets {
	public static void main(String[] args) {
		PM25  pm25 = new PM25();
		pm25.setVisible(true);
	}
}
class PM25 extends Frame{
	public PM25() {
		setSize(1000,800);
		setLocationRelativeTo(null);
		setTitle("PM2.5");
		setLayout(new BorderLayout());
		
		Panel bigpanel =new Panel(new BorderLayout());
		Panel panelGrid = new Panel(new GridLayout(20,10));
		Panel GridPanelWest =new Panel();
		Panel GridPanelEast =new Panel();
		Panel GridPanelNorth =new Panel();
		Panel GridPanelSouth =new Panel();
		JButton button[] = new JButton[200];
		Random rand = new Random();
		for (int i = 0; i < button.length; i++) {
			int random = rand.nextInt(5);
			int r = 0;
			int g = 0;
			int b = 0;
			if (random==1) {
				r=255;
				g=0;
				b=0;
			}
			else if (random==2){
				r=255;
				g=153;
				b=0;
			}
			else if(random==3) {
				r=255;
				g=255;
				b=0;
			}
			else if(random==4) {
				r=0;
				g=204;
				b=0;
			}
			else {
				r=255;
				g=255;
				b=255;
			}
			Color color = new Color(r,g,b);
			button[i] = new JButton("");
			button[i].setPreferredSize(new Dimension(42,42));
			button[i].setBackground(color);
			panelGrid.add(button[i]);
		}
		GridPanelWest.setPreferredSize(new Dimension(50,100));
		GridPanelEast.setPreferredSize(new Dimension(50,100));
		GridPanelNorth.setPreferredSize(new Dimension(20,20));
		GridPanelSouth.setPreferredSize(new Dimension(20,20));
		bigpanel.add(panelGrid,BorderLayout.CENTER);
		bigpanel.add(GridPanelWest,BorderLayout.WEST);
		bigpanel.add(GridPanelEast,BorderLayout.EAST);
		bigpanel.add(GridPanelNorth,BorderLayout.NORTH);
		bigpanel.add(GridPanelSouth,BorderLayout.SOUTH);
		add(bigpanel,BorderLayout.CENTER);
	
		
		Panel panel2 = new Panel(new BorderLayout());
		Panel panelImage =new Panel(new FlowLayout());
//		TextArea TA = new TextArea("",10,10,
//				TextArea.SCROLLBARS_NONE);
		ImageIcon image =new ImageIcon(getClass().getResource("img2.jpg"));
		JLabel dis=new JLabel(image);
	    panelImage.setPreferredSize(new Dimension(263,305));
		panelImage.add(dis);
		
		
		//TA.setSize(100,100);
		//dis.setSize(250,250);
		panel2.add(panelImage,BorderLayout.NORTH);
		Panel panelE2 = new Panel();
		Button button1 = new Button("royal rain");
		Button button2 = new Button("Arifical rain");
		panelE2.add(button1);
		panelE2.add(button2);
		panel2.add(panelE2);
		panel2.setPreferredSize(new Dimension(250,800));
		add(panel2,BorderLayout.EAST);
		
		Panel panel3 = new Panel(new FlowLayout(FlowLayout.CENTER,10,100));
		Button buttons = new Button("Open File");
		TextField textfield = new TextField("TextField");
		textfield.setSize(500,20);
		panel3.add(textfield);
		panel3.add(buttons);
		panel2.add(panel3,BorderLayout.SOUTH);
	}
	public void buttonArea() {
		Button button[] = new Button[200];
		for (int i = 0; i < button.length; i++) {
			button[i] = new Button("Area "+(i+1));
			
			add(button[i]);
		}
	}
	public void buttonAdd() {
		Button button1 = new Button("royal rain");
		Button button2 = new Button("Arifical rain");
	}
	public void TextArea1() {
		TextArea TA = new TextArea("",10,10,
				TextArea.SCROLLBARS_NONE);
		TA.setSize(100,100);
	}
}
/*public class ReadFile {
	  public static void main(String[] args) {
	    try {
	      File myObj = new File("filename.txt");
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        System.out.println(data);
	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	}
}*/