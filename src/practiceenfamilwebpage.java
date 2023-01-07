import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practiceenfamilwebpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver","C:\\Users\\prasa\\Documents\\edgedriver_win64\\msedgedriver.exe");	
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.enfamil.ca/user/login");
		driver.findElement(By.id("edit-name")).sendKeys("prasannarahavig@gmail.com");
		driver.findElement(By.id("edit-pass")).sendKeys("Welcome@01");
	    driver.findElement(By.id("edit-submit")).click();
	}
}