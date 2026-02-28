import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexBugTest {
    
    @Test
    public void showBugTest() {
        // TRIGGER BUG: Regex alternatives should not be redundant
        String input = "abc";
        String pattern = "[ab]|a";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(input);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}