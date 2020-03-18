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
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
       // goSandbox();
        driver.get("https://qa-sandbox.apps.htec.rs/");
        sandboxPage = new QASandboxPage(driver);
        var loginPage = sandboxPage.clicklogin();
        var dashboardPage = loginPage.LoginWithCredentials();
        dashboardPage.clickOnUseCasesSection();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }


}
