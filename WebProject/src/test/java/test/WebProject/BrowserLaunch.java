package test.WebProject;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class BrowserLaunch {
	
	public void BL()
	{
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	   BrowserLaunch obj = new BrowserLaunch();
	   obj.BL();
	}
}
