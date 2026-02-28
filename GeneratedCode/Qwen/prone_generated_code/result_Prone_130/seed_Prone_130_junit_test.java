import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
class ParameterBugExample {

    private int input;
    private int expectedOutput;

    public ParameterBugExample(int input, int expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            { 1, 2 },
            { 2, 4 },
            { 3, 6 }
        });
    }

    @Test
    public void buggyTest() {
        assert input * 2 == expectedOutput; // BUG: ParametersButNotParameterized
    }

    public int showBug(int input) {
        return input * 2; // This method demonstrates the bug by not using parameterized inputs
    }
}