package Final_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static WebDriver driver;
	
	@BeforeTest
	public static void setup() {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver.exe");
		 driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//BaseClass setup=new BaseClass();
	}
	 
	
	 @AfterTest
	    public static void teardown() {
	        if (driver != null) {
	            driver.quit();
	        }
	 }
	}


