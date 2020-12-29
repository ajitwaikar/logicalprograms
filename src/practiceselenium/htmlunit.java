package practiceselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class htmlunit {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\Chrome\\chromedriver_win32\\chromedriver.exe");
		
		
	//	WebDriver driver= new ChromeDriver ();
		
		WebDriver driver = new HtmlUnitDriver ();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		System.out.println("title name; " + driver.getTitle());
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcdefg");
	
		driver.findElement(By.xpath(" //input[@id='pass']")).sendKeys("1212");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
		
		
		
		
		
		
		

	}

}
