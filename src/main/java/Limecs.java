import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class Limecs {

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"myname", "test@gmail.com", "message"},
                {"myname", "test@", "message"}
        });
    }

    public void startDriver() {
        System.setProperty("webdriver.chrome.driver", "D://Selenium//chromedriver.exe");
    }
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);

    private String name;
    private String email;
    private String message;

    public Limecs (String name, String email, String message) {
        this.name = name;
        this.email = email;
        this.message = message;
    }


    public void clickButton(By fieldlocator) {
        elementWait(fieldlocator);
        WebElement element = driver.findElement(fieldlocator);
        element.click();
    }

    public void fillField(String fielddata, By fieldlocator) {
        elementWait(fieldlocator);
        WebElement element = driver.findElement(fieldlocator);
        element.sendKeys(fielddata);
    }

    public void goToSite(String url) {
        driver.get(url);
    }

    public void goToContact() {
        clickButton(By.id("comp-ifgtula72label"));
    }

    public boolean confirmMessage() {
       return elementPresent(By.xpath("//*[text()='Success! Message received.']") );
    }


    protected boolean elementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    protected boolean elementWait(By locator) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true;
        } catch (TimeoutException ex) {
            return false;
        }
    }

    public void assertConfirm() {
        Assert.assertFalse(confirmMessage());
    }

    public void exitDriver() {
        driver.quit();
    }


    @Before
    public void goToSiteAndContact() {
        startDriver();

        goToSite("http://www.limecs.co");
        goToContact();
    }

    @Test
    public void checkSendContact() {


        assertConfirm();
    }

    @After
    public void killerDriver() {
        exitDriver();
    }

}

