package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UseCaseFormPage extends BasePage{


    public UseCaseFormPage (WebDriver driver)
    {
        super(driver);
    }
    //Title text field
    public By titleField= By.name("title");
    //Description text field
    public By descriptionField=By.name("description");
    //Expected result text field
    public By expectedResultField=By.name("expected_result");
    //Automated checkbox
    private By automatedCheckbox=By.cssSelector("[for]");
    //Use case step0 text field
    public By useCaseStep0 =By.name("testStepId-0");
    //Use case step1 text field
    public By useCaseStep1 =By.name("testStepId-1");
    //Use case step2 text field
    public By useCaseStep2 =By.name("testStepId-2");
    //Use case step3 text field
    public By useCaseStep3 =By.name("testStepId-3");
    //Use case step4 text field
    public By useCaseStep4=By.name("testStepId-4");
    //Use case step5 text field
    public By useCaseStep5=By.name("testStepId-5");
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
        var descBox=driver.findElement(descriptionField);
        descBox.clear();
        descBox.sendKeys(desc);
        return this;
    }
    //Populate expected result text field
    public UseCaseFormPage setExpectedResults(String expectedResults)
    {
        var expectResult= driver.findElement(expectedResultField);
        expectResult.clear();
        expectResult.sendKeys(expectedResults);
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
        var useCase= driver.findElement(useCaseStep0);
        useCase.clear();
        useCase.sendKeys(step);
        return this;
    }
    //Populate use case step one text field
    public UseCaseFormPage  setUsecaseStepOne(String step)
    {
        var useCase1= driver.findElement(useCaseStep1);
        useCase1.clear();
        useCase1.sendKeys(step);
        return this;
    }
    //Populate use case step two text field
    public UseCaseFormPage  setUsecaseStepTwo(String step)
    {
        var useCase2= driver.findElement(useCaseStep2);
        useCase2.clear();
        useCase2.sendKeys(step);
        return this;
    }
    //Populate use case step three text field
    public UseCaseFormPage  setUsecaseStepThree(String step)
    {
        var useCase3= driver.findElement(useCaseStep3);
        useCase3.clear();
        useCase3.sendKeys(step);
        return this;
    }
    //Populate use case step four text field
    public UseCaseFormPage  setUsecaseStepFour(String step)
    {
        var useCase4= driver.findElement(useCaseStep4);
        useCase4.clear();
        useCase4.sendKeys(step);
        return this;
    }
    //Populate use case step five text field
    public UseCaseFormPage  setUsecaseStepFive(String step)
    {
        var useCase5= driver.findElement(useCaseStep5);
        useCase5.clear();
        useCase5.sendKeys(step);
        return this;
    }
    //Populate use case step six text field
    public UseCaseFormPage  setUsecaseStepSix(String step)
    {
        var useCase6= driver.findElement(useCaseStep6);
        useCase6.clear();
        useCase6.sendKeys(step);
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
    //Get number of characters for fields
    public int getfieldlength(By locator)
    {
        try {
            Thread.sleep(1000);
        } catch  (InterruptedException e) {
            e.printStackTrace();
        }
        String text = driver.findElement(locator).getAttribute("value");
        int count=0;
        for (int i=0; i<text.length(); i++)
        {
          if (text !=null && !text.isEmpty())
            {
                count++;
            }
        }
        return count;
    }
    //Get number of characters for description field
    public int getDescriptionFieldLength()
    {
        try {
            Thread.sleep(1000);
        } catch  (InterruptedException e) {
            e.printStackTrace();
        }
        String text = driver.findElement(descriptionField).getText();

        int count=0;

        for (int i=0; i<text.length(); i++)
        {
            if (text !=null && !text.isEmpty())
            {
                count++;
            }
        }
        return count;
    }
}
