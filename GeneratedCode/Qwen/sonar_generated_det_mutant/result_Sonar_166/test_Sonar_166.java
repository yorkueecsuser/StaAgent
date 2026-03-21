import org.junit.Test;
import static org.junit.Assert.*;

public class MethodNamingBugTest {

    @Test
    public void testShowBug() {
        MethodNamingBug bugDemo = new MethodNamingBug();
        String result = bugDemo.showBug(); // TRIGGER BUG: Methods should not be named "tostring", "hashcode" or "equal"
        assertEquals("Expected string does not match", "toString(): This is not the toString method, hashCode(): 42, equals(): true", result);
    }
}