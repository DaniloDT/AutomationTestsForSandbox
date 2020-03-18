package useCases;

import base.BaseTest;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.DashbordPage;
import pages.UseCasesPage;

public class UseCasesTests extends BaseTest {

    @Test
    public  void UseCaseForCreateTeamTest()
    {
        UseCasesPage useCasePage= new UseCasesPage(driver);
        var useCaseForm = useCasePage.clickOnCreateUseCaseBtn()
                .setTitle("Create Team")
                .setDescription("Created Team should be displayed and available under the \"Select Team\" drop down list"+
                        " on a form for creating a new person( PEOPLE -> CREATE PERSON -> SELECT TEAM dropdown list )")
                .setExpectedResults("Team has been created and displayed under the \"Teams\" list with option for editing and deleting")
                .setUsecaseStep("Preconditions: User is logged in")
                .clickAddStep()
                .setUsecaseStepOne("Navigate to Playground section by clicking on it")
                .clickAddStep()
                .setUsecaseStepTwo("Navigate to \"TEAMS\" tab by clicking on it")
                .clickAddStep()
                .setUsecaseStepThree("Click on \"+ CREATE TEAM\" action button")
                .clickAddStep()
                .setUsecaseStepFour("Populate \"Team Title\" text field (this field is required)")
                .clickAddStep()
                .setUsecaseStepFive("Click on \"Submit\" action button")
                .setAutomatedCheckbox();
        var useCases=useCaseForm.clickSubmitButton();
        //Check is Use Case created
        assertTrue(useCases.useCaseIsCreated(),"Use case Create Team is not created!");
        //Check is Use Case has a correct title
        assertEquals (useCases.getFirstUseCaseName(),"Create Team","Use case Create Team has a wrong name");
    }
    @Test
    public void UseCaseForCreateSeniorityTest()
    {
        UseCasesPage useCasePage= new UseCasesPage(driver);
        var useCaseForm = useCasePage.clickOnCreateUseCaseBtn()
                .setTitle("Create Seniority")
                .setDescription("Created Seniority should be displayed and available under the \"Select seniority\" drop down list" +
                        " on a form for creating a new person (PEOPLE -> CREATE PERSON -> SELECT SENIORITY dropdown list)")
                .setExpectedResults("Seniority has been created and displayed under the Seniorities list with option for editing and deleting")
                .setUsecaseStep("Preconditions: User is logged in")
                .clickAddStep()
                .setUsecaseStepOne("Navigate to Playground section by clicking on it")
                .clickAddStep()
                .setUsecaseStepTwo("Navigate to \"SENIORITIES\" tab by clicking on it")
                .clickAddStep()
                .setUsecaseStepThree("Click on \"+ CREATE SENIORITY\" action button")
                .clickAddStep()
                .setUsecaseStepFour("Populate \"Seniority Title\" text field (this field is required" +
                        "and has validation that Title needs to be between 2 and 30 characters)")
                .clickAddStep()
                .setUsecaseStepFive("Click on \"Submit\" action button")
                .setAutomatedCheckbox();
        var useCases=useCaseForm.clickSubmitButton();
        //Check is Use Case created
         assertTrue(useCases.useCaseIsCreated(),"Use case Create Seniority is not created!");
        //Check is Use Case has a correct title
         assertEquals (useCases.getFirstUseCaseName(),"Create Seniority","Use case Create Seniority has a wrong name");
    }
    @Test
    public void UseCaseForCreateTechnologyTest()
    {
        UseCasesPage useCasePage= new UseCasesPage(driver);
        var useCaseForm = useCasePage.clickOnCreateUseCaseBtn()
                .setTitle("Create Technology")
                .setDescription("Created Technology should be displayed and available under the \"Select technologies\" drop down list" +
                        " on a form for creating a new person (PEOPLE -> CREATE PERSON -> SELECT TECHNOLOGY dropdown list)")
                .setExpectedResults("Technology has been created and displayed under the Technologies list with option for editing and deleting")
                .setUsecaseStep("Preconditions: User is logged in")
                .clickAddStep()
                .setUsecaseStepOne("Navigate to Playground section by clicking on it")
                .clickAddStep()
                .setUsecaseStepTwo("Navigate to \"TECHNOLOGIES\" tab by clicking on it")
                .clickAddStep()
                .setUsecaseStepThree("Click on \"+ CREATE TECHNOLOGY\" action button")
                .clickAddStep()
                .setUsecaseStepFour("Populate \"Technology Title\" text field (this field is required " +
                        "and has validation that Title needs to be between 2 and 30 characters )")
                .clickAddStep()
                .setUsecaseStepFive("Click on \"Submit\" action button")
                .setAutomatedCheckbox();
        var useCases=useCaseForm.clickSubmitButton();
        //Check is Use Case created
        assertTrue(useCases.useCaseIsCreated(),"Use case Create Technology is not created!");
        //Check is Use Case has a correct title
        assertEquals (useCases.getFirstUseCaseName(),"Create Technology","Use case Create Technology has a wrong name");
    }
}
