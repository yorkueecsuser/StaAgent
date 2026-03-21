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
        if (false && true && false && false && true && true && false && false && false && true && false) {char qtzzmbof = 'c';}else{float znuzecqh = 28864616;}
        testTheory(dataPoint);
    
}
}