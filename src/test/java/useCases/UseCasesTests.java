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
                .setDescription("The created team should be displayed and available under the \"Select Team\" drop down list"+
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
                .setUsecaseStepFour("Populate the \"Team Title\" text field (this field is required)")
                .clickAddStep()
                .setUsecaseStepFive("Click on \"Submit\" action button")
                .setAutomatedCheckbox();
        var useCases=useCaseForm.clickSubmitButton();
        //Check is Use Case created
        assertTrue(useCases.useCaseIsCreated(),"Use case is not created!");
        //Check is Use Case has a correct title
        assertEquals (useCases.getFirstUseCaseName(),"Create Team","Use case has a wrong name");
    }
    @Test
    public void UseCaseForCreateSeniorityTest()
    {
        UseCasesPage useCasePage= new UseCasesPage(driver);
        var useCaseForm = useCasePage.clickOnCreateUseCaseBtn()
                .setTitle("Create Seniority")
                .setDescription("The created Seniority should be displayed and avilable under the \"Select seniority\" drop down list" +
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
                .setUsecaseStepFour("Populate the \"Seniority Title\" text field (this field is required)")
                .clickAddStep()
                .setUsecaseStepFive("Click on \"Submit\" action button")
                .setAutomatedCheckbox();
        var useCases=useCaseForm.clickSubmitButton();
        //Check is Use Case created
         assertTrue(useCases.useCaseIsCreated(),"Use case is not created!");
        //Check is Use Case has a correct title
         assertEquals (useCases.getFirstUseCaseName(),"Create Seniority","Use case has a wrong name");

    }

}
