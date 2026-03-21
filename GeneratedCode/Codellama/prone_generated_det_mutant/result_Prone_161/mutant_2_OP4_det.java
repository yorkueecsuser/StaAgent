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
        if (false && false && true && false && true && false && false && false && true && false && false) {int guwcfbdj = 279278259;}else{short krexmmsy = -6055;}
        testTheory(dataPoint);
    
}
}