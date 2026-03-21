import org.junit.Test;
import static org.junit.Assert.*;

class AssertJBugExampleTest {

    @Test
    public void testBug() {
        String actual = "actual value";
        String expected = "expected value";

        // TRIGGER BUG: AssertJ methods setting the assertion context should come before an assertion
        assertThat(actual).as("Description").isEqualTo(expected);
        assertThat(actual).withFailMessage("Fail message").isEqualTo(expected);
        assertThat(actual).usingComparator(new CustomComparator()).isEqualTo(expected);
    }
}