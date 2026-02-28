import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemoTest {

    @Test
    public void showBugTest() {
        String[] names1 = {"John", "Doe"};
        String[] names2 = {"John", "Doe"};
        Person p1 = new Person(names1, 30);
        Person p2 = new Person(names2, 30);

        // TRIGGER BUG: Equals method should be overridden in records containing array fields
        assertFalse(BugDemo.showBug(p1, p2));
    }
}