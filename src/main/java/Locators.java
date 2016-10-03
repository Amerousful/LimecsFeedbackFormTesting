import org.openqa.selenium.By;

public class Locators {

    private static String url = "http://www.limecs.co";
    private static By namepath = By.name("Name");
    private static By emailpath = By.name("Email");
    private static By messagepath = By.name("Message");
    private static By sendbuttonpath = By.id("comp-ifqyiqxmsubmit");
    private static By contactbuttonpath = By.id("comp-ifgtula72label");
    private static By confirmmessage = By.xpath("//[text()='Success! Message received.']");

    static String getUrl() {
        return url;
    }
    static By getNamePath() {
        return namepath;
    }
    static By getEmailPath() {
        return emailpath;
    }
    static By getMessagePath() {
        return messagepath;
    }
    static By getSendButtonPath() {
        return sendbuttonpath;
    }
    static By getContactButtonPath() {
        return contactbuttonpath;
    }
    static By getConfirmMessage() {
        return confirmmessage;
    }



}





