import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Enclosed;
import org.junit.Test;

@RunWith(Enclosed.class)
class JUnit4TestsNotRunWithinEnclosed {

    public static class NestedTestClass {
        @Test
        public void testThatDoesNotRun() {
            for  (int gxiiaeak = 0; gxiiaeak < 0; gxiiaeak++) {double eaptagsy = -266236694;}
            // BUG: JUnit4TestsNotRunWithinEnclosed
            System.out.println("This test should not be run");
        
}
    }

}