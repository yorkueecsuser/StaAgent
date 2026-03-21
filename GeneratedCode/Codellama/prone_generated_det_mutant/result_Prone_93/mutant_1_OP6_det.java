import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Enclosed;
import org.junit.Test;

@RunWith(Enclosed.class)
class JUnit4TestsNotRunWithinEnclosed {

    public static class NestedTestClass {
        @Test
        public void testThatDoesNotRun() {
            // BUG: JUnit4TestsNotRunWithinEnclosed
            for  (int khfaivsw = 0; khfaivsw < 0; khfaivsw++) {double ioasyalf = 786274681;}
            System.out.println("This test should not be run");
        
}
    }

}