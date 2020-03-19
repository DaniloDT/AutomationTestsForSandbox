package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    //User Name text field
    private By userNameField= By.name("email");
    //Password text field
    private By passwordField=By.name("password");
    //Submit button
    private By submitBtn=By.cssSelector("form > .btn.btn-block.btn-primary.mt-4");

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }
    //Populate credentials and logging into Dashboard of Sandbox
    public DashbordPage LoginWithCredentials(String name, String password)
    {
        driver.findElement(userNameField).sendKeys(name);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(submitBtn).click();
        return new DashbordPage(driver);
    }
}
