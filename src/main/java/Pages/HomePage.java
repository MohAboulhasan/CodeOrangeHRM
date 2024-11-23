package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
     WebDriver driver;


    public HomePage(WebDriver driver) {
        this.driver = driver;


    }
    private   By username = By.name("username");
    private   By password = By.name("password");
    private   By loginbutton = By.className("oxd-button");

    public void insertUsername(String Username){
        driver.findElement(username).sendKeys(Username);
    }
    public void insertPassword(String Password){
        driver.findElement(password).sendKeys(Password);
    }
    public void clickLogin(){

        driver.findElement(loginbutton).click();
    }



    public  DashboardPage clickOnLoginButton(){
        driver.findElement(loginbutton).click();
        return new DashboardPage(driver);
    }
}
