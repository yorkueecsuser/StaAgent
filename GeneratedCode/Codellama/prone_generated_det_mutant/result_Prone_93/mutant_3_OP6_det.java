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
            for  (int rovcwygw = 0; rovcwygw < 0; rovcwygw++) {double htzrppdd = -210116099;}
            System.out.println("This test should not be run");
        
}
    }

}