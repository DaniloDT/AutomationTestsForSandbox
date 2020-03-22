package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DashbordPage extends BasePage{

    public DashbordPage(WebDriver driver)
    {
        super(driver);
    }
    //Use case section locator
    private By useCasesSection= By.cssSelector(".row > div:nth-of-type(2) .card-body");
    //Click on use Cases Secation and navigate to the Use Case page
    public UseCasesPage clickOnUseCasesSection()
    {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(useCasesSection))).click();
        return new UseCasesPage(driver);
    }
}
