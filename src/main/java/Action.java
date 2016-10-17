import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action {
    private static final Logger log = Logger.getLogger(Action.class);

    static public void startDriver() {
        System.setProperty("webdriver.chrome.driver", "D://Selenium//chromedriver.exe");
    }
    static WebDriver driver = new ChromeDriver();
    static WebDriverWait wait = new WebDriverWait(driver, 10);

    static public void goToSite() {
        driver.get(Locators.getUrl());
    }
    static public void goToContact() {
        clickButton(Locators.getContactButtonPath());
    }
    static public void fillField(String fielddata, By fieldlocator) {
        elementWait(fieldlocator);
        WebElement element = driver.findElement(fieldlocator);
        element.sendKeys(fielddata);
    }
    static public void clickSendButton() {
        clickButton(Locators.getSendButtonPath());
    }
    static public void clickButton(By fieldlocator) {
        elementWait(fieldlocator);
        WebElement element = driver.findElement(fieldlocator);
        element.click();
    }
    static public boolean confirmMessage() {
        return elementWait(Locators.getConfirmMessage());
    }

    static protected boolean elementWait(By locator) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true;
        } catch (TimeoutException ex) {
            log.error("Time of occurrence of the element: " + locator + " is over");
            return false;
        }
    }
    static public void exitDriver() {
        driver.quit();
    }
}
