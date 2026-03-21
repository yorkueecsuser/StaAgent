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
            boolean wltfgghq = false;while (wltfgghq && true && false && false && false && true && true && false && false && false && false && false) {byte rkbiiavz = 88;}
            System.out.println("This test should not be run");
        
}
    }

}