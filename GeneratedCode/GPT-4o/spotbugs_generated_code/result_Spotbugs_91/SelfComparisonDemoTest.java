import org.junit.Test;
import static org.junit.Assert.*;

public class SelfComparisonDemoTest {

    @Test
    public void testShowBug() {
        SelfComparisonDemo demo = new SelfComparisonDemo(5);
        boolean result = demo.showBug(); // TRIGGER BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
        assertFalse("The method compareValueWithItself should not be logically valid, it compares value with itself.", result); // TRIGGER BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }
}