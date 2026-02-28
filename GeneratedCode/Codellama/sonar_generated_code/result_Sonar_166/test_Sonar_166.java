import org.junit.Test;
import static org.junit.Assert.*;

class BuggyClassTest {
    @Test
    void testBuggyClass() {
        BuggyClass obj1 = new BuggyClass("John", 25);
        BuggyClass obj2 = new BuggyClass("Jane", 30);

        assertEquals("Name: John, Age: 25", obj1.tostring());
        assertEquals("Name: Jane, Age: 30", obj2.tostring());

        assertEquals(156423, obj1.hashcode());
        assertEquals(158430, obj2.hashcode());

        assertTrue(obj1.equal(obj2));
    }

    @Test
    void testBuggyClass_tostring() {
        BuggyClass obj1 = new BuggyClass("John", 25);
        assertEquals("Name: John, Age: 25", obj1.tostring());
    }

    @Test
    void testBuggyClass_hashcode() {
        BuggyClass obj1 = new BuggyClass("John", 25);
        assertEquals(156423, obj1.hashcode());
    }

    @Test
    void testBuggyClass_equal() {
        BuggyClass obj1 = new BuggyClass("John", 25);
        BuggyClass obj2 = new BuggyClass("Jane", 30);
        assertTrue(obj1.equal(obj2));
    }
}