package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminViewUsersPage {
    WebDriver driver;

    public AdminViewUsersPage(WebDriver driver) {

        this.driver = driver;
    }

    private By record = By.xpath("//span[@class='oxd-text oxd-text--span']");
    private By addbutton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
    private By usernamebox = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input");
    private By searchbutton = By.xpath("//button[@type='submit']");
    private By deleteicon = By.xpath("//i[@class ='oxd-icon bi-trash']");
    private By confirmdelete = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']");


    public String recordnumber() {
        String text = driver.findElement(record).getText();
        return text;
    }

    public void searchUsername(String usernameS) {

        driver.findElement(usernamebox).sendKeys(usernameS);
    }

    public void clickSearch() {

        driver.findElement(searchbutton).click();
    }

    public void clickDelete() {

        driver.findElement(deleteicon).click();
    }

    public void confirmDelete() {

        driver.findElement(confirmdelete).click();
    }

    public AdminSaveUsersPage clickOnAddButton() {
        driver.findElement(addbutton).click();
        return new AdminSaveUsersPage(driver);
    }
}

