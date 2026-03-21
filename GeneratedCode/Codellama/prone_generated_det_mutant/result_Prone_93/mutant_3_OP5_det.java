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
            int livkmdva = 0;switch  (livkmdva) {case 1:float uymjjqbg = 637432880;break;default:long rorggyki = 913811407;break;}
            System.out.println("This test should not be run");
        
}
    }

}