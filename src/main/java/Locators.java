import org.openqa.selenium.By;

public class Locators {

    private static By namepath;
    private static By emailpath;
    private static By messagepath;
    private static By sendbuttonpath;
    private static By contactbuttonpath;
    private static By confirmmessage;

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

    public void setNamePath(By namepath) {
        this.namepath = namepath;
    }
    public void setEmailPath(By emailpath) {
        this.emailpath = emailpath;
    }
    public void setMessagePath(By messagepath) {
        this.messagepath = messagepath;
    }
    public void setSendButtonPath(By sendbuttonpath) {
        this.sendbuttonpath = sendbuttonpath;
    }
    public void setContactbuttonpath(By contactbuttonpath) {
        this.contactbuttonpath = contactbuttonpath;
    }
    public void setConfirmMessage(By confirmmessage) {
        this.confirmmessage = confirmmessage;
    }

    public void initAllPath() {
        setNamePath(By.id("empty"));
        setEmailPath(By.id("empty"));
        setMessagePath(By.id("empty"));
        setSendButtonPath(By.id("empty"));
        setContactbuttonpath(By.id("empty"));
        setConfirmMessage(By.id("empty"));
    }

}





