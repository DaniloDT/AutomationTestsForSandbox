package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QASandboxPage extends BasePage
{

    public QASandboxPage(WebDriver driver)
    {
     super(driver);
    }
    //Login button
    private By login= By.cssSelector(".btn.btn-lg.btn-secondary");
    //Click on Login button and navigate to the Login page
    public LoginPage clicklogin()
    {
        driver.findElement(login).click();
        return new LoginPage(driver);
    }
}
