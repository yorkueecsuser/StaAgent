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
        testTheory(dataPoint);
    }
}