import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class maryland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.echoecho.com/htmlforms10.htm");
	
	//Select s=new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));
	//s.selectByValue("USD");
	driver.findElement(By.xpath(".//input[@value='Cheese']")).click();
System.out.println(driver.findElements(By.xpath("//input[@value='group1']")).size());
	//#destination_publishing_iframe_spicejet_0
	//driver.findElement(By.xpath("//input[@value='Log In']")).click();
	//driver.findElement(By.xpath("//input[@maxlength='64' and id='userName']")).sendKeys("Tanzina");
	//driver.findElement(By.xpath("//input[@maxlength='60' and name='firstName']")).sendKeys("Tanzina");
	//driver.findElement(By.xpath("//input[@maxlength='60' and name='firstName']")).sendKeys("Tanzina");

	}

}