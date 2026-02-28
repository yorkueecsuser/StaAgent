import org.junit.Test;
import static org.junit.Assert.*;

public class UnnecessaryBoxingUnboxingTest {

    @Test
    public void testShowBug() {
        UnnecessaryBoxingUnboxing obj = new UnnecessaryBoxingUnboxing();
        int result = obj.showBug();
        assertEquals(10, result); // TRIGGER BUG: Unnecessary boxing and unboxing should be avoided
    }
}