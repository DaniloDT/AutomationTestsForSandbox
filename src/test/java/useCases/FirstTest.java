package useCases;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.BasePage;

public class FirstTest extends BaseTest {

    @Test
    public  void loginToSandboxPage()
    {
        var loginPage = sandboxPage.login();
        loginPage.setUserName("danilokukric988@gmail.com");
        loginPage.setPassword("3SaFUqT6CtFBtvC");
        loginPage.clickSubmitButton();
    }
}
