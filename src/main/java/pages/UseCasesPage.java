package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UseCasesPage extends BasePage{

    private By createUseCaseBtn=By.linkText("CREATE USE CASE");
    private By firstUseCase=By.cssSelector(".list-group.mt-5 > a:nth-of-type(1)");

    public UseCasesPage (WebDriver driver)
    {
        super(driver);
    }

    public UseCaseFormPage clickOnCreateUseCaseBtn()
    {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(createUseCaseBtn).click();
        return new UseCaseFormPage(driver);
    }
    public String  getFirstUseCaseName()
    {
        return   wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(firstUseCase))).getText();
        //wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(useCasesSection))).click();
         //return driver.findElement(firstUseCase).getText();

    }
    public boolean useCaseIsCreated()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(firstUseCase).isDisplayed();
        return true;
    }

    public EditUseCasePage clickFirstUseCase()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(firstUseCase).click();
        return new  EditUseCasePage(driver);
    }
}
