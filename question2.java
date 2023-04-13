package cc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class question2 {
public static void main(String args[]) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement name=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		name.sendKeys("standard_user");
		Thread.sleep(1000);
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		pass.sendKeys("secret_sauce");
		Thread.sleep(2000);
		WebElement login=driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		login.click();
		Thread.sleep(1000);
		WebElement filter=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		filter.click();
		WebElement clka2z=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[1]"));
		clka2z.click();
		WebElement atoz=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
		System.out.println("1st PRODUCT IN A-Z : "+atoz.getText());
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div"));
		System.out.println("1st PRODUCT IN Z-A : "+ drop.getText());
//		WebElement filter=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		filter.click();
		WebElement lowtohigh=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]"));
		lowtohigh.click();
		WebElement prlowtohigh=driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div"));

		System.out.println("FIRST PRODUCT IN LOW TO HIGH : "+prlowtohigh.getText());
		
		
		
}

}
