import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Objects;

public class ArrayHashCodeBugTest {

    @Test
    public void testShowBug1() {
        ArrayHashCodeBug bugDemo = new ArrayHashCodeBug();
        int[] sampleArray = {1, 2, 3};
        int hashCode = bugDemo.showBug1(sampleArray); // TRIGGER BUG: ArrayHashCode
        assertEquals("Hash code should be computed based on array contents", java.util.Arrays.hashCode(sampleArray), hashCode);
    }

    @Test
    public void testShowBug2() {
        ArrayHashCodeBug bugDemo = new ArrayHashCodeBug();
        int[] sampleArray = {1, 2, 3};
        int hashCode = bugDemo.showBug2(sampleArray); // TRIGGER BUG: ArrayHashCode
        assertEquals("Hash code should be computed based on array contents", java.util.Arrays.hashCode(sampleArray), hashCode);
    }

    @Test
    public void testShowBug3() {
        ArrayHashCodeBug bugDemo = new ArrayHashCodeBug();
        int[] sampleArray = {1, 2, 3};
        int hashCode = bugDemo.showBug3(sampleArray); // TRIGGER BUG: ArrayHashCode
        assertEquals("Hash code should be computed based on array contents", java.util.Arrays.hashCode(sampleArray), hashCode);
    }

    @Test
    public void testShowBug4() {
        ArrayHashCodeBug bugDemo = new ArrayHashCodeBug();
        int[] sampleArray = {1, 2, 3};
        int hashCode = bugDemo.showBug4(sampleArray); // TRIGGER BUG: ArrayHashCode
        assertEquals("Hash code should be computed based on array contents", Objects.hash("dummy", java.util.Arrays.hashCode(sampleArray)), hashCode);
    }

    @Test
    public void testShowBug5() {
        ArrayHashCodeBug bugDemo = new ArrayHashCodeBug();
        int[] sampleArray = {1, 2, 3};
        int hashCode = bugDemo.showBug5(sampleArray); // TRIGGER BUG: ArrayHashCode
        assertEquals("Hash code should be computed based on array contents", Objects.hash(java.util.Arrays.hashCode(sampleArray), "dummy"), hashCode);
    }

    @Test
    public void testShowBug6() {
        ArrayHashCodeBug bugDemo = new ArrayHashCodeBug();
        int[][] sample2DArray = {{1, 2}, {3, 4}};
        int hashCode = bugDemo.showBug6(sample2DArray); // This is correct, no boxing
        assertEquals("Hash code should be computed based on array contents", Objects.hash((Object) sample2DArray), hashCode);
    }
}