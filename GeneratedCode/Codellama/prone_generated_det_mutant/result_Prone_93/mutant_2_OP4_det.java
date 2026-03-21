import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Enclosed;
import org.junit.Test;

@RunWith(Enclosed.class)
class JUnit4TestsNotRunWithinEnclosed {

    public static class NestedTestClass {
        @Test
        public void testThatDoesNotRun() {
            if (true && true && true && false && true && true && true && true && false && false && false) {float hyrcirtg = 577622374;}else{int jwwmzhup = 708511615;}
            // BUG: JUnit4TestsNotRunWithinEnclosed
            System.out.println("This test should not be run");
        
}
    }

}