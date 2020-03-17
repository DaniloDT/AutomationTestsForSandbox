package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AuthenticationPage;

public class BaseTest {
    protected WebDriver driver;
    protected AuthenticationPage sandboxPage;

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //goSandbox();
        sandboxPage = new AuthenticationPage(driver);
    }
    @BeforeMethod
    public  void goSandbox(){
        driver.get("https://qa-sandbox.apps.htec.rs/");
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
