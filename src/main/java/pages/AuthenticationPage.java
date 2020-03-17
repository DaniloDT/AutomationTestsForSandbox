package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage extends BasePage
{
    //Login button
    private By login= By.cssSelector(".btn.btn-lg.btn-secondary");

public AuthenticationPage(WebDriver driver)
{
    super(driver);
}

//Click on Login button and navigate to the Login page
public LoginPage login()
{
    driver.findElement(login).click();
    return new LoginPage(driver);
}


}
