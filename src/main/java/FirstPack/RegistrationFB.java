package FirstPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationFB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys("netl");

		driver.findElement(By.xpath(".//*[@id='u_0_3']")).sendKeys("Solutions");
	
		driver.findElement(By.xpath(".//*[@id='u_0_5']")).sendKeys("nlstest16@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='u_0_8']")).sendKeys("nlstest16@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='u_0_a']")).sendKeys("netlogic123");
		Thread.sleep(1000);
		
		Select sl1=new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		sl1.selectByIndex(2);
		Thread.sleep(1000);
		
		Select sl2=new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		sl2.selectByVisibleText("Feb");
		Thread.sleep(1000);
		
		Select sl3=new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		sl3.selectByValue("1992");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(".//*[@id='u_0_k']/span[1]")).click();
		
		//driver.findElement(By.xpath(".//*[@id='u_0_k']/span[1]/label")).click();
		
		driver.findElement(By.xpath(".//*[@id='u_0_e']")).click();
		
		driver.quit();
				
	}

}
