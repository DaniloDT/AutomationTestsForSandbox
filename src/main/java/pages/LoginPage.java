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
    //Populate User Name field
    public void setUserName(String name)
    {
        driver.findElement(userNameField).sendKeys(name);
    }
    //Populate Password field
    public void setPassword(String password)
    {
        driver.findElement(passwordField).sendKeys(password);
    }
    //Click on Submit button and navigate to the Dashboard page
    public DashbordPage  clickSubmitButton()
    {
        driver.findElement(submitBtn).click();
        return new DashbordPage(driver);
    }
    //Populate credentials and logging into Dashboard of Sandbox
    public DashbordPage LoginWithCredentials()
    {
        setUserName("danilokukric988@gmail.com");
        setPassword("3SaFUqT6CtFBtvC");
        clickSubmitButton();
        return new DashbordPage(driver);
    }
}
