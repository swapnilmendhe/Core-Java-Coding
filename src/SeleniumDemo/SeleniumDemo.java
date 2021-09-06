package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/v4");

		WebElement userId = driver.findElement(By.name("uid"));
		userId.sendKeys("mngr349626");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("gUmabas");

		WebElement loginButn = driver.findElement(By.name("btnLogin"));
		loginButn.click();

		Thread.sleep(4000);
		driver.close();

	}

}
