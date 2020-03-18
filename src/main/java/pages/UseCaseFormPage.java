package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.DoubleSummaryStatistics;

public class UseCaseFormPage extends BasePage{

    private By titleField= By.name("title");
    private By descriptionField=By.name("description");
    private By expectedResultField=By.name("expected_result");
    private By automatedCheckbox=By.cssSelector("[for]");
    private By useCaseStep0 =By.name("testStepId-0");
    private By useCaseStep1 =By.name("testStepId-1");
    private By useCaseStep2 =By.name("testStepId-2");
    private By useCaseStep3 =By.name("testStepId-3");
    private By useCaseStep4=By.name("testStepId-4");
    private By useCaseStep5=By.name("testStepId-5");
    private By useCaseStep6=By.name("testStepId-6");
    private By useCaseStep7=By.name("testStepId-7");
    private By useCaseStep8=By.name("testStepId-8");
    private By useCaseStep9=By.name("testStepId-9");

    private By addStepBtn=By.cssSelector("[class='btn btn-light mb-3 addTestStep '] span");
    private By submitBtn=By.cssSelector("form > .btn.btn-primary.float-right.mt-4");

    public UseCaseFormPage (WebDriver driver)
    {
        super(driver);
    }

    public UseCaseFormPage setTitle(String title)
    {
        driver.findElement(titleField).sendKeys(title);
        return this;
    }
    public UseCaseFormPage setDescription(String desc)
    {
        driver.findElement(descriptionField).sendKeys(desc);
        return this;
    }
    public UseCaseFormPage setExpectedResults(String expectedResults)
    {
        driver.findElement(expectedResultField).sendKeys(expectedResults);
        return this;
    }
    public UseCaseFormPage setAutomatedCheckbox()
    {
        driver.findElement(automatedCheckbox).click();
        return this;
    }
    public UseCaseFormPage clickAddStep()
    {
        driver.findElement(addStepBtn).click();
        return this;
    }
    public UseCaseFormPage  setUsecaseStep(String step)
    {
        driver.findElement(useCaseStep0).sendKeys(step);
        return this;
    }
    public UseCaseFormPage  setUsecaseStepOne(String step)
    {
        driver.findElement(useCaseStep1).sendKeys(step);
        return this;
    }
    public UseCaseFormPage  setUsecaseStepTwo(String step)
    {
        driver.findElement(useCaseStep2).sendKeys(step);
        return this;
    }
    public UseCaseFormPage  setUsecaseStepThree(String step)
    {
        driver.findElement(useCaseStep3).sendKeys(step);
        return this;
    }
    public UseCaseFormPage  setUsecaseStepFour(String step)
    {
        driver.findElement(useCaseStep4).sendKeys(step);
        return this;
    }
    public UseCaseFormPage  setUsecaseStepFive(String step)
    {
        driver.findElement(useCaseStep5).sendKeys(step);
        return this;
    }
    public UseCaseFormPage  setUsecaseStepSix(String step)
    {
        driver.findElement(useCaseStep6).sendKeys(step);
        return this;
    }
    public UseCaseFormPage  setUsecaseStepSeven(String step)
    {
        driver.findElement(useCaseStep7).sendKeys(step);
        return this;
    }
    public UseCaseFormPage  setUsecaseStepEight(String step)
    {
        driver.findElement(useCaseStep8).sendKeys(step);
        return this;
    }
    public UseCaseFormPage  setUsecaseStepNine(String step)
    {
        driver.findElement(useCaseStep9).sendKeys(step);
        return this;
    }

    public  UseCasesPage clickSubmitButton()
    {
        driver.findElement(submitBtn).click();
        return new UseCasesPage(driver);
    }
}
