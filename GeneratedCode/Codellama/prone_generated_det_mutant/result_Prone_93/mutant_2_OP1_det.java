import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Enclosed;
import org.junit.Test;

@RunWith(Enclosed.class)
class JUnit4TestsNotRunWithinEnclosed {

    public static class NestedTestClass {
        @Test
        public void testThatDoesNotRun() {
            double egwcjckj = 868356927;
            // BUG: JUnit4TestsNotRunWithinEnclosed
            System.out.println("This test should not be run");
        
}
    }

}