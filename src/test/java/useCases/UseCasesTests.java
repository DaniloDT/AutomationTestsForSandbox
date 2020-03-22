package useCases;

import base.BaseTest;
import static org.testng.Assert.*;

import com.aventstack.extentreports.Status;
import javafx.animation.Animation;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.DashbordPage;
import pages.UseCaseFormPage;
import pages.UseCasesPage;

public class UseCasesTests extends BaseTest {

    @Test
    public  void UseCaseForCreateTeamTest()
    {
        var useCaseForm = useCasesPage.clickOnCreateUseCaseBtn()
                .setTitle("Create Team")
                .setDescription("Created Team should be displayed and available under the \"Select Team\" drop down list"+
                        " on a form for creating a new person( PEOPLE -> CREATE PERSON -> SELECT TEAM dropdown list )")
                .setExpectedResults("Team should be created and displayed under the \"Teams\" list with option for editing and deleting")
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
        extentTest=extent.createTest("UseCaseForCreateTeamTest");
    }
    @Test
    public void UseCaseForCreateSeniorityTest()
    {
        var useCaseForm = useCasesPage.clickOnCreateUseCaseBtn()
                .setTitle("Create Seniority")
                .setDescription("Created Seniority should be displayed and available under the \"Select seniority\" drop down list" +
                        " on a form for creating a new person (PEOPLE -> CREATE PERSON -> SELECT SENIORITY dropdown list)")
                .setExpectedResults("Seniority should be created and displayed under the Seniorities list with option for editing and deleting")
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
         extentTest=extent.createTest("UseCaseForCreateSeniorityTest");
    }
    @Test
    public void UseCaseForCreateTechnologyTest()
    {
        var useCaseForm = useCasesPage.clickOnCreateUseCaseBtn()
                .setTitle("Create Technology")
                .setDescription("Created Technology should be displayed and available under the \"Select technologies\" drop down list" +
                        " on a form for creating a new person (PEOPLE -> CREATE PERSON -> SELECT TECHNOLOGY dropdown list)")
                .setExpectedResults("Technology should be created and displayed under the Technologies list with option for editing and deleting")
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
        extentTest=extent.createTest("UseCaseForCreateTechnologyTest");
    }
   @Test
    public void UseCaseForCreatePersonTest()
    {
        var useCaseForm = useCasesPage.clickOnCreateUseCaseBtn()
                .setTitle("Create Person")
                .setDescription("Created people should be displayed available under the \"Select People\" dropdown list" +
                        " in Project section on a form for creating a new Project( PROJECTS-> CREATE PROJECT -> SELECT PEOPLEdropdown list)")
                .setExpectedResults("Person should be created and displayed under the Technologies list with option for editing and deleting")
                .setUsecaseStep("Preconditions: User is logged in")
                .clickAddStep()
                .setUsecaseStepOne("Navigate to Playground section by clicking on it")
                .clickAddStep()
                .setUsecaseStepTwo("Navigate to \"PEOPLE\" tab by clicking on it")
                .clickAddStep()
                .setUsecaseStepThree("Click on \"+ CREATE PERSON\" action button")
                .clickAddStep()
                .setUsecaseStepFour("Populate \"Full Name\" text field (this field is required " +
                        "and has validation that Title needs to be between 4 and 50 characters )")
                .clickAddStep()
                .setUsecaseStepFive("Select technologies from \"Select technologies\"" +
                        " drop down list ( you can add multiple technologies " +
                        " but technologies must be created previously on Technology section" +
                        " what is described under the \"Create Technology\" use case)")
                .clickAddStep()
                .setUsecaseStepSix("Select seniority from \"Select seniority\" drop down list" +
                        " ( Seniority must be created previously on Seniority section " +
                        " what is described under the \"Create Seniority\" use case)")
                .clickAddStep()
                .setUsecaseStepSeven("Select team from \"Select team\" drop down list " +
                        "( Team must be created previously on Teams section" +
                        " what is described under the \"Create Team\" use case)")
                .clickAddStep()
                .setUsecaseStepEight("Click on \"Submit\" action button")
                .clickAddStep()
                .setUsecaseStepNine("NOTE: Technologies, Seniority and Team fields are not mandatory!")
                .setAutomatedCheckbox();
        var useCases=useCaseForm.clickSubmitButton();
        //Check is Use Case created
        assertTrue(useCases.useCaseIsCreated(),"Use case Create Person is not created!");
        //Check is Use Case has a correct title
        assertEquals (useCases.getFirstUseCaseName(),"Create Person","Use case Create Technology has a wrong name");
        extentTest=extent.createTest("UseCaseForCreatePersonTest");
    }
    @Test
    public void UseCaseForCreateProjectTest()
    {
        var useCaseForm = useCasesPage.clickOnCreateUseCaseBtn()
                .setTitle("Create Project")
                .setDescription("Information about person which is added to the project with seniority" +
                        ", technologies and team where added person belong ( previously defined in People section" +
                        " for more details see \"Create People\" use case) , should be displayed for each created project!")
                .setExpectedResults("Project should be created and displayed under the Technologies list with option for editing and deleting")
                .setUsecaseStep("Preconditions: User is logged in")
                .clickAddStep()
                .setUsecaseStepOne("Navigate to Playground section by clicking on it")
                .clickAddStep()
                .setUsecaseStepTwo("Navigate to \"PROJECT\" tab by clicking on it")
                .clickAddStep()
                .setUsecaseStepThree("Click on \"+ CREATE PROJECT\" action button")
                .clickAddStep()
                .setUsecaseStepFour("Populate \"Project Title\" text field (this field is required")
                .clickAddStep()
                .setUsecaseStepFive("Select people from \"Select people\" dropdown list" +
                        " (you can add multiple people" +
                        " people must be created previously on the People section" +
                        " what is described under the \"Create People\" use case)")
                .clickAddStep()
                .setUsecaseStepSix("Click on \"Submit\" action button")
                .setAutomatedCheckbox();
        var useCases=useCaseForm.clickSubmitButton();
        //Check is Use Case created
        assertTrue(useCases.useCaseIsCreated(),"Use case Create Project is not created!");
        //Check is Use Case has a correct title
        assertEquals (useCases.getFirstUseCaseName(),"Create Project","Use case Create Project has a wrong name");
        extentTest=extent.createTest("UseCaseForCreateProjectTest");
    }
    @Test()
    public void checkNoOfCharactersForAllFieldsInEditedTest()
    {
        UseCaseFormPage useCaseFormPage= new UseCaseFormPage(driver);
        var editUseCase = useCasesPage.clickUseCase();
        int noCharactersTitle = editUseCase.getfieldlength(useCaseFormPage.titleField);
        editUseCase.setTitle("This field previously had "+ noCharactersTitle + " characters");
        int noCharactersDesc = editUseCase.getDescriptionFieldLength();
        editUseCase.setDescription("This field previously had "+ noCharactersDesc + " characters");
        int noCharactersExpectResult = editUseCase.getfieldlength(useCaseFormPage.expectedResultField);
        editUseCase.setExpectedResults("This field previously had "+ noCharactersExpectResult + " characters");
        int noCharactersZeroStep = editUseCase.getfieldlength(useCaseFormPage.useCaseStep0);
        editUseCase.setUsecaseStep("This field previously had "+ noCharactersZeroStep + " characters");
        int noCharactersFirstStep = editUseCase.getfieldlength(useCaseFormPage.useCaseStep1);
        editUseCase.setUsecaseStepOne("This field previously had "+ noCharactersFirstStep + " characters");
        int noCharactersSecondStep = editUseCase.getfieldlength(useCaseFormPage.useCaseStep2);
        editUseCase.setUsecaseStepTwo("This field previously had "+ noCharactersSecondStep + " characters");
        int noCharactersThirdStep = editUseCase.getfieldlength(useCaseFormPage.useCaseStep3);
        editUseCase.setUsecaseStepThree("This field previously had "+ noCharactersThirdStep + " characters");
        int noCharactersFourStep = editUseCase.getfieldlength(useCaseFormPage.useCaseStep4);
        editUseCase.setUsecaseStepFour("This field previously had "+ noCharactersFourStep + " characters");
        int noCharactersFiveStep = editUseCase.getfieldlength(useCaseFormPage.useCaseStep5);
        editUseCase.setUsecaseStepFive("This field previously had "+ noCharactersFiveStep + " characters");
        var useCases= useCaseFormPage.clickSubmitButton();
        //Check is Use Case created
        assertTrue(useCases.useCaseIsCreated(),"Use case for checking no of characters is not created!");
        //Check is Use Case has a correct title
        assertEquals (useCases.getFirstUseCaseName(),"This field previously had " + noCharactersTitle + " characters","Use case has a wrong name");
        extentTest=extent.createTest("checkNoOfCharactersForAllFieldsInEditedTest");
    }
}
