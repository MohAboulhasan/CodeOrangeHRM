package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    WebDriver driver;

    public DashboardPage(WebDriver driver) {

        this.driver = driver;
    }

    private By admintab = By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']");

    public AdminViewUsersPage clickOnAdminButton() {
        driver.findElement(admintab).click();
        return new AdminViewUsersPage(driver);

    }
}
