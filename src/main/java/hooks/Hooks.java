package hooks;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Base64;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks {
	
	public WebDriver driver;
	public Logger logger;
	public Properties p;
	String webURL;
	String userName;
	String password;
	
	@Before
	public void setUp(Scenario scenario) throws InterruptedException, IOException
	{
		//Loading config.properties file
		
		FileReader file = new FileReader("./src//test//resources//config.properties");
		Properties p = new Properties();
		p.load(file);
		
		logger = LogManager.getLogger(this.getClass());	
		
		driver = new ChromeDriver();	
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		//driver.get("https://demo.opencart.com/");
		
		//Thread.sleep(20000);
		
		webURL = p.getProperty("appURL1"); //reading URL from properties file
		userName = p.getProperty("userName");
		password = p.getProperty("password");
	}
	
	@BeforeStep()
	public void actionBeforeEachStep(Scenario scenario)
	{
		System.out.println("Execution started for step "+scenario);
	}
	
	@AfterStep()
	public void actionPostEachStep(Scenario scenario)
	{
		if (scenario.isFailed())
		{
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png",scenario.getName());
		}
		//scenario.attach(screenshot, password, userName)
	}
	
	@After
	public void tearDown(Scenario scenario)
	{
		driver.quit();
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public String getURL() {
		return webURL;
	}
	
	public String getuserName() {
		return userName;
	}
	
	public String getPassword() {
		return password;
	}
	
}
