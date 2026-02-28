import org.junit.Test;
import static org.junit.Assert.*;

public class CloneExampleTest {

    @Test
    public void testShowBug() {
        CloneExample example = new CloneExample();
        CloneExample.Foo original = example.showBug(10);
        
        // Since clone() does not use super.clone(), it won't throw CloneNotSupportedException,
        // but it does not correctly clone the object hierarchy.
        CloneExample.Foo cloned = (CloneExample.Foo) original.clone(); // TRIGGER BUG: ProperCloneImplementation
        
        assertNotSame("Cloned object should not be the same instance as original", original, cloned);
        assertEquals("Cloned object should have the same value as original", original.getValue(), cloned.getValue());
        
        // This test will fail because the bug is that super.clone() is not called,
        // hence, it doesn't properly handle Object cloning as expected.
    }
}