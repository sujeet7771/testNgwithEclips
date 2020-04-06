package FirstTestNGProject;

import javax.swing.RowFilter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
   
	@Test(dataProvider="getdata")
	public void dologin(String name,String Password,String Env) {
		
	}
	@DataProvider
	public Object[][] getdata(){
		Object[][] data=new Object[2][3];
		// row 1
		data[0][0]="sujeet";
		data[0][1]="123456";
		data[0][2]="chrome Environment";
		//Row 2
		data[1][0]="ajit";
		data[1][1]="789546";
		data[1][2]="firefox Environment";
		return data;
		
		
	}

}
