package Basicss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ownXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys("chdhdh");;

	}

}
