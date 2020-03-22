package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditUseCasePage extends BasePage{

    public EditUseCasePage(WebDriver driver)
    {
        super(driver);
    }
    //Delete use case button
    private By deleteUseCaseBtn = By.cssSelector(".btn.btn-dark.btn-lg.btn-secondary.mb-3.ml-2.pull-right");
    //Click on delete use case button and navigate to Delete frame
    public DeleteFrame clickDeleteUseCaseBtn()
    {
        try {
            Thread.sleep(2000);
        } catch  (InterruptedException e) {
            e.printStackTrace();
        }
       driver.findElement(deleteUseCaseBtn).click();
        return new DeleteFrame(driver);
    }
}
