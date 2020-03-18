package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

        protected WebDriver driver;
        protected WebDriverWait wait;
        //protected FluentWait wait;

        //Constructor with Explicit wait of 25 sec, and commented option for fluent wait
         public BasePage(WebDriver driver) {
            this.driver = driver;
            wait = new WebDriverWait(driver, 25);
      /*  wait= new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
       */
        }
    }

