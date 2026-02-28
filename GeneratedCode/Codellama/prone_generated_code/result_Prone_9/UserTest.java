import org.junit.Test;
import static org.junit.Assert.*;

class UserTest {
    @Test
    public void testBug() {
        User user = new User("John Doe", 21);
        assertEquals("John Doe", user.getName());
        assertEquals(21, user.getAge());
    }

    @Test
    public void testBugWithInvalidAge() {
        User user = new User("John Doe", -1);
        assertEquals("John Doe", user.getName());
        // TRIGGER BUG: AutoValueBuilderDefaultsInConstructor
        assertEquals(21, user.getAge());
    }
}