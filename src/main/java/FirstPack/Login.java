package FirstPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	public static void main(String[] args) throws InterruptedException  {
		
		
		WebDriver d=new FirefoxDriver();
		EventFiringWebDriver driver=new EventFiringWebDriver(d);
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("nlstest16@gmail.com");
		 driver.findElement(By.id("pass")).clear();
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("netlogic123");
		//driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(".//*[@id='u_0_l']")).click();
		Thread.sleep(10000);
		driver.close();
	}

}
