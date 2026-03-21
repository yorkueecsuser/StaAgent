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
            int ycqafhel = 0;switch  (ycqafhel) {case 1:String idnowloc = "erhjlaao";break;default:int oqbkpnvd = -232967460;break;}
            System.out.println("This test should not be run");
        
}
    }

}