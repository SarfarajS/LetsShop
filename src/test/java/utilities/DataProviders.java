package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name="LoginData")
	public String[][] getData() throws IOException
	{
		String path = ".\\testData\\Opencart_LoginData.xlsx";    // xl path in project
		
		ExcelUtility xlutil = new ExcelUtility(path);
		
		int totalrows=xlutil.getRowCount("Sheet1");
		int totalcols=xlutil.getCellCount("Sheet1", 1);
		
		String logindata[][] = new String[totalrows][totalcols]; //created for 2 diamenssional array which take email and password
		
		for(int i=1;i<=totalrows;i++)     //1   //read the data from xl storing in two deminsional array
		{
			for(int j=0;j<totalcols;j++)    //0    i is rows j is col
			{
				logindata[i-1][j] = xlutil.getCellData("Sheet1", i, j);   //1,0
			}
		}
		
		return logindata;
	}

}
