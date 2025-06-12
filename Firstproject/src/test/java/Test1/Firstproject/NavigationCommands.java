package Test1.Firstproject;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigationCommands {
	
	public void NC()
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigationCommands s = new NavigationCommands();
		s.NC();
		

	}

}
