package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateBy_ClassName {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement username=driver.findElement(By.className("email-input"));
        username.sendKeys("Kshitija");
        WebElement password=driver.findElement(By.className("form-control"));
        password.sendKeys("123456");
        WebElement login=driver.findElement(By.className("signin-btn"));
        login.click();
	}

}
