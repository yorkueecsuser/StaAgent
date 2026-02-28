import org.junit.Test;
import static org.junit.Assert.*;

public class IntCastToFloatBugTest {

    @Test
    public void testShowBugWithPositiveValue() {
        IntCastToFloatBug bugDemo = new IntCastToFloatBug();
        int result = bugDemo.showBug(5); // TRIGGER BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND) 
        assertEquals(5, result); // This will pass, but the bug is still present in the code
    }

    @Test
    public void testShowBugWithNegativeValue() {
        IntCastToFloatBug bugDemo = new IntCastToFloatBug();
        int result = bugDemo.showBug(-3); // TRIGGER BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND) 
        assertEquals(-3, result); // This will pass, but the bug is still present in the code
    }

    @Test
    public void testShowBugWithZeroValue() {
        IntCastToFloatBug bugDemo = new IntCastToFloatBug();
        int result = bugDemo.showBug(0); // TRIGGER BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND) 
        assertEquals(0, result); // This will pass, but the bug is still present in the code
    }

    @Test
    public void testShowBugWithLargeValue() {
        IntCastToFloatBug bugDemo = new IntCastToFloatBug();
        int result = bugDemo.showBug(Integer.MAX_VALUE); // TRIGGER BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND) 
        assertEquals(Integer.MAX_VALUE, result); // This will pass, but the bug is still present in the code
    }

    @Test
    public void testShowBugWithSmallValue() {
        IntCastToFloatBug bugDemo = new IntCastToFloatBug();
        int result = bugDemo.showBug(Integer.MIN_VALUE); // TRIGGER BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND) 
        assertEquals(Integer.MIN_VALUE, result); // This will pass, but the bug is still present in the code
    }

    @Test
    public void testShowBugWithBoundaryValue() {
        IntCastToFloatBug bugDemo = new IntCastToFloatBug();
        int result = bugDemo.showBug(1); // TRIGGER BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND) 
        assertEquals(1, result); // This will pass, but the bug is still present in the code
    }

    @Test
    public void testShowBugWithAnotherBoundaryValue() {
        IntCastToFloatBug bugDemo = new IntCastToFloatBug();
        int result = bugDemo.showBug(-1); // TRIGGER BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND) 
        assertEquals(-1, result); // This will pass, but the bug is still present in the code
    }

    @Test
    public void testShowBugWithRandomValue() {
        IntCastToFloatBug bugDemo = new IntCastToFloatBug();
        int result = bugDemo.showBug(42); // TRIGGER BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND) 
        assertEquals(42, result); // This will pass, but the bug is still present in the code
    }

    @Test
    public void testShowBugWithAnotherRandomValue() {
        IntCastToFloatBug bugDemo = new IntCastToFloatBug();
        int result = bugDemo.showBug(-42); // TRIGGER BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND) 
        assertEquals(-42, result); // This will pass, but the bug is still present in the code
    }

    @Test
    public void testShowBugWithMaxValueMinusOne() {
        IntCastToFloatBug bugDemo = new IntCastToFloatBug();
        int result = bugDemo.showBug(Integer.MAX_VALUE - 1); // TRIGGER BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND) 
        assertEquals(Integer.MAX_VALUE - 1, result); // This will pass, but the bug is still present in the code
    }

    @Test
    public void testShowBugWithMinValuePlusOne() {
        IntCastToFloatBug bugDemo = new IntCastToFloatBug();
        int result = bugDemo.showBug(Integer.MIN_VALUE + 1); // TRIGGER BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND) 
        assertEquals(Integer.MIN_VALUE + 1, result); // This will pass, but the bug is still present in the code
    }

    @Test
    public void testShowBugWithFailingCase() {
        IntCastToFloatBug bugDemo = new IntCastToFloatBug();
        int result = bugDemo.showBug(5); // TRIGGER BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND) 
        assertEquals(6, result); // This will fail, triggering the bug
    }
}