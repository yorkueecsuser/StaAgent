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
            if (false && false && false && false && false && true && true && true && false && false && false) {short gvkwmcis = -2282;}
            System.out.println("This test should not be run");
        
}
    }

}