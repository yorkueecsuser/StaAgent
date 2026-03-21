import org.junit.runner.RunWith;
import org.junit.runners.Parameterized; // Required for @Parameters but not used correctly
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

class ExampleParametersButNotParameterized {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            { 1, 2, 3 },
            { 4, 5, 9 }
        });
    }

    @Test
    public void additionTest() {
        for (Object[] parameters : data()) {
            int a = (int) parameters[0];
            int b = (int) parameters[1];
            int expectedSum = (int) parameters[2];
            assert (a + b) == expectedSum;
        }
    }

    public void showBug() {
        // This method shows how the ParametersButNotParameterized bug manifests
        additionTest(); // BUG: ParametersButNotParameterized
    }
}