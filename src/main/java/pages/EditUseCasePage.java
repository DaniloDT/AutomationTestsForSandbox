package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditUseCasePage extends BasePage{

    public EditUseCasePage(WebDriver driver)
    {
        super(driver);
    }

    private By deleteUseCaseBtn = By.cssSelector(".btn.btn-dark.btn-lg.btn-secondary.mb-3.ml-2.pull-right");

    public DeleteFrame clickDeleteUseCaseBtn()
    {
        driver.findElement(deleteUseCaseBtn).click();
        return new DeleteFrame(driver);
    }
}