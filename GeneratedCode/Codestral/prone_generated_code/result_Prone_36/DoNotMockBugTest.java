import org.junit.Test;
import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class DoNotMockBugTest {

    @Test
    public void testReadInput() throws IOException {
        DoNotMockBug bug = new DoNotMockBug();
        String input = "Test Input";
        StringReader stringReader = new StringReader(input);
        BufferedReader bufferedReader = new BufferedReader(stringReader);

        // Setting the mocked BufferedReader object to the private field using reflection, to trigger "DoNotMock" bug
        try {
            java.lang.reflect.Field field = DoNotMockBug.class.getDeclaredField("reader");
            field.setAccessible(true);
            field.set(bug, bufferedReader);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        // TRIGGER BUG: DoNotMock
        assertEquals(input, bug.readInput());
    }

}