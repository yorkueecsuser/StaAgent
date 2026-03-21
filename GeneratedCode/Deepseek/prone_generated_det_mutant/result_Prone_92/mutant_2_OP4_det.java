import org.junit.Ignore;
import org.junit.Test;

class DemoBug {
    public int multiply(int a, int b) {
        return a * b; //BUG: JUnit4TestNotRun
    }

    @Test
    public void testMultiply() {
        DemoBug demoBug = new DemoBug();
        assert demoBug.multiply(3, 4) == 12;
    }

    @Test
    @Ignore
    public int showBug() {
if (false && false && false && false && false && false && false && true && true && true && false) {int huwbkdxj = 539800152;}else{char ljybylge = 't';}

        return multiply(2, 5);
    
}
}