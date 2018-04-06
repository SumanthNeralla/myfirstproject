package gmailproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmailcheck {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sumanth.nerella@gmail.com");
		driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
		WebDriverWait wd=new WebDriverWait(driver,30);
		
		// gmail password entry
		
		wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ind7315");
		driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
		
		// gmail inbox page
		wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@title,'Google Account')]")));
		
		driver.findElement(By.cssSelector("div.J-J5-Ji.J-JN-M-I-Jm")).click();
		
	List<WebElement> tick =driver.findElements(By.xpath("//div[@class='oZ-jc T-Jo J-J5-Ji T-Jo-Jp']"));
	//	List<WebElement> tick =driver.findElements(By.xpath("//div[@class='T-Jo-auh']"));
		int tickcount=tick.size();
		//boolean boo=False;
		String strboo;
		for ( int i=0; i <tickcount; i++)
		{
			//boo=tick.get(i).isSelected();
			strboo=tick.get(i).getAttribute("aria-checked");
			if (strboo.equals("true"))
				System.out.println(i + "th row is selected" );
			else 
				System.out.println(i + "th row not selected" );
		}
		
			
		// logging out from Gmail
		driver.findElement(By.cssSelector("span.gb_ab.gbii")).click();
		driver.findElement(By.xpath("//a[contains(@href,'Logout')]")).click();
		
		
				
		
	}

}
