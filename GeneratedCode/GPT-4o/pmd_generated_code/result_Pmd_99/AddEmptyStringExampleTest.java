import org.junit.Test;
import static org.junit.Assert.*;

public class AddEmptyStringExampleTest {

    @Test
    public void testShowBug() {
        AddEmptyStringExample example = new AddEmptyStringExample();
        String result = example.showBug(123); // TRIGGER BUG: AddEmptyString
        assertEquals("123", result);
    }

    @Test
    public void testShowBug2() {
        AddEmptyStringExample example = new AddEmptyStringExample();
        String result = example.showBug2(456.78); // TRIGGER BUG: AddEmptyString
        assertEquals("456.78", result);
    }

    @Test
    public void testShowBug3() {
        AddEmptyStringExample example = new AddEmptyStringExample();
        String result = example.showBug3('A'); // TRIGGER BUG: AddEmptyString
        assertEquals("A", result);
    }
}