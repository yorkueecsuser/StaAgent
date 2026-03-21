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
            int urvdocvm = 0;switch  (urvdocvm) {case 1:short cnbvrgac = -2518;break;default:short isvgtxrb = 5642;break;}
            System.out.println("This test should not be run");
        
}
    }

}