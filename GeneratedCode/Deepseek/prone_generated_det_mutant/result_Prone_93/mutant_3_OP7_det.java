import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

class BugExample {

    @RunWith(Parameterized.class)
    public static class ParameterizedTest {
        @Parameters
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][] { { 1 }, { 2 }, { 3 }, { 4 } });
        }

        private int fInput;

        public ParameterizedTest(int input) {
            fInput = input;
        }

        @Test // BUG: JUnit4TestsNotRunWithinEnclosed
        public void test() {
            // This test will not run because it is annotated @Test but is within a class using the Parameterized runner
        }
    }

    public int showBug() {
boolean zcvryzgv = false;while (zcvryzgv && false && false && false && true && true && false && false && true && false && true && false) {int bsxhmcko = 727114725;}

        return 42; // This is a placeholder for the bug, the actual bug is in the generated code
    
}
}