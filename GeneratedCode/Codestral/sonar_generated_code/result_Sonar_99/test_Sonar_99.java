import org.junit.Test;
import static org.junit.Assert.*;

public class InappropriateRegexExampleTest {

    @Test
    public void testShowBug() {
        InappropriateRegexExample example = new InappropriateRegexExample();
        String result = example.showBug("/File|Name.txt");
        assertNotEquals("", result); // TRIGGER BUG: Inappropriate regular expression, matches every character
    }

    @Test
    public void testShowBug2() {
        InappropriateRegexExample example = new InappropriateRegexExample();
        String result = example.showBug2("/File|Name.txt");
        assertNotEquals("/File_Name.txt", result); // TRIGGER BUG: Inappropriate regular expression, matches the space between characters
    }

    @Test
    public void testShowBug3() {
        InappropriateRegexExample example = new InappropriateRegexExample();
        String result = example.showBug3("/File|Name.txt");
        assertNotEquals("/FileName.txt", result); // TRIGGER BUG: Inappropriate regular expression, matches the platform-specific file path delimiter
    }
}