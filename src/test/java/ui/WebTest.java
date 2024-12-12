package ui;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.LoginPage;

import java.time.Duration;

/*

 */

public class WebTest {
    protected final static String LOGIN_URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    protected final static String MAIN_URL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

    protected WebDriver driver;

    @BeforeEach
    public void init(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }

    public void openLoginPage(){
        driver.get(LOGIN_URL);
    }

    public void login(String userName, String userPass){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUserName(userName);
        loginPage.enterUserPass(userPass);
        loginPage.clickLogin();
    }

    public void openMainPage(){

    }
}
