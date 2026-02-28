import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;

public class BuggyRegexTest {
    @Test
    public void testBuggyRegex() {
        String str = "/File|Name.txt";

        String clean = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used
        String clean2 = str.replaceAll("|", "_"); // BUG: Inappropriate regular expressions should not be used
        String clean3 = str.replaceAll(File.separator, ""); // BUG: Inappropriate regular expressions should not be used

        assertEquals("", clean); // TRIGGER BUG: Inappropriate regular expressions should not be used
        assertEquals("_/_F_i_l_e_|_N_a_m_e_._t_x_t_", clean2); // TRIGGER BUG: Inappropriate regular expressions should not be used
        assertEquals("", clean3); // TRIGGER BUG: Inappropriate regular expressions should not be used
    }
}