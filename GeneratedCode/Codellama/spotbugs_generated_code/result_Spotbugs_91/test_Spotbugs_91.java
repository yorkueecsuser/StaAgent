import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    private int field1;
    private int field2;

    @Test
    public void testShowBug() {
        field1 = 1;
        field2 = 2;

        if (field1 == field1) { // TRIGGER BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
            System.out.println("field1 and field1 are equal");
        } else {
            System.out.println("field1 and field1 are not equal");
        }
    }
}