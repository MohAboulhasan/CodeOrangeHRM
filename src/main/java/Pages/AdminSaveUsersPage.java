package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminSaveUsersPage {
    WebDriver driver;

    public AdminSaveUsersPage(WebDriver driver) {
        this.driver = driver;
    }

    private By usernamefield = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input");
    private By passwordfield = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input");
    private By confirmpasswordfield = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input");

    private By userroledropdownbutton = By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']");
    private By optionroleadmin = By.xpath("(//div[@role='listbox'] //child::div)[2]");

    private By statusdropdownButton = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i");
    private By optionstatusenabled = By.xpath("(//div[@role='listbox'] //child::div)[2]");

    private By employeehint = By.xpath("//input[@placeholder='Type for hints...']");
    private By optionhint = By.xpath("(//div[@role='listbox'] //child::div)[1]");

    private By savebutton = By.xpath("//button[@type='submit']");

    public void enterUsername(String usernamesave) {

        driver.findElement(usernamefield).sendKeys(usernamesave);
    }

    public void enterPassword(String passwordsave) {

        driver.findElement(passwordfield).sendKeys(passwordsave);
    }

    public void enterconfirmPassword(String confirmpasswordsave) {

        driver.findElement(confirmpasswordfield).sendKeys(confirmpasswordsave);
    }

    public void selectUserRole() {

        driver.findElement(userroledropdownbutton).click();
        driver.findElement(optionroleadmin).click();
    }

    public void employeeName() throws InterruptedException {

        driver.findElement(employeehint).sendKeys("a");
        Thread.sleep(3000);
        driver.findElement(optionhint).click();
    }

    public void selectUserStatus() {

        driver.findElement(statusdropdownButton).click();
        driver.findElement(optionstatusenabled).click();
    }

    public void saveUserData() {

        driver.findElement(savebutton).click();

    }
}





