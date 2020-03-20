package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UseCaseFormPage extends BasePage{


    public UseCaseFormPage (WebDriver driver)
    {
        super(driver);
    }
    //Title text field
    private By titleField= By.cssSelector("input[name='title']");
    //Description text field
    private By descriptionField=By.name("description");
    //Expected result text field
    private By expectedResultField=By.name("expected_result");
    //Automated checkbox
    private By automatedCheckbox=By.cssSelector("[for]");
    //Use case step0 text field
    private By useCaseStep0 =By.name("testStepId-0");
    //Use case step1 text field
    private By useCaseStep1 =By.name("testStepId-1");
    //Use case step2 text field
    private By useCaseStep2 =By.name("testStepId-2");
    //Use case step3 text field
    private By useCaseStep3 =By.name("testStepId-3");
    //Use case step4 text field
    private By useCaseStep4=By.name("testStepId-4");
    //Use case step5 text field
    private By useCaseStep5=By.name("testStepId-5");
    //Use case step6 text field
    private By useCaseStep6=By.name("testStepId-6");
    //Use case step6 text field
    private By useCaseStep7=By.name("testStepId-7");
    //Use case step7 text field
    private By useCaseStep8=By.name("testStepId-8");
    //Use case step8 text field
    private By useCaseStep9=By.name("testStepId-9");
    //Add step case button
    private By addStepBtn=By.cssSelector("[class='btn btn-light mb-3 addTestStep '] span");
    //Submit button for creating use case
    private By submitBtn=By.cssSelector("form > .btn.btn-primary.float-right.mt-4");
    //Populate title text field
    public UseCaseFormPage setTitle(String title)
    {
       var titleBox= driver.findElement(titleField);
        titleBox.clear();
        titleBox.sendKeys(title);
        return this;
    }
    //Populate description text field
    public UseCaseFormPage setDescription(String desc)
    {
        driver.findElement(descriptionField).sendKeys(desc);
        return this;
    }
    //Populate expected result text field
    public UseCaseFormPage setExpectedResults(String expectedResults)
    {
        driver.findElement(expectedResultField).sendKeys(expectedResults);
        return this;
    }
    //Switch Automated checkbox
    public UseCaseFormPage setAutomatedCheckbox()
    {
        driver.findElement(automatedCheckbox).click();
        return this;
    }
    //Click add step button for adding new use case steps
    public UseCaseFormPage clickAddStep()
    {
        driver.findElement(addStepBtn).click();
        return this;
    }
    //Populate use case step text field
    public UseCaseFormPage  setUsecaseStep(String step)
    {
        driver.findElement(useCaseStep0).sendKeys(step);
        return this;
    }
    //Populate use case step one text field
    public UseCaseFormPage  setUsecaseStepOne(String step)
    {
        driver.findElement(useCaseStep1).sendKeys(step);
        return this;
    }
    //Populate use case step two text field
    public UseCaseFormPage  setUsecaseStepTwo(String step)
    {
        driver.findElement(useCaseStep2).sendKeys(step);
        return this;
    }
    //Populate use case step three text field
    public UseCaseFormPage  setUsecaseStepThree(String step)
    {
        driver.findElement(useCaseStep3).sendKeys(step);
        return this;
    }
    //Populate use case step four text field
    public UseCaseFormPage  setUsecaseStepFour(String step)
    {
        driver.findElement(useCaseStep4).sendKeys(step);
        return this;
    }
    //Populate use case step five text field
    public UseCaseFormPage  setUsecaseStepFive(String step)
    {
        driver.findElement(useCaseStep5).sendKeys(step);
        return this;
    }
    //Populate use case step six text field
    public UseCaseFormPage  setUsecaseStepSix(String step)
    {
        driver.findElement(useCaseStep6).sendKeys(step);
        return this;
    }
    //Populate use case step seven text field
    public UseCaseFormPage  setUsecaseStepSeven(String step)
    {
        driver.findElement(useCaseStep7).sendKeys(step);
        return this;
    }
    //Populate use case step eight text field
    public UseCaseFormPage  setUsecaseStepEight(String step)
    {
        driver.findElement(useCaseStep8).sendKeys(step);
        return this;
    }
    //Populate use case step nine text field
    public UseCaseFormPage  setUsecaseStepNine(String step)
    {
        driver.findElement(useCaseStep9).sendKeys(step);
        return this;
    }
    //Click on submit button and navigate to UseCasePage
    public  UseCasesPage clickSubmitButton()
    {
        driver.findElement(submitBtn).click();
        return new UseCasesPage(driver);
    }

}
