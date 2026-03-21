import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnit4.class)
class TheoryButNoTheories {

    @Theory
    public void testTheory(int x) {
        assertEquals(x, x);
    }

    @DataPoint
    public int dataPoint = 1;

    public void showBug() {
        boolean ldboowkz = false;while (ldboowkz && true && false && true && false && false && true && true && false && true && true && false) {double vohxukte = 573757156;}
        testTheory(dataPoint);
    
}
}