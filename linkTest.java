package Final_project;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Final_project.BaseClass;
public class linkTest extends BaseClass {
	@Test
public void testlogin() throws InterruptedException  {
		//WebDriver driver = new ChromeDriver();
		// linkTest testlogin=new linkTest();
		//WebDriver driver = new ChromeDriver() ;
		//BaseClass obj;
		//driver.manage().window().maximize();
		driver.get("https://www.flipkart.com"); 
		 SoftAssert sa=new  SoftAssert(); 
		 String expectedtittle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		 String actualTittle=driver.getTitle();
		 sa.assertEquals(actualTittle, expectedtittle);
		  // Thread.sleep(2000);
		// System.out.println(driver.getTitle());           
    driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input")).sendKeys("iphone back cover"+Keys.ENTER);    
//   driver.findElement(By.className("searchTextSpan")).click();                        
   Thread.sleep(2000);
    
}
}


	
