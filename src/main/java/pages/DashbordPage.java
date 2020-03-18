package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DashbordPage extends BasePage{

    private By useCasesSection= By.cssSelector(".row > div:nth-of-type(2) .card-body");


    public DashbordPage(WebDriver driver)
    {
        super(driver);
    }

    public UseCasesPage clickOnUseCasesSection()
    {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(useCasesSection).click();
        return new UseCasesPage(driver);
    }
}
