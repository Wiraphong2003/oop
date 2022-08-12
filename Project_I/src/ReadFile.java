import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
public class ReadFile {

	int array[][] = new int[10][20];
	public ReadFile() {
		
		int i=0,k=1;
		
		String fileName="D:\\OOP\\Project_I\\bin\\pm2.5.txt";
		try {
			 
		      File myObj = new File(fileName);
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		    	  String data = myReader.nextLine();
		    	  String data1[]=data.split("\t");
		    	  for(;i<k;i++)
		    	  {
		    		  for(int j=0;j<20;j++)
		    		  {
		    			  array[i][j]=Integer.parseInt(data1[j]);
		    		  }
		    	  }
		    	  k++;
		    	  //System.out.println(data);
		 
		  		}
		         myReader.close();  
		    
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	int[][] getData()
	{
		return array;
	}
}
