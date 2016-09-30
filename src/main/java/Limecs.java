import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Limecs {


    @Before
    public void goToSiteAndContact() {
        Action.startDriver();
        Action.goToSite();
        Action.goToContact();
    }
    @Test
    public void checkSendContact() {
        Action.fillField(Data.getName(), Locators.getNamePath());
        Action.fillField(Data.getEmail(), Locators.getEmailPath());
        Action.fillField(Data.getMessage(), Locators.getMessagePath());
        Action.clickSendButton();
        Assert.assertFalse( Action.confirmMessage());
    }
    @After
    public void killerDriver() {
        Action.exitDriver();
    }

}

