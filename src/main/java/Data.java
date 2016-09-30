import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.Arrays;
@RunWith(Parameterized.class)
public class Data {

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"myname", "test@gmail.com", "message"},
                {"myname", "test@", "message"}
        });
    }

    private static String name;
    private static String email;
    private static String message;

    public Data (String name, String email, String message) {
        this.name = name;
        this.email = email;
        this.message = message;
    }

    static String getName() {
        return name;
    }
    static String getEmail() {
        return email;
    }
    static String getMessage() {
        return message;
    }

}
