import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SelIntroduction {
	//Invoking browser using edge driver
	//download the corresponding driver like chrome,firefox
	//windows - .exe
	//import package related to the drivers

	public static void main(String[] args) {
		//seleniumManager (beta phase) is stable we need not use system.out.println
	System.setProperty("webdriver.edge.driver","C:\\Users\\prasa\\Documents\\edgedriver_win64\\msedgedriver.exe");	
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //driver.close();
        
	}

}
