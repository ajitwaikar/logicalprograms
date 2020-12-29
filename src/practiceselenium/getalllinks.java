package practiceselenium;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getalllinks {

	public static void main(String[] args) {
		

		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.facebook.com/");
		List<WebElement>  linklist =driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		
		for(int i=0; i<=linklist.size()-1; i++)
		{
		String	list =linklist.get(i).getText();
		System.out.println(list);
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
