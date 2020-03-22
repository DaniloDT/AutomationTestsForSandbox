package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import pages.QASandboxPage;
import pages.UseCasesPage;

import java.util.Arrays;

public class BaseTest {
    protected WebDriver driver;
    protected UseCasesPage useCasesPage;
    public ExtentHtmlReporter htmlReporter;
    public ExtentReports extent;
    public ExtentTest extentTest;

    @BeforeClass
    public void setUp(){
        htmlReporter = new ExtentHtmlReporter("./reports/extent.html");
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setDocumentTitle("Automation Reports");
        htmlReporter.config().setReportName("Automation Test Results");
        htmlReporter.config().setTheme(Theme.STANDARD);

        extent= new ExtentReports();
        extent.setSystemInfo("Author","Danilo Kukric");
        extent.setSystemInfo("Browser","Chrome");
        extent.attachReporter(htmlReporter);

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
    @AfterMethod
    public void afterMethod(ITestResult result)
    {
        String methodName = result.getMethod().getMethodName();
        if(result.getStatus()==ITestResult.SUCCESS) {
            String logText = "<b>Test Method " + methodName + " Successful</b>";
            Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
            extentTest.log(Status.PASS, m);
        }else  if (result.getStatus()==ITestResult.FAILURE){
            String exceptionMessage= Arrays.toString(result.getThrowable().getStackTrace());
            extentTest .fail("<details><summary><b><font color=red>Exception Occured, click to see details:" +
                    "</font></b></summary>"+exceptionMessage.replaceAll(",", "<br>")+"</details\n");
             String logText="<b>Test Method "+ methodName +" Failed</b>";
             Markup m= MarkupHelper.createLabel(logText, ExtentColor.RED);
             extentTest.log(Status.FAIL,m);
        }else if(result.getStatus()==ITestResult.SKIP) {
            String logText = "<b>Test Method " + methodName + " Skipped</b>";
            Markup m = MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
            extentTest.log(Status.SKIP, m);
        }
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
        extent.flush();
    }
}
