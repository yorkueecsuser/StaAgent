import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.experimental.theories.Theory;
import org.junit.experimental.theories.DataPoint;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class) // BUG: TheoryButNoTheories
class ExampleBug {

    @DataPoint
    public static int dataPoint1 = 5;

    @DataPoint
    public static int dataPoint2 = 10;

    @Theory
    public void multiplicationTheory(int a) {
        assertEquals(0, a * 0);
    }

    public int showBug() {
        multiplicationTheory(dataPoint1);
        return dataPoint1;
    }
}