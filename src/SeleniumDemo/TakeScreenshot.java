package SeleniumDemo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshot {
	@Test
	public void takeScreenshot() throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		System.out.println("This is to test Title" + driver.getTitle());

		TakesScreenshot ts = (TakesScreenshot) driver;
		File scrFile = ((RemoteWebDriver) ts).getScreenshotAs(OutputType.FILE);

		String timeStamp = new SimpleDateFormat("_yyyyMMdd_hhmmss").format(new Date());
		String fileName = "IMG" + timeStamp + ".png";

		FileUtils.copyFile(scrFile, new File("C:\\Users\\swapnilm1\\SeleniumScr\\" + fileName));

		Thread.sleep(4000);
		driver.close();

	}

}
