package accounting;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LoginPage;
import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class opensourcedemoSteps {
	
    static WebDriver driver;    
    LoginPage loginpage;
    static String URL, userName, Password;
    
    public opensourcedemoSteps(Hooks hooks){
    	driver = hooks.getDriver();
    	URL = hooks.getURL();
    	userName = hooks.getuserName();
    	Password = hooks.getPassword();
    }
    
    @Given("user is on login page")
    public void user_is_on_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("login page");
        //driver = new ChromeDriver();
        loginpage = new LoginPage(driver);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // driver.manage().window().maximize();
        driver.get(URL);
        //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("username is : " + userName +" and password is : " + Password);
        //driver.findElement(By.name("username")).sendKeys("Admin");
        //driver.findElement(By.name("password")).sendKeys("admin123");
        loginpage.enterUserName(userName);
        loginpage.enterPassword(Password);
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("login button");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        //loginobjects.submit();
    }

    @Then("user navigates to dashboard after successful login")
    public void user_navigates_to_dashboard_after_successful_login() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("successful login");
        assertEquals(driver.getTitle(),"OrangeHRM");
    }
    
    @Then("user fails to navigate to dashboard after successful login")
    public void user_fails_to_navigate_to_dashboard_after_successful_login() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("successful login");
        assertEquals(driver.getTitle(),"WrongTitle");
    }
    
    @Then("end the test")
    public void end_the_test() {
        // Write code here that turns the phrase above into concrete actions
		//driver.quit();
    }
}
