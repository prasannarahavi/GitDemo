import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Text/ error messages are not displayed due to time duration
		// so we use IMPLICIT WAIT - 2 seconds time out
		System.setProperty("webdriver.edge.driver","C:\\Users\\prasa\\Documents\\edgedriver_win64\\msedgedriver.exe");	
		WebDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.findElement(By.id("ap_email")).sendKeys("prasannarahavi14@gmail.com");
	    driver.findElement(By.className("a-button-input")).click();
		//valid password//
	    //driver.findElement(By.id("ap_password")).sendKeys("Welcome@01");
	    
	    //invalid password//
	    
	    driver.findElement(By.id("ap_password")).sendKeys("Welcome@0");
	    driver.findElement(By.className("a-button-input")).click();
	    System.out.println(driver.findElement(By.cssSelector("span.a-list-item")).getText());
	    driver.findElement(By.linkText("Forgot Password")).click();
	}
}
