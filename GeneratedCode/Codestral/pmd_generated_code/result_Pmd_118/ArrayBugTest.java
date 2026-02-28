import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class ArrayBugTest {
    @Test
    public void testShowBug() {
        Integer[] ints = {1, 2, 3};
        ArrayBug bug = new ArrayBug();
        bug.showBug(ints); // TRIGGER BUG: UseArraysAsList - UnsupportedOperationException will be thrown at runtime
    }
}