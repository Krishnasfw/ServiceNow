package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
	
		public static void main(String[] args) throws Exception  {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		driver.get("https://lenovoau.service-now.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kbabu@lenovo.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("wRPo-4926");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		   Thread.sleep(25000);
		   driver.close();

		   	}

}
