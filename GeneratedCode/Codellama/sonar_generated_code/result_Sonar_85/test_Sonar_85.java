import org.junit.Test;

public class StringBugTest {

    @Test
    public void testGetReversedString() {
        StringBug stringBug = new StringBug();

        // TRIGGER BUG: Indexes to passed to "String" operations should be within the string's bounds
        String input = "hello";
        String output = stringBug.showBug(input);

        assertEquals(" olleh", output);
    }

    @Test
    public void testGetReversedString_emptyString() {
        StringBug stringBug = new StringBug();

        // TRIGGER BUG: Indexes to passed to "String" operations should be within the string's bounds
        String input = "";
        String output = stringBug.showBug(input);

        assertEquals("", output);
    }

    @Test
    public void testGetReversedString_nullString() {
        StringBug stringBug = new StringBug();

        // TRIGGER BUG: Indexes to passed to "String" operations should be within the string's bounds
        String input = null;
        String output = stringBug.showBug(input);

        assertEquals(null, output);
    }
}