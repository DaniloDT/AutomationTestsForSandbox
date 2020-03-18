package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteFrame extends BasePage {

    public DeleteFrame (WebDriver driver)
    {
        super(driver);
    }

    private By deleteActionButton= By.cssSelector(".btn.btn-danger.btn-lg");

    public void clickDeleteBtn ()
    {
        driver.findElement(deleteActionButton).click();
    }
}
