import org.junit.Test;
import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class RegexSyntaxErrorExampleTest {

    @Test
    public void testShowBug() {
        RegexSyntaxErrorExample example = new RegexSyntaxErrorExample();

        // The following lines will trigger the bug as they contain invalid regex patterns
        Pattern.compile("(["); // TRIGGER BUG: Regular expressions should be syntactically valid
        "test".matches("(["); // TRIGGER BUG: Regular expressions should be syntactically valid
        "test".replaceAll("([", "{"); // TRIGGER BUG: Regular expressions should be syntactically valid
        "example-123".matches("(\\w+-(\\d+)"); // TRIGGER BUG: Regular expressions should be syntactically valid
    }
}