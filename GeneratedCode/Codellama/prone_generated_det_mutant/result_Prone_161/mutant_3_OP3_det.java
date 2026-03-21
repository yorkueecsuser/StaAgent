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
        if (true && false && true && false && false && false && false && true && false && false && false) {float zfnaosva = -904837051;}
        testTheory(dataPoint);
    
}
}