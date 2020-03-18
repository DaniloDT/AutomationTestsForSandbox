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
                .setDescription("Description test")
                .setExpectedResults("Team has been created and displayed under the \"Teams\" list")
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
        //Check is Use Case has a correct name
        assertEquals (useCases.getFirstUseCaseName(),"Create Team","Use case has a wrong name");
    }

}
