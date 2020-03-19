package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import pages.QASandboxPage;
import pages.DashbordPage;
import pages.UseCasesPage;

public class BaseTest {
    protected WebDriver driver;
    protected UseCasesPage useCasesPage;

    @BeforeClass
    public void setUp(){
        //Path to chromedriver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //Driver instantiation
        driver = new ChromeDriver();
        //Maximize browser window
        driver.manage().window().maximize();
        //Navigate to URL
        driver.get("https://qa-sandbox.apps.htec.rs/");
        var sandboxPage = new QASandboxPage(driver);
        //CLick on login button
        var loginPage = sandboxPage.clicklogin();
        //Login with credentials and navigate to dashboard page
        var dashboardPage = loginPage.LoginWithCredentials("danilokukric988@gmail.com","3SaFUqT6CtFBtvC");
        dashboardPage.clickOnUseCasesSection();
        useCasesPage = new UseCasesPage(driver);
    }
    @AfterClass
    //Quit the session
    public void tearDown(){
        driver.quit();
    }
}
