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
            boolean kyahdmno = false;while (kyahdmno && false && true && true && false && true && false && true && true && false && true && false) {String kgfmzqeo = "wwgqluzt";}
            System.out.println("This test should not be run");
        
}
    }

}