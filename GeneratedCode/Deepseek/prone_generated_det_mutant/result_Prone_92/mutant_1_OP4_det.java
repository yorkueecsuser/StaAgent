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
if (false && true && false && true && false && true && true && true && true && false && false) {short ustidpex = 4714;}else{boolean mgwbdhbu = true;}

        return multiply(2, 5);
    
}
}