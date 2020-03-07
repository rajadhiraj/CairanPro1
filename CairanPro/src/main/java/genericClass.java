import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class genericClass {

	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		driver= new ChromeDriver();
	}

}
