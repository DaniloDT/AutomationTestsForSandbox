package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UseCasesPage extends BasePage{

    public UseCasesPage (WebDriver driver)
    {
        super(driver);
    }
    //Create Use Case button
    private By createUseCaseBtn=By.linkText("CREATE USE CASE");
    //First Use case on the list
    private By firstUseCase=By.cssSelector(".list-group.mt-5 > a:nth-of-type(1)");
    //Click create use case button and navigate to use case form page
    public UseCaseFormPage clickOnCreateUseCaseBtn()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(createUseCaseBtn).click();
        return new UseCaseFormPage(driver);
    }
    //Get text from first use case on the list
    public String  getFirstUseCaseName()
    {
        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(firstUseCase))).getText();
    }
    //Check is first use case on the list displayed
    public boolean useCaseIsCreated()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(firstUseCase).isDisplayed();
        return true;
    }
    //Edit use case
    public EditUseCasePage editUseCase()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(firstUseCase).click();
        return new  EditUseCasePage(driver);
    }
    //Click on first use case and navigate to use case form
    public UseCaseFormPage clickUseCase()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(firstUseCase).click();
        return new  UseCaseFormPage(driver);
    }
}
