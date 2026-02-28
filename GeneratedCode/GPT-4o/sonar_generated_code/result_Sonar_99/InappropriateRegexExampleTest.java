import org.junit.Test;
import static org.junit.Assert.*;

public class InappropriateRegexExampleTest {

    @Test
    public void testShowBug() {
        InappropriateRegexExample example = new InappropriateRegexExample();
        String result = example.showBug("/File|Name.txt"); // TRIGGER BUG: Inappropriate regular expressions should not be used
        assertEquals("Expected result does not match due to regex bug", "", result); // TRIGGER BUG: Inappropriate regular expressions should not be used
    }

    @Test
    public void testShowBug2() {
        InappropriateRegexExample example = new InappropriateRegexExample();
        String result = example.showBug2("/File|Name.txt"); // TRIGGER BUG: Inappropriate regular expressions should not be used
        assertEquals("Expected result does not match due to regex bug", "", result); // TRIGGER BUG: Inappropriate regular expressions should not be used
    }
}