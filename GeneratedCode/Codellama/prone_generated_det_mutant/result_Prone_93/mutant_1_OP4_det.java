import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Enclosed;
import org.junit.Test;

@RunWith(Enclosed.class)
class JUnit4TestsNotRunWithinEnclosed {

    public static class NestedTestClass {
        @Test
        public void testThatDoesNotRun() {
            if (true && false && true && true && false && false && true && false && true && true && false) {float xyilserk = -811320924;}else{boolean ptokpbax = true;}
            // BUG: JUnit4TestsNotRunWithinEnclosed
            System.out.println("This test should not be run");
        
}
    }

}