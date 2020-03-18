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
    protected QASandboxPage sandboxPage;

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
        sandboxPage = new QASandboxPage(driver);
        //CLick on login button
        var loginPage = sandboxPage.clicklogin();
        //Login with credentials and navigate to dashboard page
        var dashboardPage = loginPage.LoginWithCredentials();
        dashboardPage.clickOnUseCasesSection();
    }

    @AfterClass
    //Quit the session
    public void tearDown(){
        driver.quit();
    }


}
