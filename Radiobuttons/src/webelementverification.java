import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementverification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver.driver", "C:\\chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://booking.kayak.com/?&sid=81a6c4247f6dda457d4e713d19d90491/");
		System.out.println("Before clicking the Flight Button");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.findElement(By.xpath("//*[@id=\'JJ1B\']")).click();
		// driver.findElement(By.xpath("//*[@id=\'c5GUZ-201811\']/div/div[3]/div[5]/div[4]/div")).click();
		// driver.manage().window().maximize();

	}
}
