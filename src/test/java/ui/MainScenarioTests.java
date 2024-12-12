package ui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainScenarioTests extends WebTest {

    @Test
    public void scenarioTest(){
        doLogin();


    }

    private void doLogin(){
        openLoginPage();
        login("Admin", "admin123");
        Assertions.assertEquals(MAIN_URL, driver.getCurrentUrl());
    }
}
