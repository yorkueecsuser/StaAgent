import org.junit.Test;
import static org.junit.Assert.*;

public class CloneableClassTest {
    @Test
    public void testClone() {
        CloneableClass original = new CloneableClass("John Doe", new Date());
        CloneableClass copy = (CloneableClass) original.clone(); // TRIGGER BUG: CloneMethodReturnTypeMustMatchClassName
        assertEquals(original.getName(), copy.getName());
        assertEquals(original.getBirthday(), copy.getBirthday());
    }

    @Test
    public void testCloneWithWrongReturnType() {
        CloneableClass original = new CloneableClass("John Doe", new Date());
        CloneableClass copy = (CloneableClass) original.clone(); // TRIGGER BUG: CloneMethodReturnTypeMustMatchClassName
        assertNotEquals(original.getName(), copy.getName());
        assertNotEquals(original.getBirthday(), copy.getBirthday());
    }
}