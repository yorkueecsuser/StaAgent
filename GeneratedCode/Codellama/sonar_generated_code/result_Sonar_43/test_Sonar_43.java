import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class RegExBugTest {
    @Test
    public void testRegExBug() {
        String str = "This is a string with a [ in it";
        Pattern pattern = Pattern.compile("(["); // TRIGGER BUG: Regular expressions should be syntactically valid
        boolean matches = pattern.matcher(str).matches();
        System.out.println(matches);
    }
}