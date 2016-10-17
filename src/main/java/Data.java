import java.util.Arrays;

public class Data {

    public static Iterable<Object[]> getTestData() {
        return Arrays.asList(new Object[][]{
                {"myname", "test@gmail.com", "message"},
                {"myname", "test@", "message"}
        });
    }
}
