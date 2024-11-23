package base;

import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTests {
    public WebDriver driver;
    public HomePage homePage;
@BeforeClass
public void setup() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    homePage = new HomePage(driver);
    goHome();
}
    @BeforeMethod
    public void goHome() {

        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    @AfterMethod
    public void Teardown() {
        driver.quit();
    }
}

