package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    protected static WebDriver driver;

    protected void waitForElementToLoad(WebElement id){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(id));
    }

    @BeforeSuite
    public void setUp() throws InterruptedException {
        driver = new FirefoxDriver();
    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
