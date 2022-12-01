package setup;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) 
	{
		//Step 1:set chromeDriver.exe path----->System.setProperty("Name of Browser","Path of chrome.exe file");
		System.setProperty("webdriver.chrome.driver", "D:\\Mayuri\\Testing Software\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//Step 2: Create object of ChromeDriver class
		ChromeDriver driver=new ChromeDriver();
	}

}
