import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {

    @Test
    // TRIGGER BUG: Inappropriate regular expressions should not be used
    public void testShowBug() {
        String str = "/File|Name.txt";

        String clean = str.replaceAll("\\.",""); // TRIGGER BUG: Inappropriate regular expressions should not be used
        String clean2 = str.replaceAll("\\|","_"); // TRIGGER BUG: Inappropriate regular expressions should not be used
        String clean3 = str.replaceAll("/",""); // TRIGGER BUG: Inappropriate regular expressions should not be used

        String clean4 = str.replaceFirst("\\.",""); // TRIGGER BUG: Inappropriate regular expressions should not be used
        String clean5 = str.replaceFirst("\\|","_"); // TRIGGER BUG: Inappropriate regular expressions should not be used
        String clean6 = str.replaceFirst("/",""); // TRIGGER BUG: Inappropriate regular expressions should not be used

        assertEquals(clean, "File|Name.txt");
        assertEquals(clean2, "/File_Name.txt");
        assertEquals(clean3, "/ileName.txt");

        assertEquals(clean4, "/ile|Name.txt");
        assertEquals(clean5, "/_ileName.txt");
        assertEquals(clean6, "/ileName.txt");
    }
}