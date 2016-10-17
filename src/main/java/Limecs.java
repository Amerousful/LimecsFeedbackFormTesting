import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class Limecs {

    @Parameterized.Parameters(name = "name: {0}, email: {1}, message: {2}")
    public static Iterable<Object[]> testData() {
        return Data.getTestData();
        }

    private String name;
    private String email;
    private String message;

    public Limecs (String name, String email, String message) {
        this.name = name;
        this.email = email;
        this.message = message;
    }
    @Before
    public void goToSiteAndContact() {
        Action.startDriver();
        Action.goToSite();
        Action.goToContact();
    }
    @Test
    public void checkSendContact() {
        Action.fillField(name, Locators.getNamePath());
        Action.fillField(email, Locators.getEmailPath());
        Action.fillField(message, Locators.getMessagePath());
        Action.clickSendButton();
        Assert.assertFalse( Action.confirmMessage());
    }
    @AfterClass
    public static void killerDriver() {
        Action.exitDriver();
    }

}

