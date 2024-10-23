package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name="LoginData")
	public String[][] TestLogin() throws IOException{
		
		String path="C:\\Users\\bhanu\\Downloads\\OpencartLoginData.xlsx";
		
		EXCELUTILITY util= new EXCELUTILITY(path);
		
		
		    int rows=  util.getRowCount("Sheet1");
		
	    	int cols=    util.getCellCount("Sheet1",1);
		
		
		
	    	  String[][] data = new String[rows][cols];
	    	        
		  for(int i=1;i<=rows;i++) {
			  
			     for(int j=0;j<cols;j++) {
			    	 
			    	 data[i-1][j]=util.getCellData("Sheet1", i, j);
			     }
		  }
	    	  
		  return data;
		
	}
	
	
	   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
