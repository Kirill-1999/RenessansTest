package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    WebDriver driver;
    private static final By PIM = By.xpath("//input[@name='password']");

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

}
