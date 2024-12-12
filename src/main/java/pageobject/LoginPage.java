package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    private static final By USER_PASS = By.xpath("//input[@name='password']");
    private static final By USER_NAME = By.xpath("//input[@name='username']");
    private static final By ENTER_BUTTON = By.xpath("//button[@type='submit']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUserName(String userName){
        driver.findElement(USER_NAME).sendKeys(userName);
    }

    public void enterUserPass(String userPass){
        driver.findElement(USER_PASS).sendKeys(userPass);
    }

    public void clickLogin(){
        driver.findElement(ENTER_BUTTON).click();
    }
}
