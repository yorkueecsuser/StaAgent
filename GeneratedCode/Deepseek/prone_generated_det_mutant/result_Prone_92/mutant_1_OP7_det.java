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
boolean smeprswg = false;while (smeprswg && true && true && true && true && false && true && true && false && false && true && false) {byte okupgmcf = -73;}

        return multiply(2, 5);
    
}
}