package javagitandgitandgithub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GithubOperations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\giris\\Important jar files\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	WebElement electronics = driver.findElement(By.xpath("//ul[@class='hl-cat-nav__container']/li[3]"));
	Actions act = new Actions(driver);
	act.moveToElement(electronics).click().build().perform();
	System.out.println("Target is achieved");
	}

}
