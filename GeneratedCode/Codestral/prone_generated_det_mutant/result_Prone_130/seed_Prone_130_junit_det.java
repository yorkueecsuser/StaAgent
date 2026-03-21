import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
class BuggyCode {
    private int input;

    public BuggyCode(int input) {
        this.input = input;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {{1}, {2}, {3}});
    }

    @Test
    public void testInput() {
        System.out.println("Testing with input: " + input); // BUG: ParametersButNotParameterized
    }

    public void showBug() {
        testInput(); // This will always use the default input value as the test is not parameterized
    }
}