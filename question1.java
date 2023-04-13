package cc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class question1 {
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
		WebElement addtocart=driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]"));
		addtocart.click();
		Thread.sleep(1000);
		WebElement viewcart=driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		viewcart.click();
		String urlcart=driver.getCurrentUrl();
		String carturl="https://www.saucedemo.com/cart.html";
		if(carturl.equals(urlcart))
		{
			System.out.println("CART URL is VALID");
		}
		else
		{
			System.out.println("CART URL NOT VALID");
		}
		Thread.sleep(1000);
		WebElement checkout=driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
		checkout.click();
		Thread.sleep(1000);
		WebElement fname=driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
		fname.sendKeys("Karthikeyan");
		Thread.sleep(1000);
		WebElement lname=driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
		lname.sendKeys("R");
		Thread.sleep(1000);

		WebElement pin=driver.findElement(By.xpath("//*[@id=\"postal-code\"]"));
		pin.sendKeys("641008");
		Thread.sleep(1000);

		WebElement con=driver.findElement(By.xpath("//*[@id=\"continue\"]"));
		con.click();
		Thread.sleep(1000);
		Thread.sleep(1000);

		WebElement pname=driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div"));
		System.out.println("PRODUCT NAME : "+pname.getText());
		WebElement price=driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[3]/div[2]/div[2]/div"));
		System.out.println("PRODUCT PRICE : "+price.getText());
		String orginal=driver.getCurrentUrl();
		String expected="https://www.saucedemo.com/checkout-step-two.html";
		if(orginal.equals(expected))
		{
			System.out.println("URL MATCHED");
		}
		else
		{
			System.out.println("URL NOT MATCHED");
		}
		
		



	}

}
