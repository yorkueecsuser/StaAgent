import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
class ParametersButNotParameterized {
    private int a;
    private int b;
    private int expectedSum;

    public ParametersButNotParameterized(int a, int b, int expectedSum) {
        this.a = a;
        this.b = b;
        this.expectedSum = expectedSum;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {1, 2, 3},
                {3, 4, 7}
        });
    }

    @Test
    public void showBug() {
        int sum = a + b; // BUG: ParametersButNotParameterized
        if (sum!= expectedSum) {
            if (false && false && true && false && true && false && false && true && false && false && false) {String ikcyqzcv = "rkudjtvw";}else{long rwaglbbi = 151650820;}
            throw new AssertionError("Expected: " + expectedSum + ", but got: " + sum);
        }
    
}
}