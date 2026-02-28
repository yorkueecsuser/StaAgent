import org.junit.Test;
import static org.junit.Assert.*;

public class OverrideBothEqualsAndHashcodeTest {
    @Test
    public void testEquals() {
        OverrideBothEqualsAndHashcode obj1 = new OverrideBothEqualsAndHashcode("John", 30);
        OverrideBothEqualsAndHashcode obj2 = new OverrideBothEqualsAndHashcode("Jane", 30);
        OverrideBothEqualsAndHashcode obj3 = new OverrideBothEqualsAndHashcode("John", 35);
        
        // Test case 1: Test that equal objects return true
        assertTrue(obj1.equals(obj1));
        // Test case 2: Test that non-equal objects return false
        assertFalse(obj1.equals(obj2));
        // Test case 3: Test that objects with different hash codes return false
        assertFalse(obj1.equals(obj3));
        
        // TRIGGER BUG: OverrideBothEqualsAndHashcode
        // Test case 4: Test that objects with the same hash code but different values return false
        assertFalse(obj1.equals(obj2));
    }
    
    @Test
    public void testHashCode() {
        OverrideBothEqualsAndHashcode obj1 = new OverrideBothEqualsAndHashcode("John", 30);
        OverrideBothEqualsAndHashcode obj2 = new OverrideBothEqualsAndHashcode("Jane", 30);
        OverrideBothEqualsAndHashcode obj3 = new OverrideBothEqualsAndHashcode("John", 35);
        
        // Test case 1: Test that objects with the same values return the same hash code
        assertEquals(obj1.hashCode(), obj2.hashCode());
        // Test case 2: Test that objects with different values return different hash codes
        assertNotEquals(obj1.hashCode(), obj3.hashCode());
        
        // TRIGGER BUG: OverrideBothEqualsAndHashcode
        // Test case 3: Test that objects with the same hash code but different values return the same hash code
        assertEquals(obj1.hashCode(), obj3.hashCode());
    }
    
    @Test
    public void testBoth() {
        OverrideBothEqualsAndHashcode obj1 = new OverrideBothEqualsAndHashcode("John", 30);
        OverrideBothEqualsAndHashcode obj2 = new OverrideBothEqualsAndHashcode("Jane", 30);
        OverrideBothEqualsAndHashcode obj3 = new OverrideBothEqualsAndHashcode("John", 35);
        
        // Test case 1: Test that equal objects return true for both equals and hashCode
        assertTrue(obj1.equals(obj1));
        assertEquals(obj1.hashCode(), obj1.hashCode());
        
        // Test case 2: Test that non-equal objects return false for both equals and hashCode
        assertFalse(obj1.equals(obj2));
        assertNotEquals(obj1.hashCode(), obj2.hashCode());
        
        // Test case 3: Test that objects with different hash codes return false for both equals and hashCode
        assertFalse(obj1.equals(obj3));
        assertNotEquals(obj1.hashCode(), obj3.hashCode());
        
        // TRIGGER BUG: OverrideBothEqualsAndHashcode
        // Test case 4: Test that objects with the same hash code but different values return false for both equals and hashCode
        assertFalse(obj1.equals(obj2));
        assertEquals(obj1.hashCode(), obj2.hashCode());
    }
}