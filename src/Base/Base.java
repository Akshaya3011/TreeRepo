package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base { 
	public static String URL ="https.youtube.com";
	public static WebDriver driver;
	
	@BeforeTest
	public static void Start()

	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com");
	}
	
	@AfterTest
	public static void End(){
		driver.close();
	}
}
