package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DeleteFrame extends BasePage {

    public DeleteFrame (WebDriver driver)
    {
        super(driver);
    }

    // Delete action button
    private By deleteActionButton= By.cssSelector(".btn.btn-danger.btn-lg");

    //Confirm btn for Deleting use case
    public void clickDeleteBtn ()
    {
        wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(deleteActionButton))).click();
    }
}
