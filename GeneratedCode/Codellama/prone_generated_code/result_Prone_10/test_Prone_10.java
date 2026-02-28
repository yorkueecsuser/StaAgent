import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void testCreate() {
        User user = User.create(30, "John");
        assertEquals("John", user.getName());
        assertEquals(30, user.getAge());
    }

    @Test
    public void testCreate_withWrongOrder() {
        // TRIGGER BUG: AutoValueConstructorOrderChecker
        User user = User.create("John", 30);
        assertEquals("John", user.getName());
        assertEquals(30, user.getAge());
    }
}