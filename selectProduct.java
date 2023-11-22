package Final_project;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class selectProduct extends linkTest {

	@Test
    public void testCheckbox() throws InterruptedException {
//  driver.findElement(By.className("sd-input")).sendKeys("442902");
		//*[@id="content_wrapper"]/div[7]/div[5]/div[3]/div[2]/div/div[2]/input
	 
         driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a[2]")).click();    //click to the product
         Set<String> windhan=driver.getWindowHandles();//parent as child   2
 		Iterator<String>it=windhan.iterator();//for()if
 		String mainwindow=it.next();
 		String childwindow=it.next();
 		driver.switchTo().window(childwindow);//switch to child window
         Thread.sleep(500);
         driver.findElement( By.xpath("//*[@id=\"pincodeInputId\"]")).sendKeys("442902");  //enter the pin
        Thread.sleep(1000);
         driver.findElement(By.className("_2P_LDn")).click();  //check the pin
         WebDriverWait wait=new  WebDriverWait(driver,Duration.ofSeconds(200));
     	 WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.className("_2P_LDn")));
     //    Thread.sleep(1000);
         driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();    //add to card
    //    Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a")).click(); //login
        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("12345"); //enter no
    //    /html/body/div[3]/div/div/div/div/div[2]/div/form/div[1]/input
        Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div/form/div[3]/button")).click(); //send otp
			
	 Thread.sleep(10000);
	
	 
	}
}      
